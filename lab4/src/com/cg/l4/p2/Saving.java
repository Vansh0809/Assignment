package com.cg.l4.p2;

import com.cg.l4.bean.Account;

public class Saving extends Account{
	final int minbal=500;
	public void withdraw(double w)
	{
		if(super.balance-w>minbal)
		{
			System.out.println("Withdra Possible");
		}
		else {
			System.out.println("Withdraw not possible");
		}
	}

}
