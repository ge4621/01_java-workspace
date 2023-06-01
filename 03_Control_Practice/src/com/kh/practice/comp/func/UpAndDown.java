package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	public void upDown() {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		int count = 0;
		while (true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int user = sc.nextInt();
			if(user >100 || user<1) {
				System.out.println("1부터 100사이의 정수를 입력하세요");
			}else if(user>num) {
				System.out.println("Down");
				count++;
				continue;
			}else if(user<num) {
				System.out.println("UP");
				count++;
				continue;
			}else if(user == num) {
				System.out.println("정답입니다.");
			}
				break;
		}
		System.out.printf("%d회 만에 맞추셨습니다.",count);
	}
}