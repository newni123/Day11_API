package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// 택배..
		// 현재의 년월일
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);

		System.out.println("현재 " + year + "년 " + month + "월 " + date + "일");
		// 이틀 뒤의 년월일
		calendar.add(Calendar.DATE, 10);
		//calendar.roll(Calendar.DATE, 10);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		date = calendar.get(Calendar.DATE);
		System.out.println("모레는 " + year + "년 " + month + "월 " + date + "일");

	}

}
