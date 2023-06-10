package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun /*extends Object*/ {

	public static void main(String[] args) {

		Car c = new Car("벤틀리",12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		System.out.println("=================================");
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		/*
		 * *상속의 장점
		 * -보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 추가나 변경에 용이(유지보수, 생산성 up)
		 * 
		 * *상속의 특징
		 * - 클래스간의 상속에 있어서는 다중상속이 안된다.!!!(단일 상속만 가능 즉, 부모는 하나다.)
		 * - 자식객체는 부모클래스에 잇는 메소드를 마치 내것처럼 호출 가능
		 * 		+ 부모클래스에 있는 메소드가 맘에 안들면 자식 클래스에서 오러라이딩 가능(내 입맛대로 재정의)
		 * - 부모클래스에 정의되어 있는 protected 필드는 자식 클래스에서 직접 접근 가능
		 * - 명시되어있지는 않지만 모든 클래스(제공하는 클래스, 직접만든 클래스)는 Object클래스의 후손이다.
		 * 	=>즉, Object클래스에 있는 메소드를 마음대로 호출 가능!
		 *  =>뿐만 아니라 오버라이딩을 통한 재정의도 가능함!!
		 * 
		 */
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(s)); //그럼 부모가 2명인가요??? -놉 
		System.out.println(c/*.toString()*/); //.toString()가 있던 없던 값은 같다. 즉 자동호출된다.
		System.out.println(c.toString()); 
		
		
		
	}

}
