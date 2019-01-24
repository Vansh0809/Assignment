package com.cg.p1.bean;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Divya", "Bharathi",Gender.F, "12345");
		System.out.println("First name is " + p1.getFirstname());
		System.out.println("Last name is " + p1.getLastname());
		System.out.println("Gender is " + p1.getGender());
		System.out.println("Num is " + p1.getMobileno());
	}

}
