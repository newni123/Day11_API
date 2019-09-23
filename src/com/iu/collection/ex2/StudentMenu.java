package com.iu.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<Student> students;
	StudentService ss = new StudentService();
	StudentView sv = new StudentView();
	Student student;

	
	public StudentMenu() {
		students = new ArrayList<Student>();
	}
	public ArrayList<Student> start() {
		
		// 1. 학생 정보 등록
		// 2. 학생 전체 정보
		// 3. 학생 정보 조회 - 이름으로 검색
		// 4. 학생 정보 삭제
		// 5. 프로그램 종료
		boolean check = true;
		while (check) {
			
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 전체 정보");
			System.out.println("3. 학생 정보 조회");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("작업을 선택하세요 : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println();
				ss.studentInput(students);
				System.out.println();
				break;
			case 2:
				System.out.println();
				sv.view(students);
				System.out.println();
				break;
			case 3:
				System.out.println();
				Student student = ss.studentSearch(students);
				sv.view(student);
				System.out.println();
				break;
			case 4:
				System.out.println();
				student = ss.studentSearch(students);
				ss.studentDelete(students,student);
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("프로그램 종료");
				check = false;
				break;
			}
		}
		return students;
	}

}
