package com.cg.p1.bean;

public class Person {

	public Person()
	{
		super();
	}
	private String firstname;
	private String lastname;
	private Gender gender;
	private String mobileno;
	
	public Person(String firstname, String lastname, Gender gender, String mobileno) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	

}
