package com.iu.Random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {

	public static void main(String[] args) {
		// 닭다리쿠션(40%), 최신휴대폰(10%), 은갈치넥타이(50%)
		Random random = new Random();
		int num = random.nextInt(10);
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("닭다리쿠션");
		ar.add("닭다리쿠션");
		ar.add("닭다리쿠션");
		ar.add("닭다리쿠션");
		ar.add("최신휴대폰");
		ar.add("은갈치넥타이");
		ar.add("은갈치넥타이");
		ar.add("은갈치넥타이");
		ar.add("은갈치넥타이");
		ar.add("은갈치넥타이");
		
		System.out.println(ar.get(num));
		
	}

}
