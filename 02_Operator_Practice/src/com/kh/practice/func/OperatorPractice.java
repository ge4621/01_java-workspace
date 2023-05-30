package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0)? "양수다" : "양수가 아니다" ;
		System.out.println(result);
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0)?"양수다":((num == 0)? "0 이다": "음수다");
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0)? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		String result1 = num2 /num1 + "";
		String result2 = num2 % num1+"";
				
		System.out.println("1인당 사탕 개수 : " + result1);
		
		System.out.println("남은 사탕 개수 : " + result2);
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : " );
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int g = sc.nextInt();
		
		System.out.print("반(숫자만): ");
		int c = sc.nextInt();
		
		System.out.print("번호(숫자만): ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = (gender == 'F'||gender == 'f') ? "여" : "남";
	
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double t = sc.nextDouble();
		
		System.out.println(g+"학년 " + c +"반 " + n+ "번 "+ name + result+"학생의 성적은"+t+"이다.");
		
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age<=13)? "어린이" :((13<age)&&(age<=19) ? "청소년" : "성인");
		System.out.println(result);
				
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		int ave = (num1+num2+num3)/3;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		
		String result = (num1>=40)&&(num2>=40)&&(num3>=40)&&(ave >=60) ? "합격" :"불합격";
		System.out.println(result);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요.(- 포함) : ");
		String ch = sc.nextLine();
		
		
		String result = (ch.charAt(7) == '2' || ch.charAt(7) == '4')? "여자":"남자";
		
		System.out.println(result);
		
		
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		String result = (num<num1)||(num>num2)? "true" : "false";
		System.out.println(result);
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 :");
		int num2= sc.nextInt();
		
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1==num2)&&(num2==num3)? "true" : "false";
		System.out.println(result);
		
		
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double resultA = (num1*0.4) + num1;
		System.out.println("A사원 연봉/연봉+a : " + num1 + "/" +resultA );
		String result = resultA >=3000? "3000이상" : "3000미만";
		System.out.println(result);
		
		double resultB = (num1*0) + num2;
		System.out.println("B사원 연봉/연봉+a : " + num2 + "/" +resultB);
		String result2 = resultB >=3000? "3000이상" : "3000미만";
		System.out.println(result2);
		
		double resultC = (num1*0.15) + num3;
		System.out.println("C사원 연봉/연봉+a : " + num3 + "/" +resultC );
		String result3 = resultC >=3000? "3000이상" : "3000미만";
		System.out.println(result3);
		
		
		
	}
	
}
