package com.cg.l4.bean;

public class Account {
	private long accNum;
     protected double balance;
	private String accHolder;
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	
   public void deposit(double d)
   {
	   balance=balance+d;
   }
   public void withdraw(double w)
   {
	   if(balance>500)
	   {
		   balance=balance-w;
	   }
	   else
	   {
		   System.out.println("Not enough balance");
	   }
   }
   public double getBalance()
   {
	   return balance;
   }
   public String toString()
   {
	   return accNum + " " + balance + " " + " " + accHolder;
   } 
   class Person extends Account
   {
	   private String name;
	   private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String toString()
	   {
		   return name + " " + age;
	   }   
   }
   
}
