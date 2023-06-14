package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * *Wrapper클래스
		 * =>기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다.
		 * 
		 * 기본자료형 <-------> Wrapper클래스
		 * boolean <-------> Boolean
		 * char	   <-------> Character   *******
		 * byte	   <-------> Byte
		 * short   <-------> Short
		 * int	   <-------> Integer     *******
		 * long    <-------> Long
		 * float   <-------> Float
		 * double  <-------> Double
		 * 
		 *  //객체화 => new 연산자로 만드는 것
		 *  
		 *  =>기본자료형을 객체로 취급해야하는 경우
		 *  	- 메소드 호출해야 될 때
		 *  	- 메소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구 될 때
		 *		- 다형성을 전용시키고 싶을 때
		 */
		
		// Booking : 기본 자료형 => Wrapper 클래스 자료형 으로 바꾸는 법
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2)); //주소값이라는 개념이 없어서 안된다.
		//equals => String => 오버라이딩 : 실제값 비교
		//equals => 주소값 비교(원래 사용시)
		/*기본자료형 구분시 =>*/ System.out.println(num1==num2);
		
		//기본자료형이지만 equals로 사용하고 싶을 때(Booking)
		//방법 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1.toString());
		System.out.println(i2);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.compareTo(i2)); //두값을 비교해서 앞쪽이 크면 1, 뒤쪽이 크면 -1, 같으면 0을 출력
		
		
		//방법 2. 객체 생성 따위 하지 않고 곧바고 대입하는 방법(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		//객체생성(new 사용하는것)을 통해서 반드시 변환해야되는 경우 => 문자열을 Integer 타입으로
		//Integer i4 = "123";  오류
		Integer i4 = new Integer("123"); //위의 오류 해결 (주의 점 : 괄호안은 오직 숫자만)
		System.out.println(i4);
		
		// UnBoxing : Wrapper 클래스 자료형 -> 기본자료형 으로 바꾸는 법
		//방법 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해
		int num3 = i3.intValue();  //num3 = 10
		int num4 = i4.intValue(); //num4 = 15
		
		//방법 2. 메소드 따위 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		
		//이거 도대체 왜 배우나요??
		//=> 웹 개발할때 값 입력하면 무조건 문자로 날아옴!!!
		System.out.println("=============================");
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); //문자열 + 문자열 = 문자열
		
		//1. String  ----> 기본자료형
		//		"10" ---->10
		//	"15.3"	----->15.3
		//해당 Wrapper.parseXXX() 사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		//2.기본자료형			-->String
		//	10 				--> "10"
		//	15.3			--> "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		//근데 이렇게는 많이 안씀...
		String test = i + ""; //다른 자료형 + 문자열 => 문자열
		
		
		
		
		
	}

}
