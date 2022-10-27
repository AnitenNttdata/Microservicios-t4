package com.nttdata.bootcamp;



import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MicroserviceT4ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceT4ReactiveApplication.class, args);
		
		// Publisher 
		/*<String> messageSender = Flux.just(" mensaje1"," mensaje1"," mensaje1");
		
		messageSender.subscribe(subscribe -> System.out.println("Observer 1.Subscribe."),
		                        next ->System.out.println("Observer1.Received" + t),
		                        error ->System.out.println("Observer1.Error:" + e.getMessage()),
		                        completed ->System.out.println("Observer1.Competed"));*/
		
		
		Stream<String> stream = Stream.of("red", "white", "blue");
		Stream<String> upper = stream.map(value -> {
		    System.out.println(value);
		    return value.toUpperCase();
		});
		
		
           	
	}

}
