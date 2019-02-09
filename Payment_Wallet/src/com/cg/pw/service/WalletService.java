package com.cg.pw.service;

import java.math.BigDecimal;

import com.cg.pw.bean.Customer;
import com.cg.pw.bean.Wallet;

public interface WalletService {
		public Customer createAccount(String name, String mobileno, Wallet wallet) ;
		
		public BigDecimal showbalance(String mobileno);
		
	    public Customer withdraw(String mobileno, BigDecimal amount);
		
		public Customer deposit(String mobileno,BigDecimal amount);
		
		public Customer fundTransfer(String sourcemobileno,String targetmobileno, BigDecimal amount );
		
	
		
		
		
		

	

}
