package com.javaex.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringEx();
		stringFormatEx();
	}
	
	public static void stringFormatEx() {
		// %d(integer), %s(String), %n(new line), %f(float), %%(%)
		// 00개의 00 중에서 00개를 먹었다.
		String fmt = "%d개의 %s중에서 %d개를 먹었다.%n";
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		String result = String.format(fmt, total, fruit, eat);
		System.out.println(result);
		
		// printf
		System.out.printf(fmt, 10, "orange", 5);
		
		// %f
		float rate = 1.234f;
		
		System.out.printf("현재 이자율은%f%%입니다.%n", rate);
		System.out.printf("현재 이자율은%.2f%%입니다.%n", rate);
		
	}
	
	public static void stringEx() {
		// String declaration
		String str;
		str = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		// 전부 literal 이다.
		System.out.println(str);
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println(str == str2);
		System.out.println(str == str3);
	}
}
