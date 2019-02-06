package com.cg.lab7.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Products {
	public ArrayList Sorts(ArrayList l1)
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=s.nextInt();
		System.out.println("Enter elements");
		for (i=1;i<=n;i++)
		{
			l1.add(s.next());
		}
		Collections.sort(l1);
		return l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products obj=new Products();
		ArrayList<String> l1=new ArrayList<>();
		obj.Sorts(l1);
		System.out.println(l1);

	}

}
