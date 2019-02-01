package com.capgemini.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionLambda {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Chennai");
		
	//	List<String> cities1=Arrays.asList("pune","bangalore");
		Consumer<String> consumer =
				(city->System.out.println(city));
				
		//cities.forEach((city->System.out.println(city));
		//cities.forEach(System.out::println);
		
				cities.forEach(consumer);
	}
}
