package com.cg.lab7.bean;
import java.util.*;
import java.util.regex.Pattern;

public class Stringoper {
	public ArrayList<String> oper(String s1 , String s2)
	{
		ArrayList<String> mylist = new ArrayList<String>();
		StringBuilder s = new StringBuilder(s1);
		int i , j=0;
		for(i=0;i<s1.length();i++)
		{
			if(i%2!=0 && j<s2.length())
			{
				s.setCharAt(i, s2.charAt(j));
				j=j+2;
			}
			mylist.add(s.toString());
			int lastindex =0;
			int count = 0;
			while(lastindex!=-1)
			{
				lastindex = s1.indexOf(s2,lastindex);
				if(lastindex!= -1)
				{
					count ++;
					lastindex += s2.length();
				}
			}
			int start = s1.lastIndexOf(s2);
			if(count>1)
			{
				StringBuilder sb = new StringBuilder();
				StringBuilder sb1 = new StringBuilder();
				sb1.append(s2);
				sb1 = sb1.reverse();
				sb.append(s1.substring(0, start));
				sb.append(sb1);
				sb.append(s1.substring(start+s2.length()));
				mylist.add(sb.toString());
				
			}
			else
				mylist.add(s1+s2);
			if(count>1)
			{
				s1=s1.replaceFirst(Pattern.quote(s2), "");
			mylist.add(s1);
		}
		else
			mylist.add(s1);
			int n =s2.length();
			if(n%2==0)
			{
				StringBuilder sb = new StringBuilder();
				sb.append(s1);
				sb.insert(0 , s2.substring(0, n/2));
				sb.append(s2.substring(n/2));
				mylist.add(sb.toString());
			}
			else
			{
				StringBuilder sb = new StringBuilder();
				sb.append(s1);
				sb.insert(0, s2.substring(n/2+1));
				sb.append(s2.substring(n/2+1));
				mylist.add(sb.toString());
			}
			for(i=0;i<s1.length();i++)
				for(j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						s1=s1.replace(s1.charAt(i),'*');
				}
		}
		mylist.add(s1);
		return mylist;				
				
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		ArrayList<String> mylist = new ArrayList<String>();
		Stringoper s = new Stringoper();
				mylist = s.oper(s1,s2);
		System.out.println(mylist);
		sc.close();

		

	}

}
