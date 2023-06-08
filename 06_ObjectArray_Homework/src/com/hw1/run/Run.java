package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
		}
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		emp[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		for(int i = 0; i<emp.length;i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		System.out.println("=========================================");
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJod("팀장");
	}

}
