package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class FootBall extends Sports{
	
	//자식클래스에 강제성을 부여하기 위해서사용
	//basketball, football 이든 무조건 rule이 있으니 rule을 구현했으면 해서.....
	
	//추상메소드가 존재하는 추상클래스를 상속받는 순간
	//부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야된다.

	@Override
	public void rule() {
		System.out.println("공을 발로만 다뤄야한다.");
		
	}

}
