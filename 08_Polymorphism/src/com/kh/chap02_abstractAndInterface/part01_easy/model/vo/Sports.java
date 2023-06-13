package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports() {}
	
	public Sports(int people) {  //생성자는 메소드가 없다.
		this.people = people;
	}
	
	public int getPeople() {  //머리부   
		return people;  //몸통부  => **이게 없으면 완벽한 메소드가 아니다.
	}
	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "People : " + people;
	}
	
	//추상메소드(미완성된 메소드) 만들기
	//public void rule();  //머리부만 있다.....몸통부가 없어 에러가 난다.
	public abstract void rule();
	//미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성 이라는 이야기
	
	//그럼 언제 완성이 되나요??? => 해당 추상클래스를 상속 받는 자식에서!!!!
	
	
}
