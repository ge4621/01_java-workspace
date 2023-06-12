package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age,height,weight);    //부모에서 private를 사용했기 때문에 name와 다르게 써야 한다.
		super.name = name;          //super. => 부모 객체에 직접접근
		this.grade = grade;			// this. => 자식객체에 직접 접근
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "이름 : " + name +", " +super.toString() + ", " +"학년 : " + grade +", 전공 : " + major; 
	}
}
