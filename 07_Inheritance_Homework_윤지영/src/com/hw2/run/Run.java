package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

<<<<<<< HEAD
		
=======
		System.out.println("==================Circle========================");

		Circle[] arr = new Circle[2];  //크기가 2인 객체 배열
		arr[0] = new Circle(1, 2, 3);  //초기화
		arr[1] = new Circle(3, 3, 4);  //초기화

		for (int i = 0; i < arr.length; i++) {
			arr[i].draw();
			
			System.out.println();
		}

		System.out.println("========================Rectangle================================");

		Rectangle[] rec = new Rectangle[2];    //크기가 2인 객체배열
		rec[0] = new Rectangle(-1, -2, 5, 2);  //초기화
		rec[1] = new Rectangle(-2, 5, 2, 8);  //초기화

		for (int j = 0; j < rec.length; j++) {

			rec[j].draw();
			
			System.out.println();
		}
>>>>>>> 80982a48417cd7a9535f108c6c842db99f53ee65
	}
}
