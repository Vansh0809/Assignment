package com.capgemini.lesson21;

import java.util.*;
import java.util.stream.Stream;




public class ComparableLambda {

	public static void main(String[] args) {

		Comparator<String> comp =
				(s1, s2) -> Integer.compare(
				s1.length(), s2.length());
		
		
		String[] values = {"****","***","*","**"};
		List<String> list =  Arrays.asList(values);
		
		Collections.sort(list,comp);
		
		/*for(String value:values) {
			System.out.println(value);
		}*/
		
		Stream<String> stream = list.stream();
		
		//stream.forEach(value->System.out.println(value));
		
		stream.forEach(System.out::println);
	}
}
