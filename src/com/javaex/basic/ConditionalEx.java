package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {

		ifElseEx();
		ifElseEx2();
		switchEx();
		switchEx2();
	}
	
	public static void switchEx3() {
		// java의 switch 문은 char, String 값의 비교도 가능
		// 차후 Enum 으로 다시 작성
		String day = "MONDAYS";
		String act;
		
		switch(day) {
			case "MONDAY":
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
				act = "열공";
				break;
			case "FRIDAY":
				act = "열공 후 불금";
				break;
			case "SATURDAY":
				act = "방전";
				break;
			default : 
				act = " ? ";				
		}
		System.out.println(day+ " 에는 " +act);
	}
	
	public static void switchEx2() {
		int month = 0;
		String days = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		switch(month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = "31일";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30일";
				break;
			default:
				days = "28일";
		}
		
		System.out.println(month + "월은" + days);
		scanner.close();
	}
	
	public static void switchEx() {
		
		Scanner scanner = new Scanner(System.in);
		String message = "";
		int no = 0;
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. JAVA, 2. C, 3. C++, 4. python");
		
		no = scanner.nextInt();
		
		switch(no) {
			case 1: message = "R101"; break;
			case 2: message = "R202"; break;
			case 3: message = "R303"; break;
			case 4: message = "R404"; break;
			default : message = "상담원 문의";	break;				
		}
		System.out.println(message);
		scanner.close();						
	}
	
	public static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		String message = "";
		int no = 0;
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. JAVA, 2. C, 3. C++, 4. python");
		
		no = scanner.nextInt();
		
		if(no ==1) {
			message = "R101";
		}else if (no ==2) {
			message = "R202";
		}else if (no==3) {
			message = "R303";
		}else if (no==4) {
			message = "R404";
		}else {
			message = "상담원 문의";
		}	
		
		System.out.println(message);
		scanner.close();			
	}
	
	public static void ifElseEx() {
		 Scanner scanner = new Scanner(System.in);
		 String message = "";
		 int num = 0;
		 
		 System.out.print("type integer : ");		 
		 num = scanner.nextInt();
		 
		 // condition setting
		 if (num > 0) {
			 if (num % 2 == 0){
				 message = "even";
			 }else {
				 message = "odd";
			 }
			 
		 }else if(num < 0 ) {
			 message = "negative number";
		 }else {
			 message = "zero";
		 }
		 System.out.println(message);
		 scanner.close();
	}
	
	
}
