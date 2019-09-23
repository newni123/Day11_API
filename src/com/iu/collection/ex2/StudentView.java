package com.iu.collection.ex2;

import java.util.ArrayList;


public class StudentView {

	// 메서드명은 view
	// 학생들의 정보를 전부 출력
	public void view(ArrayList<Student> students) {
		System.out.println("==================================");
		for (int i = 0; i < students.size(); i++) {
			System.out.println("이름 : " + students.get(i).getName());
			System.out.println("번호 : " + students.get(i).getNum());
			System.out.println("국어 : " + students.get(i).getKor());
			System.out.println("영어 : " + students.get(i).getEng());
			System.out.println("수학 : " + students.get(i).getMat());
			System.out.println("총점 : " + students.get(i).getSum());
			System.out.println("평균 : " + students.get(i).getAvg());
			System.out.println("==================================");
		}
	}
	// 메서드명은 view
	// 학생 1명을 출력
	public void view(Student student) {
		
		System.out.println("==================================");
		System.out.println("이름 : " + student.getName());
		System.out.println("번호 : " + student.getNum());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMat());
		System.out.println("총점 : " + student.getSum());
		System.out.println("평균 : " + student.getAvg());
		System.out.println("==================================");
	}

}
