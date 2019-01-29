package com.cg.l3.bean;

import java.util.Scanner;

public class Job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int str=s1.length();
		if(str>=12)
		{
			if(s1.substring(str-4,str).equals("_job"))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			
		}
		else
		{
			System.out.println("False");
		}

	}

}
