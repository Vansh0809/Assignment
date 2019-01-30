package com.cg.l3.bean;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1;
		int ch,i,j, x=0;
		System.out.println("Enter string");
		s1=s.nextLine();
		System.out.println("Entered string is: " +s1);
		System.out.println("Enter choices from 1 to 4");
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			   String s2=s1.concat(s1);
			   System.out.println("The processed string is: " +s2);
			   break;
		case 2: 
			   char c[]=s1.toCharArray();
			   for(i=0;i<s1.length();i++)
			   {
				   if(i%2==0)
				   {
					   c[i]='#';
				   }
			   }
				   String s3= new String(c);
			   System.out.println("After replacement: " +s3);
			   
		       
			   break;
		case 3: char e[]=s1.toCharArray();
		        char a[]=new char[50];
		        for(i=0;i<s1.length();i++)
		       {
			    for(j=0;j<i;j++)
			    {
			    	if(e[i]==e[j])
			    		break;
			    }
			    if(j==i)
			    {
			    	a[x++]=e[i];
			    }
			   }
		        String s5= new String(a);
		        System.out.println("After removing duplicates we have: "+s5);
			   break;
		case 4:
			   char d[]=s1.toCharArray();
			   for(i=0;i<s1.length();i++)
			   {
				   if(i%2==0)
				   {
					   d[i]=Character.toUpperCase(d[i]);
				   }
			   }
			   String s4=new String(d);
			   System.out.println("After changing odd characters to uppercase: "+ s4);
			   break;
		default: System.exit(0);
		 }
}
}