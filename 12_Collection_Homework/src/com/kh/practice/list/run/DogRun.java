package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Dog> dog = new ArrayList<>(4);

		for (int i = 0; i < 5; i++) {

			System.out.print(i + 1 + "번째 강쥐 이름 입력 : ");
			String dname = sc.nextLine();
			System.out.print("강쥐 나이 입력 : ");
			int dage = sc.nextInt();

			sc.nextLine();

			System.out.print("강쥐 종 입력(ex: 말티즈) : ");
			String dkind = sc.nextLine();
			
			if (i == 4) {
				dog.add(2, new Dog(dname, dage, dkind));
			} else {
				dog.add(new Dog(dname, dage, dkind));
			}
		}
		System.out.println("========================================");
		System.out.println("전체 강아지 출력");
		System.out.println("======================================");
		
		for(Dog d :dog) {
			System.out.println(d);
		}
		
		System.out.println("======================================");
		System.out.println("이름에 '구'가 들어간 강쥐 정보 출력");
		System.out.println("=================================");
		
		int a = 0;
		for(Dog d : dog) {
			if (d.getName().contains("구")) {
				System.out.println(d);
				a++;
			}
		}
		System.out.println("이름에 '구'가 들어가는 강쥐는 총 "+a+"마리 입니다.");
		
	}

}
