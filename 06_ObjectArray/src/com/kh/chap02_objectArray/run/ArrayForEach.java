package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		/*
		<일반적으로 알고 있던 거>
		 
		for(int i =0; i<arr.length; i++) {    
			System.out.println(arr[i]);		  
		}	
		for(초기값 ; 조건식 ; 증감){
		    반복적으로 실행할 내용
		 }					
		*/
		
		
		//꼭 알아두기!!!
		//for each문(향상된 for문 / 개선된 for문)
		//배열 또는 컬렉션(컬렉션은 나중에...)과 함께 사용됨
		//배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		
		/*
		 * [표현법]
		 * for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션){  //반복횟수 == 배열 또는 컬렉션의 크기
		 * 		반복적으로 실행할 내용
		 * }
		 */
		for(int value : arr) {   //value = arr[0]  , value = arr[1], value = arr[2]
			System.out.println(value);
		}
		//객체 배열
		Phone[] phones = new Phone[3];  //배열 생성
		
		phones[0] = new Phone("갤럭시", "삼성", 1500000, "s23");  //객체 생성
		phones[1] = new Phone("아이폰", "애플", 1300000, "14pro");  
		phones[2] = new Phone("롤리팝", "엘지", 1200000, "없음");  
		
		System.out.println(phones[0]);  //주소값이 나온다.
		System.out.println(phones[0].information()); //정보 출력
		
		phones[2].setSeries("1");   //set사용하여 정보 변경

		//누적합
		int total = 0;
	//	for(int p:phones) {  //p=Phones[0] 틀림 (int 자료형 때문에)
		for(Phone p : phones) { //p = Phones[0], p = Phones[1], p = Phones[2]
			System.out.println(p.information());
			
			//모든 인덱스의 금액 누적합 => total +=i
			total += p.getPrice();
		}
			System.out.println("총합계 : " + total + "원");
			System.out.println("평균가 : " + total / phones.length + "원");
			
			
			//구매하고자 하는 휴대폰
			Scanner sc = new Scanner(System.in);
			System.out.print("휴대폰의 이름을 입력하세요. : ");
			String str = sc.nextLine();
			//ex)롤리합을 입력하면
			//가격 : xxx원  => 향상된 for문
			
			//향상된 for문  //반복횟수는 지정 불가(무조건 처음부터 배열의 크기만큼 돌아간다.)
			for(Phone p : phones  ) {  //p=>phones[0], p=> phones[1],   p=> phones[2]
				if(p.getName().equals(str)) {  //순차탐색
					System.out.println("가격 : " + p.getPrice() + "원");
				}
			}
			
			//일반 for문  => 반복횟수 지정 가능
			for(int i = 0; i<phones.length; i++) {
				if(phones[i].equals(str)) {
					System.out.println("가격 : " + phones[i].getPrice() + "원");
				}
			}
		}
		
	}

