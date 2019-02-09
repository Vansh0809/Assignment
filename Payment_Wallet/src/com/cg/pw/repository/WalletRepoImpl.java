package com.cg.pw.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.pw.bean.Customer;

public class WalletRepoImpl implements WalletRepo {
	Customer customer=new Customer();
	Map<String, Customer> hashmap=new HashMap<>();

	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		if(hashmap.containsKey(customer.getMobileno()))
		{
			return false;
		}
		else
		{
			hashmap.put(customer.getMobileno(), customer);
			return true;
		}		
	}

	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		for(Entry<String, Customer> entry: hashmap.entrySet())
		{
			if(entry.getKey().equals(mobileNo))
				return entry.getValue();
		}
		return null;
		
	}

}
