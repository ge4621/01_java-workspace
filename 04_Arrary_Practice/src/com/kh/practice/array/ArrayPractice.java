package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arry = new int[11];

		for (int i = 1; i <= 10; i++) {
			arry[i] = i;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(arry[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[11];
		
		for(int i = 10; i>=1; i--) {
			arr[i] = i;
		}
		for(int i = 10; i>=1;i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num +1];
		
		for(int i =1 ; i<num +1 ; i++) {
			arr[i] = i;
		}
		for(int i = 1 ; i < num +1 ; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}
	
	public void practice4() {
		String[] ft = {"사과","귤","포도","복숭아","참외"};
		System.out.println(ft[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		//인덱스 존재위치
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) :" );
		char[] arr = new char[str.length()];//문자배열 생성
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if(ch==arr[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//개수
		int count = 0;
	
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
			System.out.println(ch + "개수 : " + count);
		}

	/*public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()]; // char배열 생성(크기지정)

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i); // 값을 인덱스 자리에 대입
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (ch == arr[i]) {
				count++;

				System.out.println(arr[i] + "에 " + ch + "가 존재하는 위치(인덱스) :" + i);
			}
		}
		*/
		//System.out.println(ch + "개수 : " + count);
		//sc.close();
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] day = {"월","화","수","목","금","토","일"};
		if(num<0 || num >6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(day[num]+"요일");
		}
		sc.close();
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<=num ; i++) {
			arr[i] = i;
		}
		for(int i = 0; i<=num ; i++) {
			System.out.println(arr[i]);
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num + 1];

		if (num < 3) {
			System.out.println("다시 입력하세요");
		} else if (num >= 3) {
			if (num % 2 != 0) {
				for (int i = 1; i < num / 2 + 1; i++) {
					arr[i] = i;
				}
				for (int i = 1; i < num / 2 + 1; i++) {
					System.out.print(arr[i] + " ");
				}
				for (int i = num / 2 + 1; i >0; i--) {
					arr[num / 2 + 1] = num / 2 + 1;
					
				}
				for (int i = num / 2 + 1; i >0; i--) {
					num--;

					System.out.print(arr[i] + " ");
				}
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨의 이름을 입력하세요: ");
				
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		
		char[] arr = new char[num.length()]; //배열 선언??
		for(int i = 0; i<arr.length;i++) {  //선언된 배열에 대입???
			arr[i] = num.charAt(i);
		}
		char[] copy = new char[arr.length];
		for(int i = 0;i<arr.length;i++ ) {
			if(i<=7) {
				copy[i] = arr[i];
			}else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		
	}
	
}
