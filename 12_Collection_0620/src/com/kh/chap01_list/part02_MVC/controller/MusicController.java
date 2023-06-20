package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

//사용자의 요청을 처리해주는 클래스!!! 출력문을 쓰지 않기!!!
public class MusicController {
	
	ArrayList<Music> list = new ArrayList<>();  
	{
		list.add(new Music("아이브", "아이엠"));
		list.add(new Music("아이들", "퀸카"));
		list.add(new Music("세븐틴", "손오공"));
		
	}
	
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		
		return list;
	}
	public int deleteMusic(String title) {
		
		int result = 0; 
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title));
			list.remove(i);
			result = 1;
			break;
		}
		return result;
	}
	
}
