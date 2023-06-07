package com.kh.chap04_field.model.vo;

public class Run {
	public static void main(String[] args) {
		//-------------fieldTest1------------------
		FieldTest2 f2 = new FieldTest2();
		
		//public
		System.out.println(f2.pub);
		
		//protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
		System.out.println(f2.pro); //다른 패키지여서 오류
		
		//default : 오로지 같은 패키지 내에서만 접근 가능
		System.out.println(f2.def); //다른 패키지여서 오류
		
		//private : only 해다 클래스에서만 접근 가능!
		//System.out.println(f2.pri); 
	}
}
