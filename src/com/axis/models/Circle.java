package com.axis.models;

public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle draw method");
	}
	@Override
	public void displayInfo() {
		System.out.println("circle Info");
	}

}
