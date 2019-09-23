package com.iu.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	// studentDelete
	// 이름을 입력해서 해당 학생의 정보를 삭제
	public void studentDelete(ArrayList<Student> students,Student student) {
		students.remove(student); // 위에 것도 되는데 Search에 있는거 재사용하는게 더 나음
	}
	
	/*public String studentDelete(ArrayList<Student> students,Student student) {
		String name = sc.next();
		String msg = "Delete Fail";
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				msg = "Delete Success";
				break;
			}
		}
		return msg;
	}*/

	// 메서드명은 studentSearch
	// 학생의 이름을 입력받아서, 이름이 같은 학생을 리턴

	public Student studentSearch(ArrayList<Student> students) {
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.next();
		Student student = new Student();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				student = students.get(i);
				break;
			}

		}
		return student;

	}

	// 메서드 명은 studentInput
	// 학생의 정보 입력
	Scanner sc = new Scanner(System.in);

	public ArrayList<Student> studentInput(ArrayList<Student> students) {
		System.out.print("학생의 수를 입력하세요 : ");
		int count = sc.nextInt();
		System.out.println();
		for (int i = 0; i < count; i++) {
			Student student = new Student();
			System.out.print("이름을 입력하세요 : ");
			student.setName(sc.next());
			System.out.print("번호를 입력하세요 : ");
			student.setNum(sc.nextInt());
			System.out.print("국어 점수를 입력하세요 : ");
			student.setKor(sc.nextInt());
			System.out.print("영어 점수를 입력하세요 : ");
			student.setEng(sc.nextInt());
			System.out.print("수학 점수를 입력하세요 : ");
			student.setMat(sc.nextInt());
			student.setSum(student.getKor() + student.getEng() + student.getMat());
			student.setAvg(student.getSum() / 3.0);
			System.out.println();
			students.add(i, student);
		}
		return students;
	}
}
