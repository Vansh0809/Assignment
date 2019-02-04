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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studBirthDate == null) ? 0 : studBirthDate.hashCode());
		result = prime * result + ((studDivision == null) ? 0 : studDivision.hashCode());
		result = prime * result + Float.floatToIntBits(studMarks);
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
		result = prime * result + studRollNo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studBirthDate == null) {
			if (other.studBirthDate != null)
				return false;
		} else if (!studBirthDate.equals(other.studBirthDate))
			return false;
		if (studDivision != other.studDivision)
			return false;
		if (Float.floatToIntBits(studMarks) != Float.floatToIntBits(other.studMarks))
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		if (studRollNo != other.studRollNo)
			return false;
		return true;
	}
	
	/*@Override
	public String toString() {
		
		return "Student Roll no is: "+ studRollNo + "\nStudent Name is: " + studName + 
				"\nStudent marks are : " + studMarks + 
				"\nStudent's School name is: " + studSchoolName +
				"\n Student's Division is: " + studDivision+ "Birthdateof students is: " + studBirthDate;
	}
	*/
	public static void sayHello()
	{
		System.out.println("Hello");
		
	}
	
}
