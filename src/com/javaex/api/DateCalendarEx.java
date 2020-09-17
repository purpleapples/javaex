package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarEx {

	public static void main(String[] args) {
		//dateEx();
		calendarEx();
	}

	
	private static void calendarEx() {
		Calendar now =  Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		// 날짜 정보의 변경 : set(상수, 값)
		custom.set(1999, 12, 31);
		
		// 날짜 정보의 확인 : get(상수)
		int year = custom.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int date= custom.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d 일 입니다.", year, month, date);
		
		// 날짜의 연산
		// 100일 뒤로 이동
		Calendar future= Calendar.getInstance(); // 현재
		future.add(Calendar.DATE, 100);
		System.out.printf("100일 뒤 : %d년 %d월 %d 일",
							future.get(Calendar.YEAR), 
							 future.get(Calendar.MONTH),
							 future.get(Calendar.DATE));
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100일 뒤 요일 : " + dow);
		
		// 요일 맞추기
		// Generic 지정 
		// T로 놓기만 하면 객체 생성시 지정한다.
		// extends 하면 extends 한 객체만 받는다.
		// super 하면 해당 객체의 하위 계층까지만 받는다.
		// 컴파일러 시점에서 확인가능하며 type 강제를 통한 응집도 상승
		System.out.println("이날은 토요일인가? " + (dow == Calendar.SATURDAY));
	}


	private static void dateEx() {
		// 날짜 얻어오기
		Date now = new Date();
		
		System.out.println("현재 : " + now);			
		
		// 날짜 포멧팅
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL 포맷 : " + df.format(now));
		// FULL, LONG, MEDIUM, SHORT
		
		// 사용자 정의 포맷: SimpleDateFormat
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy 년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(now));
	}
	
	

}
