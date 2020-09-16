package com.javaex.oop.point.v4;

public class ColorPoint extends Point{
	private String color;
	
	
	public ColorPoint(int x, int y) {
		super(x, y);
		
		System.out.println(this.getClass().getSimpleName() + "의 생성자(x, y)");
	}
	
	public ColorPoint(int x, int y, String color) {
		this(x, y);
		this.setColor(color);
		System.out.println(this.getClass().getSimpleName() + "의 생성자(x, y, color)");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		// 연습 : Point class의 draw(boolean) method를 override 해 본다.
		if (color != null) {
			System.out.printf("색깔점[x=%d, y =%d, color=%s]을 그렸습니다.", this.x, this.y, color);
		}
	}
	@Override
	public void draw(boolean a) {
		// 연습 : Point class의 draw(boolean) method를 override 해 본다.
		if (color != null) {
			System.out.printf("색깔점[x=%d, y =%d, color=%s]을 그렸습니다.", this.x, this.y, color);
		}
	}
}
