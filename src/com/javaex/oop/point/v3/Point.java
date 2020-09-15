package com.javaex.oop.point.v3;

// v3. method overloading : 같은 이름, 같은 return type, 인수의 갯수, 순서로 구별
public class Point {
	//field
	private int x;
	
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.\n", this.x, this.y);
	}
	
	public void draw(boolean bDraw) {
		// method overloading
		String message = String.format("점[x=%d, y=%d]을 ", this.x, this.y);
		message +=  bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
		
	}
}
