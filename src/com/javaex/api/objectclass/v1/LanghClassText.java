package com.javaex.api.objectclass.v1;

public class LanghClassText {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// Java의 최상위 클래스는 object다.
		System.out.println("object info : " + p.getClass().getName());
		System.out.println("object identification integer: " + p.hashCode()); // 기본적으로 memory address
		// reference type == : hashCode 비교
		System.out.println("toString:" + p.toString());
		// toString() : 문자열과 연결될 뗴, 출력시 문자열로 변환
		System.out.println("p instance" + p);
		
		

	}

}
