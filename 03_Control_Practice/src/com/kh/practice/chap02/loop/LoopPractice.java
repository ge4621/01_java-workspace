package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력해세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(num + " = " + sum);
			}
		}
		sc.close();
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 값을 입력하세요.");
		} else if (num1 >= 1 && num2 >= 1) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else if (num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}

		}
sc.close();
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1이상의 숫자를 입력하시오.");

			} else if (num1 >= 1 && num2 >= 1) {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
					break;
				} else if (num2 > num1) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
					break;
				}

			}
		}
		sc.close();

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		int dan = num;
		System.out.println("======== " + dan + "단 =====");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		sc.close();
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		int dan = num;

		if (num >= 10) {
			System.out.println("9이하의 숫자만 입력해주세요.");
		} else {
			for (dan = num; dan <= 9; dan++) {
				System.out.println("========= " + dan + "단========");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
			}
		}
		sc.close();

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			int dan = num;

			if (num <= 9) {
				for (dan = num; dan <= 9; dan++) {
					System.out.println("========" + dan + "단========");
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d\n", dan, i, dan * i);
					}
				}
				break;
			} else {
				System.out.println("9이하의 숫자만 입력하세요.");
			}
		}
		sc.close();
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		if(num2>=0) {
			for(int i = num1; i <= num1 +(9 *num2) ;i+=num2) {
				System.out.print(i + " ");
				}
			}else if(num2<0) {
				for(int i = num1; i >= num1 + (9*num2) ; i+=num2) {
					System.out.print(i + " ");
				}
		}
		sc.close();

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			switch (str) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌수 없습니다.");
					continue;
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				}
				break;
			case "%":
				System.out.printf(num1 + " % " + num2 + " = " +(num1 % num2));
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		sc.close();
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.: ");
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			for (int s = num; s > j; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}