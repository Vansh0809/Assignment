package com.cg.l4.p2;

import com.cg.l4.bean.Account;

public class Current extends Account{
	int overdraft=500;
	public void withdraw(double w)
	{
		if(super.balance-w>overdraft)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
