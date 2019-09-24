package com.iu.test;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	private Machine machine;
	private Scanner sc;

	public Menu() {
		machine = new Machine();
		sc = new Scanner(System.in);
	}

	public void select() {

		//boolean check = true;

		// while (check) {
		System.out.println("1. Cola");
		System.out.println("2. Cider");
		System.out.println("3. Water");
		System.out.println("4. Exit");
		System.out.print("음료를 선택하세요 : ");
		int select = sc.nextInt();
		Drink drink = null;
		/*
		 * Cola cola = null; Cider cider = null; Water water = null;
		 */
		if (select == 1) {
			drink = machine.makeCola();
		} else if (select == 2) {
			drink = machine.makeCider("Sprite", 1500, Calendar.getInstance());
		} else if (select == 3) {
			drink = machine.makeWater();
		} else {
			// break;
		}
		System.out.println(drink.getBrand());
		// }

	}

}
