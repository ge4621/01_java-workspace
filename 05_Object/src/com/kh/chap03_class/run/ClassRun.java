package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
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
		
		System.out.println("=====메소드 만들고 난 후======");
		System.out.println(product1.information());
		System.out.println(product2.information());
		
		
		
		System.out.println();
		
		System.out.println("===상품3=====");
		
		Product product3 = new Product();
		
		product2.setpName("Lg그램");
		product2.setPrice(120);
		product2.steBrand("LG");
		
		System.out.println("이름 : " + product2.getpName());
		System.out.println("가격 : " + product2.getPrice());
		System.out.println("브랜드 : "+ product2.getBrand());
		
		System.out.println("================");
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		//생성 후에 필드에 담긴 값을 곧바로 알아보면
		//JVM이 초기화(값 세팅)까지 진행해줬음!!!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("윤지영");
		p.setAge(25);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("yoon@naver.com");
		
		System.out.println("=====값 대입후======");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		
	}
	
}
