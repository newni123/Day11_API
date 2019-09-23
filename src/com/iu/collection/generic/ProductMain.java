package com.iu.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer= new Computer();
		NoteBook noteBook = new NoteBook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer와 Compter를 상속 받은 타입.
		//ar.add(computer);
		
		
		
		// <Generic> 타입에 제한을 줌
	/*	ArrayList<Product> ar = new ArrayList<Product>();
		ar.add(tv);
		ar.add(computer);
		
		ArrayList<Product> ar2 = new ArrayList<Product>();
		
		// ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>(); // ar과 ar2를 담은 ar3
		HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>(); // arrayList 키값엔 오브젝트 타입이면 다 됨
		*/
		
		
	}

}
