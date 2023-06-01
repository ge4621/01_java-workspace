package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("양수가 아닙니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print("수" + " ");
				} else {
					System.out.print("박" + " ");
				}
			}
		}
		sc.close();
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if (num < 1) {
				System.out.println("양수가 아닙니다.");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						System.out.print("수" + " ");
					} else {
						System.out.print("박" + " ");
					}
				}
				break;
			}
		}
		sc.close();

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(str + "안에 포함된" + ch + "개수 : " + count);
		sc.close();
	}

	public void practice4() {
		
		
	}
}
