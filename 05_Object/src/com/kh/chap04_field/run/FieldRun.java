package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		//-------------FieldTest1------------------
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.test(10);
		*/
		
		/*
		//-------------FieldTest2------------------
		FieldTest2 f2 = new FieldTest2();
		
		//public
		System.out.println(f2.pub);
		
		//protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
		//System.out.println(f2.pro); 다른 패키지여서 오류
		
		//default : 오로지 같은 패키지 내에서만 접근 가능
		//System.out.println(f2.def); 다른 패키지여서 오류
		
		//private : only 해다 클래스에서만 접근 가능!
		//System.out.println(f2.pri); 다른 패키지여서 오류
		
		*/
		
		//------------FieldTest3--------
		System.out.println(FieldTest3.sta);
		
		//수정하고 싶다면?
		FieldTest3.sta = "ㅋㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		//근데 절대 변경 안되게 하고싶다면? => 상수필드로 선언해야 한다.
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "ㅎㅎㅎㅎ"; //불가능
		
		System.out.println(Math.PI);
		//Math.PI = 2.53;  //불가능
		
		System.out.println(Math.random()); //static : 기울임
		
		
		
		
	}

}
