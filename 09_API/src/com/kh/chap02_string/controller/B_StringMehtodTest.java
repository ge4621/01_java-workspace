package com.kh.chap02_string.controller;

public class B_StringMehtodTest {

	public void method() {
		String str1 = "Hello World";
		
		//메소드명(매개변수) : 반환형
		
		//1. 문자열.charAt(int index) : char
		//	문자열에서 전달받은 index위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : "+ ch);
		
		//2.문자열.concat(String str) : String
		//		문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		//System.out.println(str1);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		System.out.println("str2와 str3가 일치합니까 : " + (str2 == str3));
		//근데 아까전에 StringPool 에서 같은 글자면 같은 주소 아닌가???
		//concat 열어보면 new 있다. => 새로운 조소값 heap
		//str3만 StringPool에 있음
		
		//3. 문자열.equals(Object obj) : boolean // 부모타입으로 자식 전부다 받을 수 있다. => 다형성
		//문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등비교한다.
		
		System.out.println("str2와 str3가 일치합니까?(equals) : " + str2.equals(str3));
		
		//4. 문자열.contains(charSequence s) : boolean //예도 Stringdml 부모이다.
		System.out.println("str1에 Hello문자열이 포합되어 있습까?" + str1.contains("Hello"));
		System.out.println(("str1 에 bye문자열이 포함되어 있습니까 : " + str1.contains("bye")));
		
		//5.문자열.lenght() ; int
		System.out.println("str1의 길이 : " + str1.length());
		
		//6.문자열.substring(int beginIndex) : String => 문자열의 beginIndex 위치에서부터 끝까지의 문자열 추출해서 리턴
		//	문자열.substring(int beginIndex,int endIndex) : String
		//			=> 문자열의 beginIndex 위치에서부터 endIndex -1 위치까지의 문자열을 추출해서 리턴
		//Hello World
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		//Hello만 추출해보기
		System.out.println(str1.substring(0, 5)); //begin <= X <end
		
		System.out.println("======================");
		
		//Quiz
		//1.Worl 만 추출 + concat함수로 !엮어서 str0만들기 => Worl!
		
		//2. contains 함수 이용하여 !가 포함되어 있는지 여부 추출
		//			=>str0에 !가 포함되어 있습니까ㅓ : true
		
		String str0 = str1.substring(6, 10).concat("!");
		System.out.println(str0);
		System.out.println("str0에 !가 포함되어 있습니까? : " + str0.contains("!"));
		
		
		//7.문자열.replace(char oldChar,char newChar) : String
		//	문자열에서 oldChar문자들을 newChar로 변환한 새 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println(str4);
		System.out.println("str1이 변경이 됐나?: " + str1);
		
		//8.문자열.toUpperCase() : String => 문자열을 다 대문자로 변경한 새 문자열 리턴
		//	문자열.toLowerCase() : String => 문자열을 다 소문자로 변경한 새 문자열 리턴
		
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str5.toLowerCase());
		
		/*
		System.out.println("계속 입력하시겠습니까? (y/n) : ");
		//char ch = sc.nextLine().charAt(0);
		char ch = sc.nextLine().toUpperCase().charAt(0);	//Y,N	
		
		메소드 연이어서 호출 // 메소드 체이닝
		
		뒤어 써도 되나요?? 안된다. =>  String 클래스에 있는거임!!!!
		
		if(ch == 'N') {
			//프로그램 종료
		}
		*/
		
		//9.문자열.trim() : String
		//	문자열의 앞뒤 공백을 제거시킨 새 문자열 리턴
		String str6 = "     JA  V A       ";
		System.out.println("str6: " + str6.trim());
		
		//10.문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);  //문자열의 문자를 각각배열어 넣기
		
		//11.String.valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
	}
	
}
