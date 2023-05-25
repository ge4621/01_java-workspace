package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int a = sc.nextInt();
		
		System.out.print("세로 : ");
		int b = sc.nextInt();
		
		System.out.print("면적 : "+ (a*b));
		System.out.print("둘레 : " + (a+b)*2);
		
	}
	
}
