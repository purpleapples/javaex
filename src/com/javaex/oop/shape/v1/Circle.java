package com.javaex.oop.shape.v1;

public class Circle extends Shape{

	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius; 
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void draw() {		
		System.out.printf("원[x=%d, y=%d, area=%f]을 그렸어요%n", x, y, area());
	}

	
}
