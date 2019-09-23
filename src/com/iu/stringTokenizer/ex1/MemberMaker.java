package com.iu.stringTokenizer.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {
	private String memberInfo;

	public MemberMaker() {
		this.memberInfo = "iu-iu-27-choa-choa-28-suji-suji-30";
	}

	public void makeMember() {
		// MemberInfo의 내용을 파싱하고
		// member 객체를 생성해서
		// 모든 정보를 출력하기
		StringTokenizer st = new StringTokenizer(memberInfo, "-");
		ArrayList<Member> ar = new ArrayList<Member>();
		while (st.hasMoreTokens()) {
			Member member = new Member();
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			ar.add(member);

		}
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("id : " + ar.get(i).getId());
			System.out.println("이름 : " + ar.get(i).getName());
			System.out.println("나이 : " + ar.get(i).getAge());

		}

	}
}
