package com.javaex.api.collection.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 만들고, 데이터 세팅
		Box intBox = new Box();
		intBox.setContent(2020);
		
		// 값 인출
		Object retVal = intBox.getContent();
		System.out.println("내용물 : "  +  retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String content = (String)strBox.getContent();
		System.out.println("strBox의 내용물 : " +strBox.getContent());

	}

}
