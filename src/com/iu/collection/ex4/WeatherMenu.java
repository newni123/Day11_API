package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;


public class WeatherMenu {

	// 메서드명은 start
	// 1. 날씨 정보 초기화 - init
	// 2. 날씨 정보 추가 - addWeather
	// 3. 전체 날씨 정보 - view
	// 4. 지역 날씨 검색 - findWeather,view
	// 5. 프로그램 종료
	private WeatherService weatherService;
	private WeatherView weatherView;
	private HashMap<String,Weather> map;


	public WeatherMenu() {
		map = new HashMap<String, Weather>();
		weatherService = new WeatherService();
		weatherView = new WeatherView();
		HashMap<String,Weather> map = new HashMap<String, Weather>();
		
	}

	Scanner sc = new Scanner(System.in);

	public void start() {

		boolean check = true;
		while (check) {

			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 추가");
			System.out.println("3. 전체 날씨 정보");
			System.out.println("4. 지역 날씨 검색");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("작업을 선택하세요 : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println();
				map = weatherService.init();
				System.out.println();
			case 2:
				System.out.println();
				weatherService.addWeather(map);
				System.out.println();
				break;
			case 3:
				System.out.println();
				weatherView.view(map);
				System.out.println();
				break;
			case 4:
				Weather weather = weatherService.findWeather(map);
				if(weather != null) {
					weatherView.view(weather);
				} else {
					weatherView.view("해당 지역의 정보가 없습니다.");
				}
				break;
			case 5 : 
				weather = weatherService.deleteWeather(map);
				if(weather != null) {
					weatherView.view("삭제하였습니다.");
				} else {
					weatherView.view("찾으시는 정보가 없습니다.");
				}
				break;
			default:
				System.out.println();
				System.out.println("프로그램 종료");
				check = false;
				break;
			}
		}

	}

}