package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // class variable - static 영역
	public static String classVar; // class variable 
	public String instanceVar; // instance variable
	
	// static 영역에서는  instance member에 접근 불가
	// instance 영역에서는  static member에 접근 가능
	// static member는 instantiation 하지 않아도 접근가능
	
	// static area는 class가 load될 때 initialization 수행
	
	static {
		classVar = "Static member";
		refCount = 0;
		System.out.println("Static initialization");
		//	System.out.println(instanceVar); // static -> instance 접근 불가
		// static영역에서는 static member만 활용
	}
	
	public StaticEx() {
		// instance -> static  영역 접근 가능
		refCount++;
		System.out.println("참조 갯수:" + refCount);
	}
	
	// 소멸자
	// 없어질 예정
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("소멸자 호출");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
