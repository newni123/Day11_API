package com.iu.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import sun.net.www.content.audio.wav;

public class WeatherService {
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);

	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
	}

	// 메서드명 init
	// 날씨 정보를 파싱해서 저장
	public ArrayList<Weather> init(ArrayList<Weather> weathers) {
		String str = sb.toString();
		StringTokenizer st = new StringTokenizer(str, "-");
		System.out.println("======================================");
		while (st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			weathers.add(weather);

		}
		for (int i = 0; i < weathers.size(); i++) {
			System.out.println("도시 : " + weathers.get(i).getCity());
			System.out.println("기온 : " + weathers.get(i).getGion());
			System.out.println("습도 : " + weathers.get(i).getHumidity());
			System.out.println("상태 : " + weathers.get(i).getStatus());
			System.out.println("======================================");

		}
		return weathers;

	}

	// 메서드명 addWeather
	// 날씨 정보를 입력 받아서 추가
	// 지역 기온 습도 현재상태
	public ArrayList<Weather> addWeather(ArrayList<Weather> weathers) {

		Weather weather = new Weather();
		System.out.print("도시 : ");
		weather.setCity(sc.next());
		System.out.print("기온 : ");
		weather.setGion(sc.nextDouble());
		System.out.print("습도 : ");
		weather.setHumidity(sc.nextInt());
		System.out.print("상태 : ");
		weather.setStatus(sc.next());
		weathers.add(weather);
		return weathers;

	}

	// 메서드명 findWeather
	// 도시명을 입력받아서 해당 Weather 검색
	public Weather findWeather(ArrayList<Weather> weathers) {
		System.out.print("도시명을 입력하세요 : ");
		String select = sc.next();
		Weather weather = new Weather();
		for (int i = 0; i < weathers.size(); i++) {
			if (weathers.get(i).getCity().equals(select)) {
				weather = weathers.get(i);
				break;
			}
		}
		return weather;

	}
}
