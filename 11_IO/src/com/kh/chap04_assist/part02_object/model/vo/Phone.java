package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	
	//객체 자체를 입출력 하고자 한다면 직렬활 과정이 필수로 필요하다.( implements Serializable )
	
	private String name;
	private int price;
	
	public Phone() {}

	//alt + shift + s + o
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//alt + shift + s + r => alt + a, alt + s => enter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//alt + shift + s + s
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
