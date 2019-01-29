package com.cg.l6;
import java.lang.Exception;
import java.util.Scanner;

 class Exp extends Exception
{
	public Exp(String s)
	{
		super(s);
	}
}

public class Myexception {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s=new Scanner(System.in);
			String s1=s.nextLine();
			String s2=s.nextLine();
			if(s1.equals("") && s2.equals(""))
			{
				throw new Exp("First name and last name are blank");
			}
			else
			{
				System.out.println("All is set");
			}
		}
		catch(Exp e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
		

	}

}
