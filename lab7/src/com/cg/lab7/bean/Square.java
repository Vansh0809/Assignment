package com.cg.lab7.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class Square {
	public static HashMap getSquares(int[] a1)
	{
		HashMap<Integer, Integer> m2=new HashMap<>();
		for(int n:a1)
		{
			m2.put(n, n*n);
		}
		return m2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		HashMap<Integer, Integer> m=getSquares(a);
		Iterator<Integer> i=m.keySet().iterator();
		while(i.hasNext())
		{
			Integer key=i.next();
			System.out.println(key+","+m.get(key));
		}
		

	}

}
