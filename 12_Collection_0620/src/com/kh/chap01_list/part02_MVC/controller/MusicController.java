package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

//사용자의 요청을 처리해주는 클래스!!! 출력문을 쓰지 않기!!!
public class MusicController {
	
	ArrayList<Music> list = new ArrayList<>();  
	{
		list.add(new Music("아이엠", "아이브"));
		list.add(new Music("퀸카", "아이들"));
		list.add(new Music("손오공", "세븐틴"));
		
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
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	public int updateMusic(String title, String uptitle, String upartist) {
		
		int result = 0;
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(uptitle);
				list.get(i).setArtist(upartist);
				result = 1; 
				break;
			}
		}
		
		return result;
		
	}
	
	
	
	
	
}
