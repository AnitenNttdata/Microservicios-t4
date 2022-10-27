package com.nttdata.bootcamp;


import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.nttdata.bootcamp.taller2.Product;
import com.nttdata.bootcamp.taller2.Tax;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
    	
    	/* Obtener los que empiezan con C
    	 * 
    	 * stream: secuencia de objetos que admite varios metodos
    	 */
    	String lista= shopping.stream() 
    			         .filter(n-> n.name.startsWith("C")) // Filtrar x letra C
    			         .sorted((n,m) -> n.name.compareToIgnoreCase(n.name)) // Ordenar
    			         .map(n-> n.name)     //Obtener valores
    			         .collect(Collectors.joining(",")); //mostrar collección separada x coma
    	
    	System.out.println("Los que empiezan con C son: " + lista );
        
    	/* Obtener el precio total mas IVA
    	 * 
    	 * mapToDouble: convertir Big decimal to Double
    	 */
    	Double results= shopping.stream()
    			.mapToDouble(result->result.price.doubleValue()+(result.tax.percent*result.price.doubleValue()/100)).sum();
    			
    	System.out.println("El coste toal es " + results);
    }
    	
}
