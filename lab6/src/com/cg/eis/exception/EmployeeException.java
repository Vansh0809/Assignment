package com.cg.eis.exception;
import java.lang.Exception;
import java.util.Scanner;

class Exp extends Exception
{
	public Exp(String s)
	{
		super(s);
	}
}

public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter employee's salary");
			int salary=s.nextInt();
			if(salary<3000)
			{
				throw new Exp("Salary inappropriate");
			}
			else
			{
				System.out.println("Appropriate");
			}
			
		}
		catch(Exp e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}

	}

}
