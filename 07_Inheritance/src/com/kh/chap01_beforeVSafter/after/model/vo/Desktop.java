package com.kh.chap01_beforeVSafter.after.model.vo;

			//자식 ----------->부모
			//후손 ----------->조상
			//하위 ----------->상위
			//this ----------> super
public class Desktop extends Product{
private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		//this.brand = brand; //this : 이 클래스의 주소값
		
		//brand ~price 네개의 값들은 부모클래스(product)의 필드에 대입
		//해결방법1. 부모클래스에 있는 필드를 protected접근 제한자로 수정
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		//해결방법2. 부모클래스에 있는 setter메소드 활용하기(public 이기 때문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//해결방법3. 부모 생성자 호출하기 => 우리는 이걸로 간다.
		//this 생성자 this(), super 생성자 super() 위치가 항상 위여야 한다.
		super(brand, pCode,pName,price);  //부모가 가지고 있는 것
		this.allInOne = allInOne;   //자식이 같고 있는거
		//위치는 위에 있어야 됨
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는것
	public String information() {
		return super.information() + ", " + allInOne;
	}

}

