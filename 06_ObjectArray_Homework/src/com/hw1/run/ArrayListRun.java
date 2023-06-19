package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>(3);

		// System.out.println(list); //아직 담겨 있지 않음

		list.add(new Employee());
		list.add(new Employee(1, "홍길동", null, null, 19, 'M', 0, 0, "01022223333", "서울 잠실"));
		list.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
		}

		System.out.println("=====================================================");

		list.set(1, new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실"));
		list.set(0, new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주"));

		/*
		 * for(int i = 0 ; i<list.size();i++) {
		 * System.out.println(list.get(i).information()); }
		 */
		for (Employee e : list) {
			System.out.println(e.information());
		}

		System.out.println("================================================");

		// 보너스가 적용된 월급
		// 연봉 : (급여+(급여*보너스 포인트))*12
		
		for(Employee e : list) { //e=list.get(0)   e=list.get(1)
			System.out.println(((e.getSalary()+(int)(e.getSalary()*e.getBonusPoint())))*12);
		}
		
		
		
		int sum = 0;
		for(Employee e : list) {
			sum += (((e.getSalary()+(int)(e.getSalary()*e.getBonusPoint())))*12);
		}
		System.out.println("직원들의 연봉 평균 : " + sum/list.size() + "원");
		
/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println((list.get(i).getSalary() + (int)((list.get(i).getSalary() * list.get(i).getBonusPoint()))) * 12);
		}
		
		int sum = 0;
		for(int i = 0; i<list.size();i++) {
			sum += ((list.get(i).getSalary() + (int)((list.get(i).getSalary() * list.get(i).getBonusPoint()))) * 12);
		}
		System.out.println("직원들의 연봉 평균 : " + sum/list.size() + "원");
*/
	}
	}

