package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
			/*
			// ------------------NonStaticMethod-------------------
		NonStaticMethod n = new NonStaticMethod();
		
		//1.매개변수도 없고 반환갑도 없는 메소드 호출
		//n.method1(10); 오류
		n.method1();
		
		//2.매개변수 없고 반환값은 있는 메소드 호출
		//int str = n.method2(); 오류
		//String str = n.method2();
		System.out.println(n.method2());
		
		//3.매개변수 있고 반환값은 없는 메소드 호출
		//n.method3(); -> 매개변수 없으면 오류난다.
		//n.method3(10); -> 매개변수 개수 맞지 않으면 오류남
		//n.method3("ㅋㅋ","ㅎㅎ"); -> 매개변수 타입 맞지 않으면 오류남(개수가 일치해도 타입이 틀리면 오류)
		//int a = n.method3(10, 20); -> 반환값이 없어서 오류
		n.method3(10, 5);   
		n.method3(10, 0);
		
		//4.매개변수도 있고 반환값도 있는 메소드 호출
		//char ch = n.method4("lemon", 1);
		//System.out.println(ch);
		//System.out.println(n.method4("lemon", 1)); //위의 두줄 합치기
		
		//사용자에게 매개변수(문자열, 정수값)를 입력받아서 해당 메소드 호출
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스를 입력하세요. :");
		int index =  sc.nextInt();
		
		//여기서 유효성 검사 해보기
		//index 0 이상이고 문자열의 길이보다 작을때만 method4
		
		if(index >= 0 && index < str.length()) {
			System.out.println("결과 : " + n.method4(str, index));
		}else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		sc.close();
		*/
		
		// ------------------StaticMethod-------------------
		//생성 없이 바로 호출 가능
		//Math.random();
		StaticMethod.method1();
		StaticMethod.method2();
		System.out.println(StaticMethod.method2()); //return 값은 출력하지 않으면 보이지 않는다.
		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "kiwi"));//return 출력해야만 확인 가능
		
		// ------------------OverloadingTest-------------------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "룰룰랄랄");
		ot.test("룰룰랄랄", 20);
		ot.test(10,10);
		ot.test("차은우");
		
		//오버로딩의 대표적인 예 => print()
		System.out.print(10);
		System.out.println("ㄴㄴ");
		System.out.println(0.0);
		
		
	}

}
