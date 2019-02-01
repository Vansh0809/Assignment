package com.capgemini.lesson21;

import java.util.function.Supplier;

public class ContructorReference {

	public static void main(String[] args) {
		
		Supplier<Item> s1 = Item::new;
		
	//	Item item = new Item();above line means this line
		
		
		
		Item item = s1.get();

		System.out.println(item.getName());
		
		System.out.println(s1.get().getPrice());

		
	}
}
