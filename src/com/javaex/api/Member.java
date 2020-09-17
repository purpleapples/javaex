package com.javaex.api;

// 사용자 정의 객체의 같음, 대소관계를 비교하려면 Comparable interface를 구현해야 한다.
public class Member implements Comparable{
	// 필드
	private String name;
	
	public Member(String name) {
		this.name = name;
		
	}
	
	
	// to String
	@Override
	public String toString() {
		return " Member(" + this.hashCode() +")  [name = " + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		int result = 0;
		// 0 : 같다.
		// -1 : 작다
		// 1 : 크다.
		if (o instanceof Member) {
			Member other = (Member)o;
			result = name.compareTo(other.name);
		}
		return result;
	}
	
}
