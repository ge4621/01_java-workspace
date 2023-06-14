package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {

		System.out.println("1. 지정문자열");
		System.out.println("2. 입력문자열");
		System.out.println("9. 프로그램 끝내기");

		System.out.print("메뉴번호 : ");
		int num = sc.nextInt();

		
		switch (num) {
		case 1:
			tokenMenu();
			break;

		case 2:
			inputMenu();
			break;
			
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;

		}

	}

	public void tokenMenu() {
		
		
		
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		
		String a = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 개수 : " + a.length());
		System.out.println("모두 대문자로 변환 : " + a.toUpperCase());
	}

	public void inputMenu() {

		System.out.println("문자열을 입력하세요 : ");
		
		
		System.out.println("첫 글자 대문자 : ");
		
		System.out.println("찾을 문자 하나를 입력하세요. : ");
		
		System.out.println("문자가 들어간 개수 : ");

	}

}
