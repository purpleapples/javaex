package com.javaex.oop;

// 추상 class instantiation 불가
public abstract class Animal {
	// 필드
	protected String name;
	
	//  생성자
	
	protected Animal(String name) {
		this.name = name;
	}
	
	protected void eat() {
		System.out.println(name + "이 먹고 있습니다.");
	}
	
	protected void walk() {
		System.out.println(name + "이 산책합니다.");
		
	}
}
