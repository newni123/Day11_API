package com.iu.Random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest3 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("불고기");
		ar.add("라면");
		ar.add("햄버거");
		ar.add("돈가스");
		ar.add("굶기");
		ar.add("떡볶이");
		Random random = new Random();
		int n = random.nextInt(ar.size());
		System.out.println(ar.get(n));

	}

}
