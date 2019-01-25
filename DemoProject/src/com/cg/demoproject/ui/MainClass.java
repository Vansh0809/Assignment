package com.cg.demoproject.ui;

import java.time.LocalDate;
import java.time.Month;

import com.cg.demoproject.bean.Circle;
import com.cg.demoproject.bean.Divisions;
import com.cg.demoproject.bean.IMyInterface;
import com.cg.demoproject.bean.JavaStudent;
import com.cg.demoproject.bean.Shape;
import com.cg.demoproject.bean.Student;

public class MainClass {

	public static void main(String[] args) {
		
		/*Student student1=new Student(101,"Manisha",45.98f,Divisions.B);
		Student student2=new Student(102,"Sunil",65.98f,Divisions.D);
		Student s=new Student();
		student1.setStudRollNo(100);
		student1.setStudName("Sunil");
		student1.setStudMarks(75.80f);
		
		System.out.println("Student Roll no is: " + student1.getStudRollNo());
		System.out.println("Student Name is: " + student1.getStudName());
		System.out.println("Student Marks are: " + student1.getStudMarks());

	   System.out.println(student1);
	   System.out.println("------------------------------------------------------------");
	   System.out.println(student2);
	   student1.getCount();
	    student2.getClass();
	
	   */
		
	  /*Object student1=new Student(101,"Manisha",45.98f,Divisions.B,LocalDate.of(1988,Month.NOVEMBER,22));
	  System.out.println(student1);
	  
	  
	  Student s=(Student)student1;
	  s.getCount();*/
		
		
		/*IMyInterface s=new Circle(3.9);
		//s.draw();
		Circle c=(Circle)s;
		c.draw();
		System.out.println("Area of Circle is: " + s.calculateArea());
		
		Shape s1=new Shape();
		s1.draw();
		*/
		
	
		
		Student student1=new Student(101,"Manisha",45.98f,Divisions.B,LocalDate.of(1988,Month.NOVEMBER,22));
		System.out.println(student1);
		
		System.out.println("---------------------------------------------------------------");
		Student student2=new JavaStudent(102,"Asha",54.98f,Divisions.C,LocalDate.of(1987,Month.OCTOBER,20),"Java");
		
		System.out.println(student2);
		
		
		
	
	}

}
