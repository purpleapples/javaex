package com.javaex.api.objectclass.v3;

public class LanghClassText {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		System.out.println("p:" + p);
		
		Point p2 = p.getClone();
		System.out.println("p2:" + p2);
		
		System.out.println("p == p2 ? "+ (p==p2));
		
		p2.setX(30);
		p2.setY(40);	
		
		System.out.println("p:" + p);
		
		System.out.println("p2:" + p2);

	}

}
