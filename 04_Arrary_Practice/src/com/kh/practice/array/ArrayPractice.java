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
			sc.close();
	}

	
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
		int num = sc.nextInt();     //정수 입력

		int[] arr = new int[num]; 
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");

		System.out.println();
		System.out.println("총 합 : " + sum);	
		sc.close();
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

		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine(); // 사용자 입력

		String[] arr = { "후라이드", "양념", "파닭", "크크크" }; // 배렬

		boolean result = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(name)) {
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println(name + "치킨 배달 가능");

		} else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
		sc.close();
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
	sc.close();	
	}
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max = 10;
		int min = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
			if (arr[i] < max) {
				max = arr[i];
			}

		}
		System.out.println("최대값 : " + min);
		System.out.println("최소값 : " + max);
	}
	
	public void practice13() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;   //i값을 줄여 준다 => 중복시 다음 인덱스로 넘어가지 않고 해당 인덱스에 다시 난수 값을 뽑는다.
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
			}
			}
		}
	}
		

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = str.charAt(i);
			arr[i]=str.charAt(i);
		}
	}
}
