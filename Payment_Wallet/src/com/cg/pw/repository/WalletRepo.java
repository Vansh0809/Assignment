package com.cg.pw.repository;

import com.cg.pw.bean.Customer;

public interface WalletRepo {
	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);

}
