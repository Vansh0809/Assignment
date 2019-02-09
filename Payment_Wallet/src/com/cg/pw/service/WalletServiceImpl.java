package com.cg.pw.service;

import java.math.BigDecimal;

import com.cg.pw.bean.Customer;
import com.cg.pw.bean.Wallet;
import com.cg.pw.repository.WalletRepoImpl;

public class WalletServiceImpl implements WalletService{
	private WalletRepoImpl repository;
	
	public WalletServiceImpl(WalletRepoImpl repository) {
		super();
		this.repository = repository;
	}

	
	
	
	//CREATE ACCOUNT
	@Override
	public Customer createAccount(String name, String mobileno, Wallet wallet) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(name,mobileno,wallet);
		if(repository.save(customer))
		{
			return customer;
		}
		
		return null;
	}
	
	

	//SHOW BALANCE
	@Override
	public BigDecimal showbalance(String mobileno) {
		// TODO Auto-generated method stub
		
		
		return repository.findOne(mobileno).getWallet().getBalance();
	}
	
	
	
	
	//WITHDRAW AMOUNT
	@Override
	public Customer withdraw(String mobileno, BigDecimal amount) {
		// TODO Auto-generated method stub
		
		Customer customer=repository.findOne(mobileno);
		Wallet wallet=customer.getWallet();
		if(wallet.getBalance().compareTo(amount)==-1)
		{
			return null;
		}
		wallet.setBalance(wallet.getBalance().subtract(amount));
		customer.setWallet(wallet);
		return customer;
	}
	
	
	
	
    //DEPOSIT AMOUNT
	@Override
	public Customer deposit(String mobileno, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=repository.findOne(mobileno);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		customer.setWallet(wallet);
		return customer;
		}
	
	

	
	//FUND TRANSFER
	@Override
	public Customer fundTransfer(String sourcemobileno, String targetmobileno, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=repository.findOne(sourcemobileno);
		withdraw(sourcemobileno, amount);
		deposit(targetmobileno, amount);
		return customer;
	}

	

}
