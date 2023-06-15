package com.kh.practice.api.run;

import java.util.Scanner;

import com.kh.practice.api.controller.BookController;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BookController bc = new BookController(); //BookController 메소드에 접근하기 위한 bc레퍼런스 생성
		
		//1.도서 전체 출력
		System.out.println("-----------1. 기존의 전체 도서 추가------------");
	
		bc.printAll();
		
		//2_1. 추가할 도서 입력 받기
		System.out.println("-----------2. 새로운 도서 추가-------------");
		System.out.print("도서명을 입력하세요. : ");
		String newTiTle = sc.nextLine();
		
		System.out.print("저자명을 입력하세요. : ");
		String newAuthor = sc.nextLine();
		
		System.out.print("출판사명을 입력하세요. : ");
		String newPublisher = sc.nextLine();
		
		System.out.print("출판일 (2023-06-14 같이 - 구분자 이용하여 입력하시오) : ");//2023-06-14처럼 구분자 이용
		String newDate = sc.nextLine();//날짜도 먼저 문자열로 받기
		
		System.out.print("가격을 입력하세요. : ");
		String newPrice = sc.nextLine();
		
		//2-2. 입력받은 값들을 BookController의 insertBook()메소드로 전달
		
		bc.insertBook(newTiTle, newAuthor, newPublisher, newDate, newPrice);
		
		//System.out.println("추가 도서 추가 완료!");
		
		
		//3. 5번째 도서 출간일 출력
		System.out.println("----------------6번째 도서 출간일 출력-------------");
		//printBookPublishDate() 메소드 호출
		bc.printBookPublisherDate();
		
		
		//4. 검색할 도서명 입력(키워드)
		System.out.print("검색할 도서명을 입력하시오. : ");
		String searchTitle = sc.nextLine();
		//searchBook(searchTitle) 메소드 호출
		bc.searchBook(searchTitle);
		
	}

}
