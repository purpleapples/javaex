package com.javaex.basic;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithOperEx();		
		logicalOperEx();
		conditionalOperEx();
	}
	
	public static void conditionalOperEx() {
		
		int a = 10;
		
		// a가 짝수인지 여부 확인
		System.out.println( a %2 ==0 ? "짝수" : "홀수");
		
		int score = 85;
		
		String message;
		message = score > 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		System.out.println("정수: " + score  + ", 결과: "+ message);
	}
	
	public static void logicalOperEx() {
		// logical Multiplication(and &&), logical summation(or ||), logical negative (not !)
		int n  =5;
		
		boolean r1 = n> 0;
		boolean r2 = n < 10;
		
		// && AND
		boolean r1Andr2 = r1 && r2;
		System.out.println("r1Andr2 = " + r1Andr2);
		
		// or |\
		boolean r1Orr2 = r1 || r2;
		System.out.println("r1Orr2 = " + r1Orr2);
		
		// negative
		boolean notII = !r1Orr2;
		
		System.out.println("notII = " + notII);
				
		
	}
	
	public static void arithOperEx() {
		//  division and residual
		int a =7;
		int b =3;
		
		System.out.println("7 / 3 ? " + (a/b));
		System.out.println("7 / 3의 몫 -> " + (a + b));
		System.out.println("7 / 3의 나머지 -> " + (a % b));
		
		// find decimal point -> use casting 
		System.out.println("7 / 3 -> "  + ((float)a/(float)b));
		System.out.println("7 / 3 -> "  + ((float)a/b));
		
		// increase/decrease operator
		
		a = 10;
		b = 10;
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
	}

}
