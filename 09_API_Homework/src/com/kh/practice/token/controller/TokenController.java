package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
	}

	public String afterToken(String str) {
		
		String sum = "";
		StringTokenizer stn = new StringTokenizer(str, " ");
		for (int i = 0; i < stn.countTokens(); i++) {
			sum += stn.nextToken();
		}
		return sum;
	}

	public String firstCap(String input) {

		String input1 = input.substring(1, input.length()).toLowerCase(); // 첫문자 제외하고 소문자
		String input2 = input.substring(0).toUpperCase(); // 첫번째 문자 대문자
		String input3 = input1.concat(input2); // 위 두개 합치기

		return input3;
	}

	public int findChar(String input, char one) {

		int count = 0;
		char ch = input.charAt(0);

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		return count;

	}
}
