package com.javaex.api;

public class WrapperEx {

	// wrapper 클래스
	// 기본 type을 포장하여 객체화 시키는 class
	// 여러 java class 에서 객체만 처리하는 것이 많아서 Wrapper class 필요
	// 변환 등 부가적인 utility method를 갖고 있다. 
		public static void main(String args[]) {
			// 생성
			Integer i = Integer.valueOf(2020);
			// 타 데이터 타입을 변환
			Integer i2 = Integer.valueOf("2020"); // String -> Integer 객체로 변환
			// 주의 : 넘어가는 인수의 형태는 해당 타입으로 전환 가능한 형태여야 한다.
			System.out.println(i2);
			
			// 자동 박싱 지원
			Integer i3 = 10; // Integer i3 = Integer.valueOf(10)
			
			System.out.println(i3);
			
			// parse 계열 method : 문자열을 잉요해서 해당 type으로 변환
			System.out.println(Integer.parseInt("-123"));
			System.out.println(Integer.parseInt("FF", 16));
			System.out.println(Integer.toBinaryString(2020));
			// 형변환
			System.out.println(i.doubleValue());
			
			// 포장된 값의 비교
			System.out.println(i == 12); // 다른 객체
			
			// 언박싱 비교
//			System.out.println(i.intValue() == 12.intValue()); // primitive type은 에러난다.
			System.out.println(i.equals(12));
			
			// 기본형 null 허용 X
			// 참조형 null 허용 O
			
			
			
		}
}
