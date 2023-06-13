package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		
			
		//추상클래스 객체 생성 불가(왜?? 미완성 클래스이기 때문이!!!)
		//Sports s = new Sports(); // Sports가 불안정(추상클래스)해서 객체생성이 안된다.
		//Sports s; //객체 생성이 안될 뿐이지 (부모) 레퍼런스로는 사용이 가능하다.
		Sports s = new BasketBall(); //부모타입 레퍼런스로 자식객체 생성(다향성) // 다형성 적용 시켜서 부모타입으로 객체를 받아주는 형태는 가능
		
		Sports[] arr = new Sports[2]; //객체생선 전 ,배열만 만들어지 상태
	// 부모				자식
		arr[0] = new BasketBall(); //객체 생성
		arr[1] = new FootBall();
		
		//단순 for문
		for(int i = 0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		//향상된 for문
		for(Sports/*자료형*/ a : arr) { //a=arr[0]  , a=arr[1]
			a.rule(); //동적 바인딩 - Sports 클래스에 있는 rule을 가져올것 처럼 보이지만 자식객체에서 가져온다.
		}
		//여기서도 동적바인딩!!
		
		/*
		 * 동적바인딩 : 컴파일 시점(코드를 치는 시점)에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키긴한다.
		 * 			런타임시점(실행시점)에서는 동적바인딩으로 각각의 자식클래스에 오버라이딩 된 메소드가 있을 경우 그거을 실행
		 */
		
		/*
		 * *추상메소드
		 * - 미완성된 메소드로 몸통부({ })가 구현되어 있니 않은 메소드
		 * 
		 * *추상클래스
		 * -미완성된 클래스
		 * -일반필드 + 일반메소드 [+ 추상메소드]
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시 해야 한다.
		 * 
		 * *추상메소드가 굳이 없어도 추상메소드로 만들 수 있다.
		 * 언제 사용되나요????
		 * 
		 * >개념적 : 단지 이 클래스가 미완성된 클래스다 라는걸 부여할 목적 => 덜 만들었을때
		 * >프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때 
		 * 
		 * *추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * -부모클래스에 추상메소드가 존재할 경우
		 * 	자식클래스에서는 강제로 오버라이딩 해서 동일한 패턴의 메소드를 가지게 된다.
		 *
		 *	=> 각 자식 클래스마다 실행시킬 내용을 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 *		=>메소드 통일성 확보 목적
		 *		=>표준화된 틀을 제공할 목적
		 */
		
		
		
	}

}
