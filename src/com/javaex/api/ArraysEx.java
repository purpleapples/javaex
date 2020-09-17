package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void main(String[] args) {
//		basicSort();
//		basicReverseSort();
//		customSort();
//		searchEx();
		arrayCopyEx();
	}
	
	private static void arrayCopyEx() {
		// 복사
		char [] src = "Java Programming".toUpperCase().toCharArray();
		System.out.println("원본 배열 : " + Arrays.toString(src));
		
		// System을 이용한 복제
		
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		System.out.println("System copy: " + Arrays.toString(target));
		
		// Arrays.copyOf
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf: " + Arrays.toString(target));
		
		// Arrays.copyOfRange : 일부 복제
		target = Arrays.copyOfRange(src, 5, 16);
		System.out.println("Arrays.copyOfRange : " + Arrays.toString(target));
		
	}
	private static void searchEx() {
		int [] nums = { 2, 7, 4, 2, 1, 9, 10, 1, 15, 7};
		
		// 검색
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 4);
		System.out.println("정렬된 배열:" + Arrays.toString(nums));
		System.out.println("4의 index : " +index);
		
		// 사용자 정의 객체의 검색
		Member[] members = {
				new Member("홍길동"),
				new Member("임꺽정"),
				new Member("고길동"),
				};
		
		// 정렬
		Arrays.sort(members);
		System.out.println("정렬된 배열 :" + Arrays.toString(members));
		
		index = Arrays.binarySearch(members, new Member("홍길동"));
		System.out.println("홍길동의 인덱스 : " + index);
	}


	private static void customSort() {
		// 사용자 정의 객체의 배열
		Member[] members = {new Member("홍길동"),
				new Member("임꺽정"),
				new Member("고길동"),
				};
		System.out.println("원본 배열 : " +  Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 결과 : " +  Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("역순 정렬 결과" + Arrays.toString(members));
		
	}
	
	
	private static void basicReverseSort() {
		Integer[] scores =  {80, 50, 30, 90, 75, 88, 77};
		Arrays.sort(scores, Collections.reverseOrder());

		System.out.println("정렬된 배열 : " + Arrays.toString(scores));
	}
	
	private static void basicSort(){
		// 기본 타입
		int [] scores = {80, 50, 30, 90, 75, 88, 77};
		// Arrays.toString() -> 배열요소를 출력해준다.		
		System.out.println("배열 원본 : " + scores);
		System.out.println("배열 원본 : " + Arrays.toString(scores));
		
//		Arrays.sort(scores);

		System.out.println("정렬된 배열: " + Arrays.toString(scores) );
		
		
	}

}
