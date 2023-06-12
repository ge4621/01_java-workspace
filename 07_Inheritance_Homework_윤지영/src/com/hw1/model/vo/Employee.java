package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;  //급여
	private String dept; //부서

	public Employee() {
	}
	public Employee(String name, int age, double height, double weight,int salary, String dept){
		super(age,height,weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override  //정확한 표현으로는 쓰는게 맞다.(그냥 무조건 쓰자)
	public String toString() {
		return "이름 : " + name + ", "+super.toString() + ", 급여 : "+salary + ", 부서 : "+dept;
	}
	
}

