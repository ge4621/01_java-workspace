package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	public static void main(String[] args) {
		System.out.println("====상품1=====");
		
		Product product1 = new Product();
		
		product1.setpName("아이폰");
		product1.setPrice(140);
		product1.steBrand("apple");
		
		System.out.println("이름 : " + product1.getpName());
		System.out.println("가격 : " + product1.getPrice());
		System.out.println("브랜드 : "+ product1.getBrand());
		
		System.out.println();
		
		System.out.println("===상품2=====");
		
		Product product2 = new Product();
		
		product2.setpName("갤럭시s22");
		product2.setPrice(150);
		product2.steBrand("삼성");
		
		System.out.println("이름 : " + product2.getpName());
		System.out.println("가격 : " + product2.getPrice());
		System.out.println("브랜드 : "+ product2.getBrand());
		
		
		System.out.println();
		
		System.out.println("===상품3=====");
		
		Product product3 = new Product();
		
		product2.setpName("Lg그램");
		product2.setPrice(120);
		product2.steBrand("LG");
		
		System.out.println("이름 : " + product2.getpName());
		System.out.println("가격 : " + product2.getPrice());
		System.out.println("브랜드 : "+ product2.getBrand());
	}
	
}
