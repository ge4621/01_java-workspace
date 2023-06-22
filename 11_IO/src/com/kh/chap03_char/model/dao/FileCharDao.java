package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//dao(Date Access Object의 약자)
public class FileCharDao {

	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기
	 * 
	 * - 문자스트림 : 데이터를 2바이트 단위로 전송하는 통로다(넑은통로)
	 * - 기반스트림 : 외부매체와 직접적으로 연결되는 통로다.
	 * 
	 * - XXXReader : 입력용 스트림
	 * - XXXWrite : 출력용 스트림
	 */
	
	//프로그램 --------->파일(출력 작업)
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		
		FileWriter fw = null;
		
		try {
			//1.FileWriter 객체생성
			fw = new FileWriter("b_char.txt"/*,true*/); //해당 파일이 없으면 새로 생성, 있으면 그냥 연결
			
			//2. write메소드를 이용하여 데이터를 출력(자바에서 파일로 출력)
			//	2byte 단위로 데이터가 전송된다.
			
			fw.write("와! IO재미있다...ㅎ");
			fw.write(' '); //한칸 뛰어쓰기
			fw.write('A');
			fw.write('\n'); //한줄 개행
			fw.write('b'); //한줄 개행
			fw.write(' ');
			
			char[] arr = {'a', 'p', 'p','l','e'};
			fw.write(arr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//3.스트림 반납 꼭하기 !!!!!!!!!!
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	//프로그램 <--------파일 (입력, 외부에 있던 정보가 들어온다)
	public void fileRead() { //실제 파일이 있어야됨 없으면 오류
		
		//FileReader : 파일로 부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림
		FileReader fr = null;
		
		try {
			//1.FileReader 객체 생성
			fr = new FileReader("b_char.txt");
			
			//2. read 메소드 이용해서 읽어들이자(정수값)
			//	파일의 끝을 만나는 순간 -1 출력
			
			int value = 0;
			while((value = fr.read())!= -1) {
				//System.out.println(value); //숫자로 나옴
				System.out.print((char)value); //문자로 형변환
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 스트림 반납
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	

}
