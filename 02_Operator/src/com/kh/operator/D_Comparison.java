package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * *비교 연산자 / 관계연산자 (이항연산자)
	 * 두 값을 비교한는 연산자
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반함
	 * 
	 *  대소비교 연산자 : < , > , <= , >=
	 *  동등비교 연산자 : ==, !=
	 *  
	 */
	public void method1() {
		//int a = 10, b = 25, c = 30; //가능하긴 하나 권장하지 않는다. 가독성이 떨어진다.!!!
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));  //false
		System.out.println("a == b : " + (a != b));  //true
		System.out.println("a <= b : " + (a <= b)); //true
		
		boolean result = (a > b); //false //중요!!!!
		System.out.println("a > b : " + result);
		
		//산술연산 + 비교연산
		System.out.println((a * 2) > (b / 5));
		
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 != 0));  //비교연산자
		System.out.println("a가 홀수인가 : " + !(a % 2 == 0)); //논리부정연산자
		System.out.println("a가 홀수인가 : " + (a % 2 ==1)); //비교연산자
		
		//2로 나눴을 때의 나머지가 0일 경우 == 2로 나눠떨어진다는 의미 == 짝수
		//2로 나눴을 떄의 나머지가 1일 경우 == 2로 나눠떨어지지 않음 == 홀수
		
	}

	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째가 두번째 보다 큽니까? : " + (num1 > num2));
		System.out.println("첫번째 정수가 짝수입니까? : " + (num1 % 2 ==0));
		
		//특이케이스(문자와 숫자간의 대소비교가 가능!!) - 아스키코드
		System.out.println(num2 < 'A'); // 자동형변환
		//'A'~'Z' : 65~90
		
		sc.close();
		
	}
}
