package com.nttdata.bootcamp.microservicet4weblux;

public class Subscriber {

	public static void print(Integer n) {

		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Subscriber 1: " + n);

	}

}
