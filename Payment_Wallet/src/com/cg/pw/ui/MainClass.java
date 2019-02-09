package com.cg.pw.ui;

import java.math.BigDecimal;

import com.cg.pw.bean.Wallet;
import com.cg.pw.repository.WalletRepoImpl;
import com.cg.pw.service.WalletService;
import com.cg.pw.service.WalletServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WalletService walletservice=new WalletServiceImpl(new WalletRepoImpl());
		System.out.println(walletservice.createAccount("VANSH", "9876543210", new Wallet(new BigDecimal(50000))));
		System.out.println("____________________________________________________________________________________");
		System.out.println(walletservice.createAccount("Katrina", "6565657475", new Wallet(new BigDecimal(40000))));
		System.out.println("____________________________________________________________________________________");
		System.out.println(walletservice.createAccount("Sidharth", "1234512345", new Wallet(new BigDecimal(30000))));
		System.out.println("____________________________________________________________________________________");
		
		System.out.println(walletservice.showbalance("9876543210"));
		System.out.println("____________________________________________________________________________________");
		System.out.println(walletservice.deposit("6565657475",new BigDecimal(5000)));
		System.out.println("____________________________________________________________________________________");
		System.out.println(walletservice.withdraw("1234512345",new BigDecimal(6000)));
		System.out.println("____________________________________________________________________________________");
		System.out.println(walletservice.fundTransfer("1234512345","9876543210",new BigDecimal(10000)));
		System.out.println("____________________________________________________________________________________");
		
	}

}
