package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	// 메서드명 view
	// 날씨 하나 정보 출력
	public void view(Weather weather) {
		System.out.println("도시 : " + weather.getCity());
		System.out.println("기온 : " + weather.getGion());
		System.out.println("습도 : " + weather.getHumidity());
		System.out.println("상태 : " + weather.getStatus());
	}
	public void view(String str) {
		System.out.println(str);
	}
	// 메서드명 view
	// 날씨 전체 정보 출력
	public void view(HashMap<String, Weather> map) {
		// 1. Key들을 모을 Iterator 생성
		Iterator<String> it = map.keySet().iterator();
		System.out.println("======================================");
		while (it.hasNext()) { 
			String key = it.next();
			Weather weather = map.get(key);
			System.out.println("도시 : " + weather.getCity());
			System.out.println("기온 : " + weather.getGion());
			System.out.println("습도 : " + weather.getHumidity());
			System.out.println("상태 : " + weather.getStatus());
		}

	}



}
