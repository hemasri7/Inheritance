package com.axis.models;

public class Rectangle implements Shape{
	
	@Override
	public void draw()
	{
		System.out.println("rectangle draw method");
	}
	@Override
	public void displayInfo()
	{
		System.out.println("rectangle info ");
	}

}
