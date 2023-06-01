package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	public void rps() {
		
		//가위 => 1, 바위 => 2, 보 =>3
		Scanner sc = new Scanner(System.in);
		int 가위 = 1;
		int 바위 = 2;
		int 보= 3;
		
		while(true) {
			System.out.print("당신의 이름을 입력해주세요: ");
			String name = sc.nextLine();
			System.out.print("가위바위보 : ");
			String srp2 = sc.nextLine();
			int srp = sc.nextInt();
			int com =(int)(Math.random()*3+1);  //컴퓨터 랜덤
			
			switch(com) {
			case 1:
				if(srp == 1) {
					System.out.println("컴푸텨 : 가위");
					System.out.println(name + " : 가위");
					System.out.println("비겼습니다.");
				}else if(srp == 2) {
					System.out.println("컴푸텨 : 가위");
					System.out.println(name + " : 바위");
					System.out.println("이겼습니다.");
				}else if(srp == 3) {
					System.out.println("컴푸텨 : 가위");
					System.out.println(name + " : 보");
					System.out.println("졌습니다.");
				}
				continue;
			case 2:
				if(srp == 1) {
					System.out.println("컴푸텨 : 바위");
					System.out.println(name + " : 가위");
					System.out.println("졌습니다.");
				}else if(srp == 2) {
					System.out.println("컴푸텨 : 바위");
					System.out.println(name + " : 바위");
					System.out.println("비겼습니다.");
				}else if(srp == 3) {
					System.out.println("컴푸텨 : 바위");
					System.out.println(name + " : 보");
					System.out.println("이겼습니다.");
				}
				continue;
			case 3:
				if(srp == 1) {
					System.out.println("컴푸텨 : 보");
					System.out.println(name + " : 가위");
					System.out.println("이겼습니다.");
				}else if(srp == 2) {
					System.out.println("컴푸텨 : 보");
					System.out.println(name + " : 바위");
					System.out.println("졌습니다.");
				}else if(srp == 3) {
					System.out.println("컴푸텨 : 보");
					System.out.println(name + " : 바위");
					System.out.println("이겼습니다.");
				}
				continue;
			}
				if(srp !=srp) {
					System.out.println("잘못입력했습니다.");
				}else {
					System.out.println("종료합니다.");
				}
		
		
		
		
		
			
			
					
			
			
		}
	}
}
		

