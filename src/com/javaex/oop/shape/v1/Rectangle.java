package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, area=%f]을 그렸어요%n", x, y, area());

	}

}
