package com.cg.demoproject.bean;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpSalary()==o2.getEmpSalary())
		{
		return 0;
		}else if(o1.getEmpSalary()>o2.getEmpSalary())
		{return 1;
		}else {return -1;}
	} 

}
