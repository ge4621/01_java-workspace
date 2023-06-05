package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {
		int[] arr= {22, 66, 13, 16, 32, 54, 2, 7, 4, 19};
		//임시변수 => temp
		int temp = 0;
		
		for(int i = 0; i<arr.length; i++) {//전체사이클
			for(int j = 1; j<arr.length;j++) {//안쪽사이클
				if(arr[j-1]>arr[j]) {//앞의 숫자가 뒤에 숫자보다 큰 경우
					temp = arr[j-1]; //tem에 앞에 있는 큰 숫자가 입력(보관)
					arr[j-1] = arr[j]; //앞자리에 뒤어 있던 작은수 넣기
					arr[j] = temp; //temp에 보관한 숫자를 뒷자리에 넣기
				}
			}
		}
	}

}
