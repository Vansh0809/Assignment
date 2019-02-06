package com.cg.lab7.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
	public void getArray()
	{
		int i;
		int s[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be added");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		StringBuilder sb=new StringBuilder();
		for(i=0;i<n;i++)
		{
			sb.append(s[i]);
			sb.append("\n");
		}
		sb.reverse();
		String[] s2=sb.toString().split("\n");
		ArrayList<String> ar=new ArrayList<String>(Arrays.asList(s2));
		Collections.sort(ar);
		System.out.println(ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingArray obj=new SortingArray();
		obj.getArray();

	}

}
