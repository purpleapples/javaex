package com.javaex.oop.shape.v1;

public abstract class Shape {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract double area();
	public abstract void draw();
	
	

}
