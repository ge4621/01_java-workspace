package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	public void rps() {
		
		Scanner sc = new Scanner(System.in);
		// 필요한 자원 => 변수
		int total = 0; // 전승무패 중 전(게임수)
		int win = 0; // 승리수
		int tie = 0; // 무승부 수
		int lose = 0; // 패한 수

		System.out.print("당신의 이름을 입력해 주세요. : ");
		String name = sc.nextLine();

		while (true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); // exit

			int random = (int) (Math.random() * 3 + 1);// 랜덤 수는 경우의 수 만큼(1~3)
			String com = ""; // 1~3숫자가 가위바위보에 매치시킴

			switch (random) {/// 1 2 3
			case 1:
				com = "가위";
			case 2:
				com = "바위";
			case 3:
				com = "보";
			}

			if (rps.equals("exit")) { // exit를 입력한 경우에는 종류
				// 전승무패 출력 => 이따가
				System.out.println(total + "전" + win + "승" + tie + "무" + lose + "패");
				// 종료
				return;//매소드 밖을 빠져나가는 구문
				// 게임시작
			} else if (rps.equals("가위") || rps.equals("바위") || rps.equals("보")) {// 잘 입력한 경우
				total++;

				System.out.println("컴퓨터 : " + com); // 컴퓨터 : 가위(랜덤)
				System.out.println(name + ":" + rps);// 내가 낸 값 : 보(내가 입력)

				if (com.equals("가위")) {// 컴퓨터가 가위를 낸 경우
					switch (rps) {
					case "가위":
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "바위":
						System.out.println("이겼습니다.");
						win++;
						break;
					case "보":
						System.out.println("졌습니다.");
						lose++;
						break;
					}

				}
				if (com.equals("바위")) {// 컴퓨터가 바위를 낸 경우
					switch (rps) {
					case "바위":
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "보":
						System.out.println("이겼습니다.");
						win++;
						break;
					case "가위":
						System.out.println("졌습니다.");
						lose++;
						break;
					}
				}
				if (com.equals("가위")) {// 컴퓨터가 가위를 낸 경우
					switch (rps) {
					case "보":
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "가위":
						System.out.println("이겼습니다.");
						win++;
						break;
					case "바위":
						System.out.println("졌습니다.");
						lose++;
						break;

					}
				}
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
				
		/*
		//가위 => 1, 바위 => 2, 보 =>3
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int 가위 = 1;
			int 바위 = 2;
			int 보= 3;
			System.out.print("당신의 이름을 입력해주세요: ");
			String name = sc.nextLine();
			int com =(int)(Math.random()*3+1);  //컴퓨터 랜덤
			System.out.print("가위바위보 : ");
			String srp2 = sc.nextLine();
			int srp = sc.nextInt();
			
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
		*/
		}
	}
}

		

