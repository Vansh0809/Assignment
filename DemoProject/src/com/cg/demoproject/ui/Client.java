package com.cg.demoproject.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

import com.cg.demoproject.bean.Employee;
import com.cg.demoproject.bean.SortBySalary;

public class Client {

	public static void main(String[] args) {
		
		/*List<Employee> empList=new ArrayList();
		
		empList.add(new Employee(100,"Manisha",45000));
		empList.add(new Employee(101,"Asha",40000));
		System.out.println("Before Sort");
		for(Employee e:empList)
		{
			System.out.println(e);
		}
		
		
		Collections.sort(empList,new SortBySalary());
		
		System.out.println("After Sorting by Salary");
		for(Employee e:empList)
		{
			System.out.println(e);
		}*/
		
		
		
		/*Set<String> myList=new TreeSet<>();
		myList.add("Manisha");
		myList.add("Asha");
		myList.add("Varsha");
		
		for(String name:myList)
		{
			
			System.out.println("\n Before sort.." + name);
		}
		*/
		
		/*Collections.sort(myList);
		
		for(String name:myList)
		{
			
			System.out.println(name);
		}*/
		
		//BySalary
		Set<Employee> mySet=new TreeSet(new SortBySalary());
		mySet.add(new Employee(100,"Manisha",45000));
		mySet.add(new Employee(101,"Asha",30000));
		mySet.add(new Employee(103,"Nitin",40000));
		mySet.add(new Employee(104,"Akash",27000));
		
		for(Employee e:mySet)
		{
			System.out.println(e);
		}
		
		System.out.println("------------------------------------------------------------------");
		//ByName
		Set<Employee> mySet2=new TreeSet();
		mySet2.add(new Employee(100,"Manisha",45000));
		mySet2.add(new Employee(101,"Asha",30000));
		mySet2.add(new Employee(103,"Nitin",40000));
		mySet2.add(new Employee(104,"Akash",27000));
		
		for(Employee e:mySet2)
		{
			System.out.println(e);
		}
		
		
	}

}
