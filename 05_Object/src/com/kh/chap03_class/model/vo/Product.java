package com.kh.chap03_class.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	//set
	public void setpName(String pName) {
		this.pName = pName; 
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void steBrand(String brand) {
		this.brand = brand;
	}
	
	//get
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}public String getBrand() {
		return brand;
	}
	
	
	
}
