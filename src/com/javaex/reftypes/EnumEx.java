package com.javaex.reftypes;

public class EnumEx {

	public static void main(String[] args) {		 
		//enumEx1();
		enumEx2();
	}
	
	public static void enumEx2() {
		// java의 switch 문은 char, String 값의 비교도 가능
		// 차후 Enum 으로 다시 작성
		String day = "MONDAY";
		Week dayEnum =Week.valueOf(day);
		String act;
		
		switch(dayEnum) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
				act = "열공";
				break;
			case FRIDAY:
				act = "열공 후 불금";
				break;
			case SATURDAY:
				act = "방전";
				break;
			default : 
				act = " ? ";				
		}
		System.out.println(day+ " 에는 " +act);
	}
	public static void enumEx1() {
		// Enumerate constant 활용
		Week today = Week.TUESDAY;
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		String day = "FRIDAY";
		Week obj = Week.valueOf(day);
		System.out.println(obj.name() + " " + obj.ordinal());
	}
}
