package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.입력 ");
		System.out.println("2.수정 ");
		System.out.println("3.조회 ");
		System.out.println("4.삭제 ");
		System.out.println("7.종료 ");
		
		System.out.print("메뉴번호를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num ==1) {
			System.out.println("입력 메뉴입니다.");
		}else if(num == 2){
			System.out.println("수정 메뉴입니다.");
		}else if(num == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(num == 4) {
			System.out.println("삭제메뉴입니다.");
		}else if(num == 7) {
			System.out.println("프로그램을 종류합니다.");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num>=0 && num % 2==0) {
			System.out.println("짝수다.");
		}else if(num>=0 && num %2 !=0) {
			System.out.println("홀수다.");
		}else if(num <0){
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int k = sc.nextInt();
		System.out.print("수학점수 : ");
		int m = sc.nextInt();
		System.out.print("영어점수 : ");
		int e = sc.nextInt();
		
		int sum = k+m+e;
		float ave = (k+m+e)/3;
		
		if(k>=40 && m>=40 && e>=40 && ave>=60) {
			System.out.println("국어 : "+ k);
			System.out.println("수학 : "+ m);
			System.out.println("영어 : "+ e);
			System.out.println("합계 : "+ sum);
			System.out.println("평균 : "+ ave);
			System.out.println("축하합니다, 합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울입니다.");
		default : 
			System.out.println(num + "월은 잘못 입력된 달 입니다.");
		
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String ID = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String p = sc.nextLine();
		
		
		if(ID.equals("myId")) {
			if(p.equals("myPassword12")) {
				System.out.println("로그인성공");
			}else{
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else{
				System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String g = sc.nextLine();
		
		switch(g) {
		case "관리자":
			System.out.print("회원관리 ");
			System.out.print("게시글 관리 ");
		case "회원":
			System.out.print("게시글작성 ");
			System.out.print("댓글 작성 ");
		case "비회원":
			System.out.print("게시글 조회 ");
			
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double h = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg/(h*h);
		
		if(bmi<=18.5) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("비만");
		}else if(30<=bmi) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("고도비만");
			
		}
				
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("피연산자1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 :");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String a = sc.next();
		
		switch(a) {
		case "+":
			System.out.printf("%d+%d =%d\n " ,num1,num2,num1+num2);
		case "-":
			System.out.printf("%d-%d =%d\n " ,num1,num2,num1+num2);
		case "*":
			System.out.printf("%d*%d =%d\n " ,num1,num2,num1+num2);
		case "/":
			System.out.printf("%d/%d =%d\n " ,num1,num2,num1+num2);
		case "%":
			System.out.printf("%d %% %d =%d\n " ,num1,num2,num1+num2);
		}
		
		
		
		
		
	}
	public void practice9() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double a = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double b = sc.nextDouble();;
		System.out.print("과제 고사 점수 : ");
		double c = sc.nextDouble();;
		System.out.print("출석 회수 : ");
		double d = sc.nextDouble();
		
		System.out.println("========결과=======");
		double sum = (a*0.2) + (b*0.3) + (c*0.3) + d;
		double at = a * 0.2;
		double bt = b * 0.3;
		double ct = c * 0.3;
		double dt = d;
				
		System.out.println("중간 고사 점수 (20) : " + at );
		System.out.println("기말 고사 점수 (30) : " + bt );
		System.out.println("과제 점수     (30) : " + ct );
		System.out.println("출석 점수     (20) : " + d );
		System.out.println("총점 : " + sum);
		
		
		
		if(d < 20*0.7) {
			System.out.printf("Fail[출석 회수 부족 (%d/20)]",(int)dt);
		}else if(sum>=70) {
			System.out.println("Pass");
		}else if(sum<70) {
			System.out.println("Fail[점수미달]");
		}

		
	}
	public void practice10() {
		
		
		System.out.println("실행기능을선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.P/F");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		
		}
		
	}
}
