package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMehtodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;

public class StringRun {

	public static void main(String[] args) {

		A_StringPoolTest a = new A_StringPoolTest();
		//a.method1();
		a.method2();

		B_StringMehtodTest b = new B_StringMehtodTest();
		//b.method();
		
		C_StringTokenizerTest c = new C_StringTokenizerTest();
		c.method();
		
	}
}
