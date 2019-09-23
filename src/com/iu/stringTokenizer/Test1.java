package com.iu.stringTokenizer;

//import java.util.ArrayList;		 // ┐
//								    //  ├ java.util.* 이걸쓰면 한 번에 됨
import java.util.StringTokenizer;  //   ┘ 	



public class Test1 {

	public static void main(String[] args) {
		//Member m = new Member(); 	
		//com.iu.m2.Member m2 = new com.iu.m2.Member(); // 같은 클래스명을 가진 다른패키지는 같이 임포트 시킬수 없어서 풀패키지로 작성해야 함
		
		// 파싱
		//
		String str = "iu,27,suji,24,choa,30,hani,25";	
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens() /* = boolean타입 잘릴 문자열이 더 있으면 true 없으면 false*/) {
			String s = st.nextToken(); // 문자열을 파싱
			String age = st.nextToken(); // 호출 여러 번 할 수 있음
			System.out.println(s);
			System.out.println(age);
		}
			
		// ArrayList<E>;
		
	}

}
