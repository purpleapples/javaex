package com.javaex.api;

import java.util.Iterator;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
//		usefulMethods();
		stringBufferEx();
	}

	private static void stringBufferEx() {
		// String +, 변환 수행하면 새 String 객체 생성
		// StringBuffer : buffer 기반 문자열 생성기
		StringBuffer sb = new StringBuffer("This"); // 버퍼 생성, 초기화
		
		// 문자열 추가 : append
		sb.append(" is pencil");
		
		
		// 문자열 삽입 : insert
		sb.insert(7, " my");
		
		// 문자열 치환 : replace
		sb.replace(sb.indexOf("my") , sb.indexOf("my") + 2, "Your");				
				
		// method chaining
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(7, "my")
				.replace(7, 10, " Your ");
		
		String result = sb2.toString();
		System.out.println("sb : " + sb);		
		System.out.println("result : " + result);
	}
	
	private static void usefulMethods() {
		// 중요 method 정리
		String str = "Java Programming JavaScript Programming";
		
		System.out.println("str length: " + str.length()); 
		System.out.println("가장 마지막 글자: " + str.charAt(str.length()-1)); 
		
		//변환
		System.out.println("모두 대문자로:" + str.toUpperCase());
		System.out.println("모두 대문자로:" + str.toLowerCase());
		
		// String 은 immutable
		System.out.println("원본: " + str);
		
		// 중요: indexOf()
		// 문자열에서 Java의 인덱스
		
		int index = -1;
		index = str.indexOf("Java"); // 첫 번째 검색
		System.out.println("1번째 검색 위치: " + index);
		index = str.indexOf("Java", 4);
		System.out.println("2번째 검색 위치: " + index );
		index = str.indexOf("Java", index + 4);
		System.out.println("3번째 검색 위치: " + index );
		
		// 역방향 검색 : LastIndexOf()
		index = str.lastIndexOf("Java");
		System.out.println("역방향 검색: " + index);
		
		// 치환
		str = str.replace("JavaScript","Python");
		System.out.println("치환:" +str);
		
		// 문자열 추출
		index = str.indexOf("Programming"); // Programming의 인덱스 확인
		if(index >= -1 ) {
			System.out.println(str.substring(index, index+11));
			
		}
		
		System.out.println(str.substring(16));
		
		String s2 = "          Hello, Java             ";
		s2=s2.trim();
		System.out.println(s2);
		
		
		// 문자열 분리 : split - 구분 기호를 기준으로 문자열을 분리 -> 배열 반환
		String words[] = str.split(" ");
		for (String string : words) {
			System.out.println("단어: " + string);
		}
		
		
	}
	
	private static void stringBasic() {
		String s1 = "Java";
		String s2 = "Java";
		s1 += "ddddd";
		String s3 = new String("Java");
		
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s2 == s3 ? " + (s2 == s3));
		
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		System.out.println(s4);
		
		String s5 = String.valueOf(Math.PI);
		System.out.println(s5);		
		
	}

}

