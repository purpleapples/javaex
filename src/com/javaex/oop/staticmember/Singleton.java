package com.javaex.oop.staticmember;

// 어떤 상황에서라도 단 하나의 인스턴스만 유지해야 하는 경우
public class Singleton {

	private static Singleton instance = new Singleton();
	private int[] scores;
	// 생성자 -> new 막아준다.
	private Singleton() {
		// new 호출 불가
		scores = new int[10];
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
