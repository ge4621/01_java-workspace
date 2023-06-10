package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		Circle[] arr = new Circle[2];
		arr[0] = new Circle(1,2,3);
		arr[1] = new Circle(3,3,4);
		
		
		Rectangle[] rec = new Rectangle[2];
		rec[0] = new Rectangle(-1,-2,5,2);
		rec[1] = new Rectangle(-2,5,2,8);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(" ");
		}
	}

}
