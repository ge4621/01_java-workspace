package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	//프로그램 ------> 파일 (출력)
	//파일은 사실 우리가 볼려고 관상용으로 만든다기 보다는 나중에 읽어오기 위해 만드는 것임!
	public void fileSave() {
		
		//출력할 데이터 (Phone 객체)
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤력시", 1200000);
		Phone ph3 = new Phone("플립", 1500000);
		
		//객체 단위로 출력해줄 수 있는 보조스트림 필요!!
		
		//ObjectXXXXX => 얘는 Writer, Reader 가 없다.!!!
		//=>바이트 기반 스트림, 문자 기반 스트림 중에 바이트 기반만 사용가능 
		
		//FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		//ObjectOutputStream : 객체단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 없다.!!!!)
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//프로그램 <-------파일 (입력)
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());//파일의 끝을 만나는 순간 예외 발생 => EOFException
			
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		}catch(EOFException e) {
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		}
		
	}
	
	
	
	
}
