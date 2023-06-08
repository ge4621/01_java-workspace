package com.hw1.model.vo;

public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	//기본 생성자
	public Employee() {
	}
	//매개변수 6개 생성자
	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	public Employee(int empNo, String empName,String dept, String job, int age, char gender, int salary,double bonusPoint,String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
		
	}
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo() {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName() {
		this.empName = empName;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept() {
		this.dept = dept;
		
	}
	public String getJob() {
		return job;
	}
	public void setJod() {
		this.job = job;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
		
	}
	public char getGender() {
		return gender;
	}
	public void setGender() {
		this.gender = gender;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary = salary;
		
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint() {
		this.bonusPoint = bonusPoint;
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone() {
		this.phone = phone;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		this.address=address;
		
	}
	public String information() {
		return empNo +","+ empName +","+ dept + ", " + job + ", "+ age + ", " + gender + "," + salary+ "," + bonusPoint +"," + phone+ "," + address ;
	}
	//public String information() {
		//return empName + "의 연봉 : " + (salary +(salary *bonusPoint)) * 12;
}
