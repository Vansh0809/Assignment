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

public class AgeException {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			int age=s.nextInt();
			if(age>=15)
			{
				System.out.println("Correct");
			}
			else
			{
				throw new Exp("Age is less");
			}
		}
		// TODO Auto-generated method stub
       catch(Exp e)
		{
    	   System.out.println("Caught");
    	   System.out.println(e.getMessage());
		}
	}

}
