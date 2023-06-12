package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];  //배열만 생성(객체 생성 전이다.)
		
		
		 //====1번째 문제(nullpoint)의 조치 내용=======
		arr[0] = new Phone();   //객체 생생 
		arr[1] = new Phone();
		arr[2] = new Phone();
		
		
		for(int i = 0; i<=arr.length ; i++) {
			System.out.println(arr[i].getName());//nullpoint 오류 // 해결 법은 객체 생성하면 된다.
		}

		//잘못된 부문
		//1.NullPointerExeption : 객체 배열의 각 인덱스에 담긴 값이 null인 상태에서 메소드를 호출 할려고 했기 때문
								//조치 내용 => 객체 배열을 만든 후 각 인덱스별로 객체 생성을 진행해야 된다.
		
		//2.ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어나 경우
		//									조건식으로 i<=배열의 길이 라고 제시 되어 있다. 배열의 마지막 인덱스보다 큰값이 제시되었기 때문에
		//									조치 내용 => 조건식을 수정한다.(i<배열의 길이)
	}

}
