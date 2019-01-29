package com.cg.l4.p2;
import com.cg.l4.bean.Account;
public class Maintwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		Account a2=new Account();
		
		a1.setBalance(2000);
		a1.setAccHolder("Smith");
		a1.deposit(2000);
		a2.setBalance(3000);
		a2.setAccHolder("Kathy");
		a2.withdraw(2000);
		
		System.out.println("Account holder is: " +a1.getAccHolder());
		System.out.println("Updated details: " +a1.getBalance());
		System.out.println("--------------------------------------");
		System.out.println("Account holder is: " +a2.getAccHolder());
		System.out.println("Updated details : " +a2.getBalance());
		System.out.println("--------------------------------------");
		System.out.println(a1);
		System.out.println(a2);
		Saving s=new Saving();
		Current c= new Current();
        
		s.withdraw(0);
		c.withdraw(0);
	}

}
