package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼항연산자(항목 3개를 가지고 연산해주는 연산자
	 * 
	 * [표현식]
	 * 조건식 ? 조건식이 참이 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 *  
	 * 이때, 조건식은 반드시 true 또는 false가 나오도록 작성해야됨!!!
	 * 주로 비교, 논리연사자를 통해 작성할꺼임
	 * 
	 */
	public void method1() {
		//입력받은 정수 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//String result = 조건 ? 참일경우 : 거짓일경우
		//String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		
		//XX는(은) XXX
		//7은 양수입니다. -99는 음수입니다.
		//**조건 : sysout는 한번만 사용
		
		//String result = (num > 0) ? "양수입니다." : "음수입니다.";
		//System.out.println(num +"은 " + result);  //내가 만든 코드
		
		//String result = (num > 0) ? num + "은 양수입니다." : num + "은 음수입니다.";
		//System.out.println(result);  //기초적인 방법
		
		System.out.println(num + "은(는) " + ((num > 0)? "양수입니다." : "음수입니다."));
		
	}
	
	public void method2() {
		//입력받은 정수 값이 짝수인지 홀수 인지 판별후
		//3은 홀수입니다. 4는 짝수입니다. 형식으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num %2 ==0? "짝수이다." : "홀수이다.";
		//String result = num % 2 ==1? "홀수이다." : "짝수이다";
		
		System.out.println(result);
		
	}
	public void method3() {
		//사용자에게 종류여부를 입력 받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종류하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종류합니다.": "계속진행하겠습니다.";
		System.out.println(result);
	}
	public void method() {
		//영문자 입력받아서, 영어 소문자인지 아닌지 판별 후 출력
		//출력 형식 : a는 소문자 입니디ㅏ. F는 소문자가 아닙니다.
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("영문자 하나를 입력하세요. : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a') && (ch<='z')?"소문자 입니다.":"대문자입니다.";
		
		System.out.println("입력한 문자는 " + result);
		
	}
	public void method5() {
		//양수(+5), 음수(-5), 0(0)
		//삼항연산자 중첩!!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num >0)? "양수입니다." :((num ==0)?"0입니다." : "음수 입니다.");  
		System.out.println(result);
		
	}
	public void method6() {
		//사용자에게 두개의 정수를 입력 받고
		// +또는 -를 입력받아 그에 맞는 연산결과 출력
		//단, +또는 -외의 다른 문자를 입력했을 경우 "잘못 입력했습니다."출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		//버퍼에 남아있는 엔터제거를 위한 코드 작성
		sc.nextLine();
		
		System.out.print("연산자 입력(+ 또는 - 입력) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+')? (num1 + num2+""):((op == '-')?(num1 - num2+""):"잘못 입력했습니다.");
		System.out.println("결과 : " +result);
		
	}
	
}
