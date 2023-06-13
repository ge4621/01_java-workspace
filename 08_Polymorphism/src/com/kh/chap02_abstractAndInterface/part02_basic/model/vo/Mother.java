package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic{

	private String babyBirth;   //아이의 탄생  출산|입양|없음
	
	public Mother() {}
	public Mother(String name, double weight, int health,String babyBirth) {
		super(name,weight,health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + babyBirth;
	}
	
	@Override
	public void eat() {
		//밥을 먹으면 몸무게 10증가
		super.setWeight(super.getWeight() + 10);  //(본래의 몸무게에서 + 10)
		//건강도 10감소
		super.setHealth(super.getHealth() - 10);  //(본래의 건강점수에서 - 10)
	}

	@Override
	public void sleep() {
		//잠자면 건겅도 20증가
		super.setHealth(super.getHealth() + 20);
		
		
	}

}
