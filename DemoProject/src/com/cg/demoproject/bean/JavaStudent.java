package com.cg.demoproject.bean;

import java.time.LocalDate;

public class JavaStudent extends Student {

 private String subject;
 
 public JavaStudent() {}
 
 
 public JavaStudent(int studRollNo, String studName, float studMarks, Divisions studDivision,LocalDate studBirthDate,String subject)
 {
	 super(studRollNo,studName,studMarks,studDivision,studBirthDate);
	 this.subject=subject;
	 
 }

/* @Override
 public String toString()
 {
	 return super.toString() + "\nStudent Subject is: " +subject;
 }
*/
}
