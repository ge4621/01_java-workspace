package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

//사용자의 요청을 처리해주는 클래스!!! 출력문을 쓰지 않기!!!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>(); //[]
	
	{
		//초기화 블럭
		list.add(new Music("Attention", "뉴진스")); //[Music[Attention , 뉴진스]]
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "지아코"));
	}

	public void insertMusic(String title, String artist) { //괄호(MusicMenu)와 맞주기
		list.add(new Music(title, artist)); //  호출 하면서 리스트에 추가
		
	}
	
	public ArrayList<Music> selectMusic() {
		//돌려준다 => return
		
		return list; //반환형이 ArrayList<Music>
	}
	public int deleteMusic(String title) {
		
		int result = 0; 
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break; //반복문 빠져나오기
				
			}
		}
		return result;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		//searchList => 텅 비어있을 수도 있다. 또는 검색된 Music객체들이 담겨 있을 수도 있다.
		return searchList;
	}
	//2.심화버전
	public ArrayList<Music> searchMusic(int menu,String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu ==1) {//곡명으로 검색
			for(int i = 0; i<list.size();i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else {//가수명으로 검색
			for(int i = 0; i<list.size();i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
		}
			}
		
	}
		return searchList;
	}
	
	//검색을 해서 보여줘라 일때는 ArrayList 반환형, 삭제 추가(보여주지 않아도 되는 경우)는 int 반환형
	public int updateMusic(String title, String upAtrist, String upTitle) {
		
		int result = 0;
		
		for(int i = 0; i<list.size();i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upAtrist);
				result = 1; 
				break;
			}
		}
		return result;
	}
	
}
