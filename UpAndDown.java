package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	public void upDown() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int user = sc.nextInt();
			int num =(int)(Math.random()*100+1);
			if(user>num) {
				System.out.println("UP!");
			}else if(user<num) {
				System.out.println("Down!");
			}else {
				System.out.println("정답입니다.!!");
				break;
			}
		}
		
		
		
	}
}
