package com.nttdata.bootcamp;

import java.util.List;

public class ListFunc {
	
	 List<Integer> numeros= List.of(18, 6, 4, 15 ,55, 78, 12, 9, 8);
       
     Long contador= numeros.stream().filter(num -> num>10).count();

}

