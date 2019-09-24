package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		// 현재 시간의 정보
		Calendar cal = Calendar.getInstance(); // new GregorianCalendar
		
		int hour = cal.get(Calendar.HOUR); // 12시간 기준
		hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 기준
		int min = cal.get(Calendar.MINUTE);
		// 연도
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH); // 1월은 컴퓨터 기준 0 2월은 1 ... 해서 1달씩 밀림
		int date = cal.get(Calendar.DATE);
		int d = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print(year + "년 ");
		System.out.print(mon + 1 + "월 ");
		System.out.print(date + "일 ");
		System.out.print(hour + "시 ");
		System.out.print(min + "분 ");
		System.out.println("\n이번주의 " + d + "번째 날");
	}
}
