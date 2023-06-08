package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	//오버로딩 : 한 클래스 내에 같은 메소드명 정의할 수 있는 것
	
	public void test() {
		
	}
	
	/*
	public void test() {
		System.out.println("b");
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a,String s) {
		
	}
	public void test(String s , int a) {
		
	}
	public void test(int a ,int b) {
		
	}
	/*
	public void test(int c, int d) {
		
	}
	오버로딩이 가능하려면 매개변수명이 아니라 매개변수의 개수와 순서가 다르게 작성되어야 한다.
	*/
	
	public void test(String str) {
		
	}
	/*
	public int test(String str) {
		
	}
	반환형이라고 상관 없음!!
	무조권!!!!매개변수가 달라야한다.
	*/
	
	/*
	private void test(String str) {
		
	}
	접근제한자랑도 상관이 없다.
	무조권!!!!!매개변수가 달라야한다.!!!!
	*/
	
	/*
	 *  *결론
	 *  오버로딩 : 한 클래스내에 동일한 이름의 메소드들
	 *  		단, 매개변수명, 접근제한자, 반환형을 다 떠나서 
	 *  		매개변수의 자료형과 개수, 순서가 다르게 작성되어있어야 한다.!!!
	 */
	
	
}
