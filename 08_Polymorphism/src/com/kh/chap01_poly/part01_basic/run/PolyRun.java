package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해 둘 것 !!! '=' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 같아야 된다.!!!

		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild(); 오류
		// p1 레퍼런스로 Parent 에만 접근 가능

		System.out.println("2. 자식 타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 자동 형변환 된거였음!!(Child1=> Parent)
		// ((Parent)c1).printParent();
		// c1레퍼런스로 Child1, Parent 둘 다 접근 가능
		// Parent 접근시 자동으로 형 변환 된채로 진행된거다.

		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우(댜형성");
		Parent p2 = /* (Parent) */ new Child1(); // 자료형이 다르다. => 에러 안뜬다 => 자동형변환 됨
		p2.printParent();

		// p2.printChild1()// 오류
		((Child1) p2).printChild1(); // 강제 형변환을 하면 호출 가능!!

		// p2레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능하다.

		/*
		 * 상속 구조의 클래스들 간에는 형변환이 가능하다.
		 * 
		 * 1. UpCasting 자식 타입 -> 부모타입 형변환 자동 형변환
		 * 
		 * ex) 자식.부모메소드();
		 * 
		 * 2. DownCasting 부모타입 -> 자식타입 형변환 강제형변환 ex) ((자식)부모).자식메소드();
		 */

		// String str = (String)new Child1(); 상속 구조가 아니면 안된다.

		// 다형성 정의
		// - 부모타입으로 부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.

		// 다형성을 쓰는 목적

		// 다형성을 배우기 전.....
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);

		// -------------------------------------------------
		// 다형성(부모 타입 레퍼런스)을 적용한 후......
		Parent[] arr = new Parent[4];
		// Parent 타입
		arr[0] = new Child1(1, 2, 4);   
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child1(5, 7, 3);
		arr[3] = new Child2(2, 3, 5);
		// 하나의 부모타입 만으로 여러 자식 객체들을 받을 수 있음 => 편리하다, 코드 길이 감소

		System.out.println("===================================");
		// arr[0].printChild1(); 안됨(오류)
		((Child1) arr[0]).printChild1();  //arr은 부모객체 => 자식 객체(Child1)로 형변환을 하고 출력(출력 시 Child1인지 2인지 구분)
		//Child1로 형변환을 하고 Child1에 있는 정보를 출력해야 하기 때문에 .printChild1()을 해야한다.
		
		// arr[1].printChild2(); 안됨(오류)
		((Child2) arr[1]).printChild2();

		// ((Child1)arr[2]).printChild2(); 안됨(오류) - Child1로 형변환을했지만 출력을 Child2로 해서..
		// ((Child2)arr[2]).printChild2(); ClassCastException : 부적절한 형변환  arr[2]는 Child1로 해야 한다.
		((Child2) arr[3]).printChild2();

		System.out.println("==========반복문 이용해서 출력============");
		for (int i = 0; i < arr.length; i++) {

			/*
			 * instanceof 연산자 => 연산결과 true / false변환 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때
			 * 사용
			 */

			/* if(i == 0 || i == 2) { */  //i가 무엇인지 알때는 간단하나 i가 많거나 모른다며?? 사용하기 힘들다.
			if (arr[i] instanceof Child1) { // arr의 i번째가 Child1로 만들어 졌나요? // 해당 레퍼런스가 실제 Child1참조하고 있다면 true, 아니면 false
				((Child1) arr[i]).printChild1();
			} else {
				((Child2) arr[i]).printChild2();
			}
		} // 양다리 => 공유 : 연상(오빠) , 차은우 : 연하(은우야) ???예시를 했지만 이게 맞을까????? 예시 이야기가 생각이 안난다....ㅋㅋ
		
		System.out.println("========================");
		
		
		Parent pp = new Child1();
		pp.print();
		
		/*
		 * 동적바인딩 : 프로그램이 실행되지 전에는 컴파일 되면서 정적바인딩 (레퍼런스 타입의 메소드를 가리킴)
		 * 			단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어 있다면, 프로그램 실행시
		 * 			동적으로 그 자식 클래스의 오버라이딩 된 메소드를 찾아서 실행한다.
		 */
		
		System.out.println("=================");
		
		for(int i = 0; i<arr.length;i++) {
			arr[i].print();
		}
		
	}

}
