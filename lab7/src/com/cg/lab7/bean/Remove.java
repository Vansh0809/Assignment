package com.cg.lab7.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
	
	public ArrayList removeElements(ArrayList l1,ArrayList l2)
	{
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scanner.nextInt();
		
		
		
		System.out.println("Enter elements for first list");
		for(i=0;i<n;i++)
		{
			l1.add(scanner.nextLine());
		}
		
		System.out.println("Enter elements for second list");
		for(i=0;i<n;i++)
		{
			l2.add(scanner.nextLine());
		}
		l1.removeAll(l2);
		
		return l1;
		
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<>();
		ArrayList<String> l2=new ArrayList<>();
        Remove obj=new Remove();
        obj.removeElements(l1,l2);
        System.out.println(l1);
        
	}

}
