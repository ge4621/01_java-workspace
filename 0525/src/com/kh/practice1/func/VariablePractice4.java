package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

		public void charTest() {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("문자열을 입력하세요. : ");
			String a = sc.nextLine();
			
			System.out.print("첫 번째 문자 : ");
			System.out.println(a.charAt(0));
			System.out.print("두 번째 문자 : ");
			System.out.println(a.charAt(1));
			System.out.print("세 번째 문자 : ");
			System.out.println(a.charAt(2));
			sc.close();
		}
	
}
