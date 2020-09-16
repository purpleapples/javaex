package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept {
	
	public void executeException() throws IOException{
		System.out.println("강제 예외 발생");
		throw new IOException();
	}
	
	public void executeRuntimeException() throws RuntimeException{
		System.out.println("Runtime 오류");
		throw new RuntimeException();
	}
	
	public int divide(int num1, int num2) {		
		int result = 0;
		try {
			result = num1/num2;
				
		} catch (ArithmeticException e) {
			// 예외의 전환 (보다 구체적인 예외로 변환하여 throw)
			throw new CustomArithmeticException("사용자 정의 예외", num1, num2);
		}
		return result;
		//return num1 / num2;
	}
}
