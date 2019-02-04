package com.cg.demoproject.bean;

public class MyThread implements Runnable {

	
	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("One") )
		{
		System.out.println("Hello...");
		}
		else if(Thread.currentThread().getName().equals("Two")){
			
			System.out.println("Hi");
		}
		System.out.println("Bye");
	}
	
	/*public static void main(String[] args) {
		
		Runnable thread1=new MyThread();
	     t1=new Thread(thread1);
		t1.start();
		
		Runnable thread2=new MyThread();
		 t2=new Thread(thread2);
		t2.start();
		
		System.out.println("in Main");
		

	}*/

}
