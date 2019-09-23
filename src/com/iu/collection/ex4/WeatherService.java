package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	private StringBuffer sb;
	private Scanner sc;

	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
	}

	// 메서드명 init
	// 날씨 정보를 파싱해서 저장
	// HashMap에 추가
	// 키는 도시명, Value Weather
	public HashMap<String, Weather> init() {
		String str = sb.toString();
		HashMap<String, Weather> map = new HashMap<String, Weather>();
		StringTokenizer st = new StringTokenizer(str, "-");
		System.out.println("======================================");
		while (st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			map.put(weather.getCity(), weather);
		}
		return map;

	}

	// 메서드명 addWeather
	// 날씨 정보를 입력 받아서 추가
	// 지역 기온 습도 현재상태
	public HashMap<String, Weather> addWeather(HashMap<String, Weather> map) {
		Weather weather = new Weather();
		System.out.print("도시명을 입력하세요 : ");
		String city = sc.next();
		weather.setCity(city);
		System.out.print("기온을 입력하세요 : ");
		double gion = sc.nextDouble();
		weather.setGion(gion);
		System.out.print("습도를 입력하세요 : ");
		int humidity = sc.nextInt();
		weather.setHumidity(humidity);
		System.out.print("상태를 입력하세요 : ");
		String status = sc.next();
		weather.setStatus(status);
		map.put(city, weather);
		return map;

	}

	// 메서드명 findWeather
	// 도시명을 입력받아서 해당 Weather 검색
	public Weather findWeather(HashMap<String, Weather> map) {
		System.out.print("도시명을 입력하세요 : ");
		String city = sc.next();
		Weather weather = map.get(city);
		return weather;

	}

	public Weather deleteWeather(HashMap<String, Weather> map) {
		// 도시명을 입력받아 해당 정보를 삭제
		System.out.print("도시명을 입력하세요 : ");
		String city = sc.next();
		Weather weather = map.remove(city);
		return weather;

	}
}
