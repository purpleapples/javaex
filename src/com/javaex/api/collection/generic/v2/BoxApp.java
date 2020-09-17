package com.javaex.api.collection.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 만들고, 데이터 세팅
		Box<Integer> intBox = new Box<Integer>(); // 참조에서는 생략 가능
		intBox.setContent(2020);
//		intBox.setContent("Java"); 컴파일러가 체크
		
		// 값 인출
		Object retVal = intBox.getContent();
		System.out.println("내용물 : "  +  retVal);
		
		Box<String> strBox = new Box();
		strBox.setContent("Java");
		
//		generic을 이용하면 안전하고, 캐스팅 필요 없어서 편리
		String content = (String)strBox.getContent();
		System.out.println("strBox의 내용물 : " +strBox.getContent());

	}

}
