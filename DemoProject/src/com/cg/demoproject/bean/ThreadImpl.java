package com.cg.demoproject.bean;

public class ThreadImpl extends Thread {

	
	public static void main(String[] args) {
		
		MyThread task=new MyThread();
	    Thread t1=new Thread(task);
	    t1.setName("One");
		t1.start();

		  MyThread task2=new MyThread();
		  Thread t2=new Thread(task2);
		  t2.setName("Two");
		  t2.start();
		  
		  System.out.println("Main");
	}

}
