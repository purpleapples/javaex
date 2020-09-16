package com.javaex.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		//nullPointerExceptionEx();
		//arrayExceptionEx();
		//arithExceptionEx();
		throwEx();
	}
	
	private static void throwEx() {
		ThrowsExcept except = new ThrowsExcept();
		try {
			System.out.println("100/0=" + except.divide(100, 0));						
			except.executeRuntimeException();
			except.executeException();
		}catch(CustomArithmeticException e)
		{
			System.err.println("메시지: " + e.getMessage());
			System.err.println("메시지: " + e.getNum1());
			System.err.println("메시지: " + e.getNum2());
		}catch (ArithmeticException e){
			System.err.println("산술 오류: " + e.getMessage());
		}catch (IOException e) {
			System.err.println("메시지: " + e.getMessage());
		}
		System.out.println("End of Code");
	}
	private static void arithExceptionEx() {
		// scanner 로 부터 정수를 입력 100을 정수로 나눈다.
		double result = 0;
		try {
			
			int num = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수를 입력");
			
			num = scanner.nextInt();
			result = 100 / num;
			
		} catch (ArithmeticException e) {
			System.err.println("예외 메시지:" + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("예외 메시지:" + e.getMessage());
		} catch(Exception e) { // 가장 마지막 catch 블록에서 처리
			System.err.println("예외 메시지:" + e.getMessage());	
		} finally {
			System.out.println("예외 처리 완료"); // 예외 처리 진행 유무 상관없이 끝난 후에 자원 정리
		}
		
		System.out.println("결과 : " + result);
		System.out.println("End of Code");
		
	}
	
	
	private static void arrayExceptionEx() {
		
		int [] arr = {1, 3, 5};
		try {
		
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i] + " ");			
			}		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage()); null 나온다. setting 필요
			e.printStackTrace();
		} 
		
		System.out.println();
		System.out.println("End of Code");
	}
	private static void nullPointerExceptionEx() {
		// 가장 흔하고, 가장 위험한 예외
		// 할당되지 않은 객체를 참조할 때
		
		String str = new String("hello world");
		
		str = null;
		
		try {
			str = str.toUpperCase();
			System.out.println(str);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}

}
