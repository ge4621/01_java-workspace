package com.kh.chap03_class.model.vo;

public class Person {

	//필드 선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	//private //01011112222 // 01 => 1, 02 => 2 // 010- 1111- 2222 
	private String phone;
	private String email;
	
	//setter 메소드(7개) //괄호 안은 위의 변수 이름과 동일하게(소문자)
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String Pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//getter 메소드(7개)
	public String getId() {
		return id;
	}
	public String getPwd() {
		return  pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + name + ", age : "
				+ age + ", gender : " + gender + ", phone" + phone + ", email" + email;
	}
}
