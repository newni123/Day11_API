package com.iu.Random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		// 로또 번호 출력
		// 1~45

		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1; // nextInt(1) = 0 으로 시작해서 최종 숫자보다 1개 많게 설정 해야함
			ar.add(num);
			
			for (int j = 0; j < i; j++) {
				if (num == ar.get(j)) {
					i--;
					ar.remove(j);
					break;
				}
			}
		}
		for (int i = 0; i < ar.size(); i++)
			System.out.print(ar.get(i)+" ");
	}

}