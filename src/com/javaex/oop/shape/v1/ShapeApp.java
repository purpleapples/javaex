package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] shapeArr = new Shape[3];
		
		Circle c1 = new Circle(10, 20, 10);
		Rectangle r1 = new Rectangle(20, 10, 20, 30);
		Rectangle r2 = new Rectangle(0, 0, 40, 50);
		
		shapeArr[0] = c1;
		shapeArr[1] = r1;
		shapeArr[2] = r2;
		for( Shape obj: shapeArr) {
			if (obj != null)
				obj.draw();
		}

	}

}
