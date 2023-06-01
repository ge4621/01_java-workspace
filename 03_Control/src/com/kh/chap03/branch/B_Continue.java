package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; :반복문 안에 기술되는 구문 continue;구문 실행시 그 뒤의 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로
	 * 올라간다.
	 */

	public void method1() {
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9

		/*
		 * for(int i = 1; i<=10; i+=2) { System.out.print( i + " ");
		 */
		/*
		 * for(int i = 1; i<=10; i++) { if(i % 2 == 1) { System.out.print(i + " ");
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기라고 생각하자
				// 반복문 실행안하고 반복문 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}
	}

	//ctrl + shift + f  //코드 정렬
	//alt + 방향키  //코드 이동
	
	public void method2() {
		//1부터 100까지의 총합계
		//단 6의 배수값은 빼고 덧세연산한겠다.
		
		//1부터 100까지의 총합계 먼저 for문 작성해보기
		int sum = 0;
		for(int i = 1; i<=100; i++) { // 6 12 18 24 ....
			
			if(i % 6 == 0) {//6의 배수란 이야기
				continue; //건너뒤고 증감만!!
			}
			sum +=i; //누적합 공식
		}
		
		System.out.println("1부터 100까지의 합계 : " + sum);
	}
	public void method3() { 
		//2~9단까지 출력
		//단, 3의 배수단을 빼고 출력
		
		//구구단 = 이중 for문
		for(int dan = 2;dan<=9;dan++) {
			
			if(dan % 3 == 0) {
				continue;
			}
			System.out.println("==========" + dan + "단========");
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
		
		
		
	}

}
