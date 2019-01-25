package com.cg.demoproject.bean;

import java.time.LocalDate;

public class Student {
	
	private int studRollNo;
	private String studName;
	private float studMarks;
	private static String studSchoolName;
	private  int count;
	private Divisions studDivision;
	private LocalDate studBirthDate;
	
	static {
		
		studSchoolName="DPS";
		//System.out.println("Hello...I am getting executed first...");
		//Student.getCount();
	}
	
   public Student() {
	   
		super();
		count++;
	}
   public Student(int studRollNo, String studName, float studMarks, Divisions studDivision,LocalDate studBirthDate) {
		super();
		count++;
		this.studRollNo = studRollNo;
		this.studName = studName;
		this.studMarks = studMarks;
		this.studDivision=studDivision;
		this.studBirthDate=studBirthDate;
		
	}
   public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(float studMarks) {
		this.studMarks = studMarks;
	}

	public String getStudSchoolName() {
		return studSchoolName;
	}
	
	public void getCount()
	{
		System.out.println("No. of objects created : " +count);
	}	
	
	
	public Divisions getStudDivision() {
		return studDivision;
	}
	public void setStudDivision(Divisions studDivision) {
		this.studDivision = studDivision;
	}
	
	
	
	public LocalDate getStudBirthDate() {
		return studBirthDate;
	}
	public void setStudBirthDate(LocalDate studBirthDate) {
		this.studBirthDate = studBirthDate;
	}
	
	/*@Override
	public String toString() {
		
		return "Student Roll no is: "+ studRollNo + "\nStudent Name is: " + studName + 
				"\nStudent marks are : " + studMarks + 
				"\nStudent's School name is: " + studSchoolName +
				"\n Student's Division is: " + studDivision+ "Birthdateof students is: " + studBirthDate;
	}
	*/
	
	
}
