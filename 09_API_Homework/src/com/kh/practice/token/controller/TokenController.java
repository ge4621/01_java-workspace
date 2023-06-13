package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {}
	
	public String afterToken(String str) {
		String sum = "";
		StringTokenizer stn = new StringTokenizer(str," ");
		for(int i = 0; i<stn.countTokens();i++) {
			sum+=stn.nextToken();
		}return sum;
	}
	
	public String firstCap(String input) {
		
		
	}
	
	public int findChar(String input, char one) {
		
		
	}
}
