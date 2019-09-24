package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // 현재시간
		// int h = calendar.get(Calendar.HOUR_OF_DAY);
		long l1 = calendar.getTimeInMillis(); // 현재 시각을 long타입의 millis로 변환
		System.out.println(l1);
		Calendar calendar2 = Calendar.getInstance(); // 5시간 뒤
		calendar2.add(Calendar.HOUR_OF_DAY, 26);
		// int h2 = calendar2.get(Calendar.HOUR_OF_DAY);
		long l2 = calendar2.getTimeInMillis();
		// 시간당 1000
		// System.out.println(h2 - h);
		System.out.println(l2);
		System.out.println(l2 - l1);
		long l3 = l2 - l1;
		System.out.println(l3 / (1000 * 60 * 60)); // 밀리세컨드(1000분의 1초) * 초(1분에 60초) * 분(1시간에 60분)
		int i = (int) ((l3 / (1000 * 60 * 60)) / 24);
		int n = (int) ((l3 / (1000 * 60 * 60)) % 24);
		System.out.println(i + "일 " + n + "시간");

	}

}
