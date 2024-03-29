package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager  {
	
	ArrayList<Book> bList = new ArrayList<>();
	
	@Override
	public void addBook(Book nBook) {
		
		bList.add(nBook);
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book b = null;  //책이 없음 
		
		/*
		for(Book bo : bList) {
			if(b.getbNo().equals(bNo)) {
				b = bo;
			}
		}
		*/  // 향상된 for문
		
		for(int i = 0; i<bList.size(); i++) {
			if(bList.get(i).getbNo().equals(bNo)) {
				b = bList.get(i);
			}
		}
		return b;  
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book a :bList) {
			if(a instanceof Magazine) {
				continue;
			}else if(a.getTitle().contains(title)) {
				searchList.add(a);
			}
		}
		
		/*
		for(int i = 0; i<bList.size();i++) {
			if(bList.get(i).getTitle().contains(title)) {
				searchList.add(bList.get(i));
			}
		} // book과 magazine같이 나온다.
		*/
		return searchList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		
		
		ArrayList<Book> tempB = new ArrayList<>();
		
		for(Book a :bList) {
			if(a instanceof Magazine) {
				continue;
			}else {
				tempB.add(a);
			}
		}
		
		return tempB;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		
		ArrayList<Book> tempM = new ArrayList<>();
		for(Book a : bList) {
			if(a instanceof Magazine) {
				tempM.add(a);
			}
		}
		
		return tempM;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		
		ArrayList<Book> searchyear = new ArrayList<>();
		
		for(int i =0; i<bList.size();i++) {
			if(bList.get(i) instanceof Magazine &&((Magazine)bList.get(i)).getYear()==year) {
				searchyear.add(bList.get(i));
			}
		
		}
		
		return searchyear ;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i = 0; i<bList.size();i++) {
			if(bList.get(i).getPublisher().contains(publisher)) {
				searchList.add(bList.get(i));
			}
		}
		
		
		return searchList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i = 0; i<bList.size();i++) {
			if(bList.get(i).getPrice()<price) {
				searchList.add(bList.get(i));
			}
		}
		
		return searchList;
	}

	@Override
	public int getTotalPrice() {
		
		int total = 0;
		for(int i = 0 ; i < bList.size();i++)
			total += bList.get(i).getPrice();
		
		
		return total;
		
	}

	@Override
	public int getAvgPrice() {
		
		
		
		return getTotalPrice()/bList.size();
	}
	

}
