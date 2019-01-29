package com.cg.l3.bean;

import java.util.Scanner;

public class PositiveString {
	public static boolean order(String s1)
	{
		for(int i = 0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)>s1.charAt(i+1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1 ;
		int i;
		System.out.println("Enter a string: ");
		s1=s.nextLine();
		System.out.println(order(s1.toLowerCase()));

	}

}
