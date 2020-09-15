package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		
		System.out.println("4 + 5 = " +getSum(4, 5));
		System.out.println(getSum(1,2,3,4,5,6,7,8,9));
		
		printSum("총계", 1,2,3,4,5);
	}

	
	
	public static void printSum(String message, double ...values) {
		// 고정인수 + 가변인수
		// 순서 중요: 고정인수 선언 -> 가변 인수
		System.out.println(message + ":" + getSum(values));
		
	}
	
	public static double getSum(double ... values) {
		// 가변 인수
		// 배열로 고정되어 전환
		//
		double sum = 0;
		for(double mem : values) {
			sum += mem;
		}
		return sum;
	}
	
	public static double getSum(double num1, double num2) {
		return num1 + num2;
	}


}
