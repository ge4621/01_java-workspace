package com.hw1.model.vo;

public class Product {

	
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
		}
		
		//set
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public void setProductArea(String productArea) {
			this.productArea = productArea;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setTax(double tax) {
			this.tax = tax;
		}//get
		public String productId() {
			return productId;
		}
		public String productName() {
			return productName;
		}
		public String productArea() {
			return productArea;
		}
		public int price() {
			return price;
		}
		public double tax() {
			return tax;
		}
		public String information() {
			return  productId +" "+ productName +" "+ productArea +" "+ price +" "+tax;
		}
		
		public int information2() {
			return price+(price * (int)tax);
		}
		
	}
	

