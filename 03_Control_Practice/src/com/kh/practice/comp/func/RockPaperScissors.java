package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	public void rps() {
		
		//가위 => 0, 바위 => 1, 보 => 2
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("당신의 이름을 입력해주세요: ");
			String name = sc.nextLine();
			System.out.print("가위바위보 : ");
			int srp = sc.nextInt();
			int com =(int)(Math.random()*3);  //컴퓨터 랜덤
			
			if(srp == 0 &&com==0) {
				System.out.print("컴퓨터 : 가위");
				System.out.print(name + ": 가위");
				System.out.println("비겼습니다.");
				continue;
			}else if(srp == 1 &&com==1) {
				System.out.print("컴퓨터 : 바위");
				System.out.print(name + ": 바위");
				System.out.println("비겼습니다.");
				continue;
			}else if(srp == 2 &&com==2) {
				System.out.print("컴퓨터 : 보");
				System.out.print(name + ": 보");
				System.out.println("비겼습니다.");
				continue;
			}else if(srp == 0 &&com==1) {
				System.out.print("컴퓨터 : 가위");
				System.out.print(name + ": 바위");
				System.out.println("이겼습니다.");
				continue;
			}else if(srp == 0 &&com==2) {
				System.out.print("컴퓨터 : 가위");
				System.out.print(name + ": 보");
				System.out.println("졌습니다.");
				continue;
			}else if(srp == 1 &&com==0) {
				System.out.print("컴퓨터 : 바위");
				System.out.print(name + ": 가위");
				System.out.println("졌습니다.");
				continue;
			}else if(srp == 1 &&com==2) {
				System.out.print("컴퓨터 : 바위");
				System.out.print(name + ": 보");
				System.out.println("이겼습니다.");
				continue;
			}else if(srp == 2 &&com==0) {
				System.out.print("컴퓨터 : 보");
				System.out.print(name + ": 가위");
				System.out.println("이겼습니다.");
				continue;
			}else if(srp == 2 &&com==1) {
				System.out.print("컴퓨터 : 보");
				System.out.print(name + ": 바위");
				System.out.println("졌습니다.");
				continue;
			}else if(){
				System.out.println("");
			}
		
		
		
		
		
			
			
					
			
			
		}
	}
}
		

