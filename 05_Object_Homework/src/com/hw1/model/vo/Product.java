package com.hw1.model.vo;

public class Product {

	//필드부
	private String productId;    //상품아이디
	private String productName;  //상품이름
	private String productArea;  //생산지역
	private int price;           //상품가격
	private double tax;			 //부가세
	
	//생성자부(기본생성자 + 전체생성자)
	//기본생성자
	public Product() {
	}
	
	//전체생성자(매개변수 생성자)
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
		}
	
	/*
	//메소드부
	//get - set => 한세트로 작성(관례)
	public String getProductId() {
		return productId;
	}
	public void setProductId(String ProductId) {
		this.productId = productId;
	}
	*/
	
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
		}
		
		//get
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
	

