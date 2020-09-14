package com.javaex.basic;
import java.lang.*;
// primary data type practice
public class TypesEx {
	
	public static void main(String[] args) {
		booleanEx();
		integerTypesEx();
		floatDoubleEx();
		charEx();
		constantEx();
		implictCastingEx();
		explicitCastingEx();
	}
	
	public static void booleanEx() {
		// 논리형: 1byte - true of false
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 + "\n" + b2);
		
		boolean result;
		
		int val1 = 3;
		int val2 = 5;
		
		// operation result in boolean type
		
		result = val1 < val2;
		
		System.out.println("val1 < val2 ? " +result);
		
	}
	
	public static void floatDoubleEx() {
		// 실수
		//float(4) < double(8)
		float fVar = 3.14159f;
		double dVar = 3.14159;
		
		// 지수 표기법
		fVar = 3e-6f; //3 * 10 ^-6
		dVar = 3E6 ; //3 * 10 ^ 6
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		// accuracy check
		System.out.println(0.1*3);
		
	}
	
	public static void charEx() {
		char h1 = 'A';
		char h2 = '한';
		
		System.out.println(h1);
		System.out.println(h2);
		
		System.out.println(h1 + h2);
	}
	
	public static void integerTypesEx() {
		// byte(1) < short(2) < integer(4) < long(8)
		int intVal;
		intVal =2929;
//		int intVal2 = 12345678900; value over
		
		long longVal1;
		long longVal2;
		
		longVal1=2020;
//		longVal2=12345678912345678912l value over;
		
		// expression : 
		int bin, oct, hex;
		bin = 0b1100; //2진수 0b
		oct = 072; // 8진수 0
		hex= 0xFF; //16진수 0x
		
		System.out.println("2진수 0b1100 = " + bin + "\n8진수 072 = " + oct + "\n16진수 0xFF =  " + hex);
	}
	
	public static void explicitCastingEx() {
		// explicit data type casting
		// expression area : narrow <-> wide | data can be missed in wide -> narrow
		
		float f = 12345678.901234F;
		System.out.println(f);
		
		int i = (int)f;
		System.out.println(i);
		short s = (short)f;
		System.out.println(s);
		byte b = (byte)f;
		System.out.println(b);
		
	}
	
	public static void implictCastingEx() {
		// implicit data type casting
		// expression area: narrow -> wide : not size
		byte b = 25; //1 byte integer
		System.out.println(b);
		short s = b;
		System.out.println(s);
		int i = b;
		System.out.println(i);
		long l = b;
		System.out.println(l);
		float f= l;
		System.out.println(f);

	}
	
	public static void constantEx() {
		 //constant declaration
	 	 //do declaration and initiation at the same time
		 //after initiation, can't not be changed
		 final double PI =3.14159;
		 final int SPEED_LIMIT =110;
		 
		 System.out.println("제한 속도는 " + SPEED_LIMIT + "입니다.");
		 // 1. higher identification 
		 // 2. easy maintenance
		 
		 // JAVA uses constant a lot
		 System.out.println("PI: " + Math.PI);		 				 
	}
	
	
	
}
