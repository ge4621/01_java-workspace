package com.kh.practice.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.kh.practice.api.model.vo.Book;

public class BookController {

	public BookController() {
	} // 기본생성자

	private Book[] books = new Book[5];

	public void printAll() {//도서 전체 출력 기능 메소드 시작
		{

			books[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023-1900, 6-1, 14), 10000);
			books[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023-1900,5-1,11), 20000);
			books[2] = new Book("AIP의 모든 것", "문동은", "오렌지", new Date(2020-1900,4-1,25), 35000);
			books[3] = new Book("언어의 천채", "장원영", "키위", new Date(2015-1900,1-1,1), 70000);
			books[4] = new Book("개발왕국", "시연쌤", "바나나", new Date(2022-1900,12-1,25), 80000);

			// 1. for loop문
			/*
			 for(int i = 0 ;i<books.length;i++) {
			 
			 System.out.println(books[i].toString());
			 }
			 
			 */
			// 2.for each문
			for (Book a : books) {
				System.out.println(a);
			
			}
			
			
			
		}

	}// 도서 전체 출력 기능 메소드 끝

	//도서 추가 기능 시작
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {

	//1.매개변수로 전달답은 newPrice값 => String->int로 변환 작업(int price라는 변수에 담으세요.)
	int price = Integer.parseInt(newPrice);
	
	//2.매개변수로 전달받은 newDate값 => String -> Date값으로 변환 작업(Date publishDate에 담으시오)
	
	// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
	// 1) StringTokenizer를 이용한 방법
	// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로분리("2020", "07", "01")
	StringTokenizer stn = new StringTokenizer(newDate,"-");
	
	
	// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
	int year = Integer.parseInt(stn.nextToken());
	int month = Integer.parseInt(stn.nextToken());
	int date = Integer.parseInt(stn.nextToken());
	
	// 1_3) year, month, date 가지고 Date객체 생성하기
	Date publishDate = new Date(year - 1900, month - 1, date);
	
		
	
	// 2) split 메소드를 이용한 방법
	// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
	
	String[] day  = newDate.split("-");
	
	/*
	// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서int 변수들에 담기
	int year = Integer.parseInt(day[0]);
	int month = Integer.parseInt(day[1]);
	int date = Integer.parseInt(day[2]);
	
	// 2_3) year, month, date 가지고 Date객체 생성하기
	
	Date publishDate = new Date(year - 1900, month - 1,date);
	*/
	
	// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을가지고 Book클래스의 매개변수 생성자를 통해 생성
	
	Book newBook = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
	Book[] arr = new Book[books.length + 1];
	
	
	for(int i = 0; i<books.length; i++) {
		arr[i] = books[i];
	}
	arr[books.length] = newBook;
	books = arr;
	System.out.println("추가도서 추가완료!");
	
	//Book books = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
	
	
	//newList[5] = bk1;
	
	
		
	}// 도서 추가 기능 메소드 끝

	//도서 출간일 출력 기능 메소드 시작
	public void printBookPublisherDate() {
		//새로 입력받은 도서 (6번째 도서)의 출간일 출력
		//"xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		//SimpleDateFormat 이용
		
		Date publishDate = new Date();
		SimpleDateFormat st = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatDate = st.format(publishDate);
		System.out.println(formatDate + " 출간");
		
		System.out.println();
	}// 도서 출간일 출력 가능 메소드 끝
	

//도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		//1)for loop문 방법
		for(int i = 0 ; i< books.length ; i++) {
			if(books[i].getTitle().contains(searchTitle)) {
				System.out.println(books[i]);
				
			};
		}
		/*
		//2)for each문 방법
		for(Book a : books) {
			if(a.getTitle().contains(searchTitle));
			System.out.println(a);
		}
		*/
		
		
		/*//강사님
		for(Book b : newList) {
			if(b.getTitle().contains(searchTitle));
			System.out.println(b);
			
		}
		*/
		
	}// 도서 검색 기능 메소드

}
