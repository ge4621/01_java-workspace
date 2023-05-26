package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		
		//System.out.print(출력하고자 하는 값); // 출력만함 (줄바꿈 발생 X)
		//System.out.println(출력하고자 하는 값); // 출력 후 (줄바꿈 발생 O)
		
		//System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
		//출력하고자 하는 값들이 제시한 형식(포맷)에 맞추서 출력만 진행(줄바꿈 발생X)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열(문자도 가능)
		 * %f : 실수
		 */
		int iNum1 = 10;
		int iNum2 = 20;
		
		//"10 20" 으로 출력을 원함
		System.out.println(iNum1+ " "+ iNum2);  //" "가 포함되어 있어 문자열로 구분
		System.out.println(iNum1+iNum2);   //숫자여서 연산
		
		System.out.printf("%d  %d",iNum1,iNum2);
		System.out.printf("%d  %d\n",iNum1,iNum2); // \n 줄을 바꿔주는 아이
		
		System.out.printf("%d  %d",iNum1,iNum2,iNum2); //초과되면 뒤어 있는건 무시됨
		System.out.println(); //printf는 줄바꿈이 안됨 그래서 넣어줘야됨
		System.out.println("하하"); 
		
		//System.out.printf("%d %d%", iNum1, iNum2); //%뒤에는  원래 포맷키워드가 와야됨
		
		//근데 진짜로 %를 출력하고 싶다면?
		
		System.out.printf("%d %d%%", iNum1, iNum2);
		
		
		System.out.println();
		
		//정렬하고자 할 때 많이 쓴다.
		System.out.printf("%5d\n",iNum1); //양수 5 오른쪽 정렬
		System.out.printf("%-5d\n",iNum2); //음수 5 왼쪽 정렬
		
		System.out.printf("%5d\n",250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f%f", dNum1,dNum2); //무조건 소수점 아래 6번째 자리까지 보여줌, 숫자가 없다면 0으로 채운다.
		System.out.printf("%f\t%f", dNum1,dNum2);  // 사이 간격이 띄어짐
		System.out.println();  
		//*******
		System.out.printf("%.2f %.1f", dNum1,dNum2); //소수점 자리를 끊어줌
		
		char ch = 'a';
		String str = "hello";
		System.out.println();
		System.out.printf("%c %s %s", ch,str, ch);
		System.out.println();
		System.out.printf("%C %S %S", ch,str, ch); //대문자로 출력된다.
		
		
	}
	

}
