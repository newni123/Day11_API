package com.iu.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.collection.ex2.Student;

public class WeatherMenu {

	// 메서드명은 start
	// 1. 날씨 정보 초기화 - init
	// 2. 날씨 정보 추가 - addWeather
	// 3. 전체 날씨 정보 - view
	// 4. 지역 날씨 검색 - findWeather,view
	// 5. 프로그램 종료
	Scanner sc = new Scanner(System.in);
	WeatherService ws = new WeatherService();
	WeatherView wv = new WeatherView();
	ArrayList<Weather> weathers = new ArrayList<Weather>();
	Weather weather = new Weather();
	public ArrayList<Weather> start() {

		boolean check = true;
		while (check) {

			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 추가");
			System.out.println("3. 전체 날씨 정보");
			System.out.println("4. 지역 날씨 검색");
			System.out.println("5. 프로그램 종료");
			System.out.print("작업을 선택하세요 : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println();
				ws.init(weathers);
				System.out.println();
				break;
			case 2:
				System.out.println();
				ws.addWeather(weathers);
				System.out.println();
				break;
			case 3:
				System.out.println();
				wv.view(weathers);
				System.out.println();
				break;
			case 4:
				System.out.println();
				weather = ws.findWeather(weathers);
				wv.view(weather);
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("프로그램 종료");
				check = false;
				break;
			}
		}
		return null;
	}
}
