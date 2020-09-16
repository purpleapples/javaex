package com.javaex.oop.shape.v2;

public abstract class Shape implements Drawable {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract double area();
	
	

}
