package com.cg.demoproject.ui;
import java.util.*;

import com.cg.demoproject.bean.Employee;
import com.cg.demoproject.bean.Student;

public class GenericsImpl {

	public static void main(String[] args) {
		
		List<Employee> myList=new ArrayList();
		/*myList.add("Capgemini");
		myList.add("Cognizant");
		myList.add("Syntel");
		myList.add(new Integer(10));*/
		myList.add(new Employee());
		myList.add(new Employee(101,"Bhushan",45000));
		//myList.add(new Student());
		

		
		
		for(Employee o:myList) {
			//Employee e=(Employee)o;
			o.display();
			}




	}

}
