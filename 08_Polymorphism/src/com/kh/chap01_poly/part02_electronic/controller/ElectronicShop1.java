package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용 안했을 때!!!! 
public class ElectronicShop1 {

	//용산 전자상가에 있는 가게
	//필드부
	
	//private int price; // 기본 자료형
	
	//3개 제품을 마련할 자리부터 만들자 <필드부 자리>
	private Desktop desk;    // 내가 만든 자료형
	private NoteBook note;   //객체 생성은 안되고 텅 비어 있다.
	private Tablet tab;		
	
	//이건 실제로 객체가 생성 된 것은 아니다.
	//필드가 메모리상에 확보되는 순간 => 객체가 생성되는 순간!!!
	
	public void insert(Desktop d) {  //Desktop d = new Desktop(~~~);
		desk = d;
	}
	public void insert(NoteBook n) {//NoteBook n = new NoteBook(~~~~);
		note = n;
	}
	public void insert(Tablet t) { //Tablet t = new Tablet(~~~);
		tab = t;
	}
	
	//동일한 클래스에 동일한 메소드 명으로 여러개 만들어져 있는 것 => 오버로딩
	//단, 매개변수 명은 달라야 한다.
	//오버로딩이 적용되어 있다. 
	
	//조회용
	//모르겠으면 일단은 반환형을 void 가자 => 나중에 수정 가능
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	//insert 처럼 select도 같은 이름으로 하면 안되는 이유는?
	//매개변수가 없기 때문에 불가능함 => 오류남
	
	//현재는 메소드가 총6개!!
	//다형성 적용하면 2개 ~3개로 줄이기가 가능!
	
	
	
}
