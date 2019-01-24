package com.cg.p1.bean;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num;
       num=Integer.parseInt(args[0]);
       if(num>0)
       {
    	   System.out.println("Positive");
       }
       else if(num<0)
       {
    	   System.out.println("Negative");
       }
       else
       {
    	   System.out.println("Zero");
       }
	}

}
