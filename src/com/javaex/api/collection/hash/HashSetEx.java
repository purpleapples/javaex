package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	// set data type
	// order is not important and doesn't allow duplication
	public static void main(String[] args) {
		primTypeSet();
		customTypeSet();

	}

	
	private static void customTypeSet() {
		HashSet<Student> cls = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);		
		Student s2 = new Student("임꺽정", 20);
		Student s3 = new Student("임꺽정", 20);
		
		cls.add(s1);
		cls.add(s2);
		cls.add(s3);
		
		System.out.println("class : " + cls);
		
		// Hash 계열 자료형에서 두 객체가 동등함을 확인 방법
		// 1. hashCode()
		// 2. equals()
		System.out.println("s2 s3 hashcode 같은가? " + (s2.hashCode()==s3.hashCode()) );
		System.out.println("s2 s3 값은 같은가 ? " +s2.equals(s3));
		
		// 임꺽정은 있는가?
		
	}


	private static void primTypeSet() {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("홍길동");
		hs.add("임꺽정");
		hs.add("장길산");
		hs.add("전우치");
		hs.add("임꺽정");
		
		System.out.println("Set: " + hs);
		
		// check a specific object
		System.out.println("임꺽정을 포함 ? " + hs.contains("임꺽정"));
		
		// 삭제 : remove
		hs.remove("임꺽정");		
		System.out.println("임꺽정을 포함 ? " + hs.contains("임꺽정"));

	}

}
