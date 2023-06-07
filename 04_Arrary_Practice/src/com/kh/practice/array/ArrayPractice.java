package com.kh.practice.array;

import java.util.Arrays;
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
		
		//조건 : 3이상 홀수 자연수 -> 3이상도 아니고 짝수이면 다시 -> 3이상 홀수면 잘함
		Scanner sc = new Scanner(System.in);
		
		//조건이 맞을때까지 반복 => while
		while(true) {
			//정수 입력
			System.out.print("정수 : ");
			int num = sc.nextInt();   //3이상 - num >=3 , 홀수 - num %2==1
			
			if(num>=3 && num % 2 ==1) { //num이 3이상 홀수일때만 작동
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1, 2, 3, 2, 1}  =>2번 인덱스 까지 증가 그 이후로 감소
				 * 7입력 시 => {1, 2, 3, 4, 3, 2, 1} => 3번 인덱스 까지 증가 그 이후로 감소
				 * 9입력 시 => 4번 인덱스 까지 증가 그 이후로 감소
				 * 
				 * =>규칙 : 배열의 길이 / 2인덱스 까지 증가 그이후부터 감소
				 */
				int value = 1;
				for(int i = 0; i<arr.length;i++) {  //값대입
					arr[i] = value;
					if(i<arr.length / 2) {
						value++;
					}else {
						value--;
					}
				}
				for(int i = 0;i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("다시입력하세요");
			}
		}
		
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num+1];

		if (num < 3) {
			System.out.println("다시 입력하세요");
		} else if (num >= 3) {
			if (num % 2 != 0) {
				for (int i = 1; i < num / 2+1; i++) {
					arr[i] = i;
				}
				for (int i = 1; i < num / 2+1; i++) {
					System.out.print(arr[i] + " ");
				}
				for (int i = num / 2+1; i >0; i--) {
					arr[num / 2 + 1] = num / 2 + 1;
					
				}
				for (int i = num / 2+1; i >0; i--) {
					num--;

					System.out.print(arr[i] + " ");
				}
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
		*/
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
			arr[i] = (int) (Math.random() * 10 + 1); // 탐색을 해야 할 경우 반복문(for문)사용
			for (int j = 0; j < i; j++) { // 핵심
				if (arr[i] == arr[j]) {
					// 중복제거???? -> 랜덤한수를 다시 만들어야 됨 ;코드있다.
					i--; // 핵심
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		/*
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
		}*/
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
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			
		}
		
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];
		int count = 0; // 문자 개수 출력

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {// char배열 값 대입
			arr[i] = str.charAt(i);

			// 중복제거 ??-> 출력 ... apple -> a, p , l ,e
			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) { // apple-> a p p(flag넣기) l e
					flag = false; // 중복있을 때
				}
			}
			if (flag/* flag == true */) { // 중복 없을때
				count++;
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
			}
		}
		System.out.println();
		System.out.print("문자열의 개수 : " + count);
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = str.charAt(i);
			arr[i]=str.charAt(i);       
			
			
		}
		*/
		sc.close();
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		String[] origin = new String[num];
		String[] copy = null;

		for (int i = 0; i < origin.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			origin[i] = sc.nextLine();
			
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);// y,Y,N,n
			if (ch == 'Y' || ch == 'y') {// 더 입력하겠다는 경우
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();
				sc.nextLine();
				
				copy = Arrays.copyOf(origin, origin.length + num);

				for (int i = origin.length; i < copy.length; i++) {
					System.out.printf("%d번째 문자열 : ", i + 1);
					copy[i] = sc.nextLine();
				}
				// origin = copy;//주소값 바꾸기,안해도 되는 과정
			} else {// 그만하는 경우
				System.out.print("[");
				for (int i = 0; i < origin.length; i++) {
					if (i == origin.length - 1) {// 마지막 인덱스인경우
						System.out.printf("%s", origin[i]);
					} else {
						System.out.printf("%s, ", origin[i]);
					}
				}
				System.out.println("]");
				break;
			}
		}
	}
}
