package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] arr = new Student[3];

		arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		arr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		arr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
		Employee[] emp = new Employee[10];

		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			for(int i = 0 ; i<emp.length;i++) {
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
				
				emp[i] = new Employee(name,age,height,weight,salary,dept);
				
				System.out.println(emp[i].toString());
				count++;
			
		    System.out.print("계속하시겠습니까? : ");
			char a = sc.nextLine().charAt(0);
		
			if(a == 'n'|| a=='N') {
				System.out.println("종료합니다.");
				break;
			}else {
				
			}
			}
			for(int i =0; i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}

	}

