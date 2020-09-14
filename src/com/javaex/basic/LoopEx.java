package com.javaex.basic;

import java.util.Scanner;
import java.util.*;

public class LoopEx {

	public static void main(String[] args) {
		//whileEx();
		//dowhileEx();
		//forEx();
		randomEx();

	}
	
	public static void randomEx2() {
		// 중복 허용하지 않고 6개 뽑기
		HashMap h= new HashMap();
		
		
	}
	
	public static void randomEx() {
		System.out.println(Math.random());
		// 1~ 45 중 임의의 정수 6개
		
		for (int i =1; i < 7; i++) {
			System.out.print((int)(Math.random() * 45) + 1);
			System.out.print(" ");
		}
		
		
	}
	
	public static void guguFor() {
		// 2단 부터 9단 까지 구구단 for문으로 출력
		for (int i=2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");				
			}
			System.out.println();
		}
	}
	
	public static void breakEx() {
		// 루프 도중, break 만나면 종료
		
		// 1부터 증가시키면서 6, 14로 모두 나누어 지면 떨어지는 수 구하기
		
		for (int i =1; ; i++) {
			if(i%6 ==0 && i%14 ==0) break;
		}
	}
	
	public static void continueEx() {
		// 루프 도중 continue를 만나면 다음 루프로 점프
		
		// 1부터 100까지 루프를 돌면서 2의 배수, 3의 배수는 출력하지 않고 다음번 루프 수행
		
		for (int i =1; i <101; i++) {
			if (i%2 ==0 || i%3 ==0) continue;			
			System.out.println(i);							
		}
		
	}
	
	public static void starsFor() {
		// 아래와 같이 루프돌며 출력 for문을 이용
		/*
		 * 
		 ** 
		 *** 
		 ****
		 ***** 
		 * */
		String star = "*";
		for (int i=1; i<6; i++) {
			System.out.println(star);
			star = star + star;
		}
	}
	
	public static void  forEx() {
		//  단 입력 받아서 해당 단의 구구단 표 출령
		int dan;
		dan = 0;
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		
		for (int i = 1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);			
		}
		scanner.close();
	} 
	
	public static void dowhileEx() {
		
		int value, total;
		value =0;
		total =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요[0이면 quit]");
		
		do {
			value = scanner.nextInt();
			total += value;			
		}while(value != 0);
		
		System.out.println("합계: " + total);
		scanner.close();
		
	}
	
	public static void whileEx() {
		int dan, num;
		dan = 0;
		num = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		
		dan = scanner.nextInt();
		
		while(num <=9){
			System.out.println(dan  + " * " + num + " = " + dan * num );
			// while 문은 종료 조건 필요
			num++;
			
		}
		scanner.close();
	}
}
