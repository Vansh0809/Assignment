package com.cg.demoproject.bean;

public class Circle extends Shape implements IMyInterface{

	private double radius;
	
	public Circle() {}
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	
	@Override
	public void draw() {
		
		System.out.println("Drawing Shape Circle...");
	}

	public double calculateArea()
	{
		return super.getPI()*radius*radius; 
		
	}
	
	
}
