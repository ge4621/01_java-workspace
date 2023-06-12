package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student[] arr = new Student[3];
		// 3명의 학생 정보 초기화
		arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		arr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		arr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		// 학생정보 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		///// 학생 정보 출력

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] emp = new Employee[10];

		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		Scanner sc = new Scanner(System.in); // 키보드 입력

		int count = 0;
		
		//강사님 코드(간결하다....)
		
		while (true) { // 무한 반복
			// for (int i = 0; i < emp.length; i++) {

			System.out.println((count + 1) + "번째 사원");

			System.out.print("이름을 입력하세요. : ");
			String name = sc.nextLine();

			System.out.print("나이를 입력하세요. : ");
			int age = sc.nextInt();

			System.out.print("키를 입력하세요. : ");
			double height = sc.nextDouble();

			System.out.print("몸무게를 입력하세요. : ");
			double weight = sc.nextDouble();

			System.out.print("급여을 입력하세요. : ");
			int salary = sc.nextInt();

			sc.nextLine();

			System.out.print("부서를 입력하세요. : ");
			String dept = sc.nextLine();

			emp[count] = new Employee(name, age, height, weight, salary, dept);

			// 한명씩 추가 될때마다 카운트
			count++;

			// System.out.println(emp[i].toString());

			System.out.print("계속하시겠습니까? : ");
			char a = sc.nextLine().charAt(0);

			// 계속 추가 할 것인지 물어보고 ,대소문자 상관없이 y이면 계속,n이면 그만 입력

			if (a == 'n' || a == 'N') {
				// 반복문 빠져나와
				break;
			}
		
			// 출력
			if (count == 10) {
				break;
			}

		}
		// 배열에 담긴 사원들의 정보를 모두 출력
		for (int i = 0; i < count; i++) {
			System.out.println(emp[i]);


		}
		System.out.println("종료합니다.");

	}
	/*
	<내가 한 코드>
	Employee[] emp = new Employee[10];

	// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
	Scanner sc = new Scanner(System.in); // 키보드 입력

	int count = 0;
	
	while (true) { // 무한 반복
		for (int i = 0; i < emp.length; i++) {

			System.out.print("이름을 입력하세요. : ");
			String name = sc.nextLine();

			System.out.print("나이를 입력하세요. : ");
			int age = sc.nextInt();

			sc.nextLine();

			System.out.print("키를 입력하세요. : ");
			double height = sc.nextDouble();

			System.out.print("몸무게를 입력하세요. : ");
			double weight = sc.nextDouble();

			System.out.print("급여을 입력하세요. : ");
			int salary = sc.nextInt();

			sc.nextLine();

			System.out.print("부서를 입력하세요. : ");
			String dept = sc.nextLine();

			count++;

			emp[i] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.println(emp[i].toString());

			System.out.print("계속하시겠습니까? : ");
			char a = sc.nextLine().charAt(0);

			if (a == 'n' || a == 'N') {
				System.out.println("종료합니다.");

				for (int j = 0; j < emp.length; j++) {
					if(emp[j] != null) {
						System.out.println(emp[j].toString());
						
					}
				}

				break;
				
			} else if (a == 'y' || a == 'Y') { // 실행구문에 쓸게 없으면 지우기 (지워야 하는데 여기서 지우면 오류가 뜬다.....)
				
			}

		}
		break;
	
	}
	*/

}
