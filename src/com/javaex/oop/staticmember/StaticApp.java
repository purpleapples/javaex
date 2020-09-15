package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		// static 영역은 instantiation 하지 않아도 참조가능
		System.out.println("ref count: " + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		// static 영역은 instantiation 하지 않아도 참조가능
		System.out.println("ref count: " + StaticEx.refCount);
		
		s1=null; // 참조 해제
		System.out.println("s1 참조 해제");
		System.out.println("ref count: " + StaticEx.refCount);
		
		
		System.gc(); // 주의
		try {
			Thread.sleep(10000);
			System.out.println("ref count: " + StaticEx.refCount);
		}catch(Exception e) {
			
		}
	}

}
