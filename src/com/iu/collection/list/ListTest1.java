package com.iu.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		// 1, 2, 3
		ArrayList ar = new ArrayList();
		
		ar.add(0);
		ar.add(1);
		ar.add(2);
		
		ar.add(1, "two");
		ar.set(1,1000);
		ar.remove(1);
		// ar.clear();
		
		int num = 0;
		Integer n = num;// auto Boxing
		ar.add(num); // auto Boxing

		
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
	}

}
