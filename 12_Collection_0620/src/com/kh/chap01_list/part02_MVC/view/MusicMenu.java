package com.kh.chap01_list.part02_MVC.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_MVC.controller.MusicController;
import com.kh.chap01_list.part02_MVC.model.vo.Music;

//화면을 담당하는 클래스(출력문, 입력문)

/**
 * @author yoon
 * @since 2023.06.20
 * @version1.0
 *
 */
public class MusicMenu {
	
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	
	//메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {

		while(true) {
			System.out.println("\n========Welcome 별밤=============");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">>메뉴선택 : ");
			int menu = sc.nextInt();
			
			//switch(동등비교할 대상) , 처리하기 쉬운것 부터 작성하기 여기서는 0선택과 default부터
			switch(menu) {
			case 1:
				insertMusic();
				break;
			case 2: 
				selectMusic();
				break;
			case 3: 
				deleteMusic();
				break;
			case 4: 
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0: 
				System.out.println("프로그램을 종료합니다. 이용해줘서 감사합니다.");
				return; //메소드 호출한곳으로 나온다.
			default: 
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
				break; 
				
			}
			
		}
	}
	
	//반환형을 모를때는 void를 일단 사용
	//ctrl + shift + j => 아래 파란색 주석
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n=========새로운 곡 추가=================");
		
		sc.nextLine();
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist);
		
	}
	
	/**
	 * 2. 곡 전체 조회하는 서브화면
	 */
	public void selectMusic() {
		System.out.println("=========곡 전체 조회=================");
		
		ArrayList<Music> list = mc.selectMusic(); //곡을 담고 있는 리스트 가져오기
		
		if(list.isEmpty()) {
			System.out.println("곡이 존재하지 않습니다.");
		}else {
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
		
	/**
	 * 3. 특정곡 삭제해주는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("=========특정 곡 삭제=================");
	
		sc.nextLine(); 
		
		System.out.print("삭제하고 싶은 노래 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제하였습니다.");
			selectMusic();
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
			
		}
	}
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("=========특정 곡 검색=================");
		
<<<<<<< HEAD
		System.out.println("검색하고 싶은 노래 : ");
		String keyword = sc.nextLine();
		
		mc.searchMusic();
=======
		sc.nextLine();
		
		System.out.print("검색하고 싶은 곡(키워드 입력)입력 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);
		
		if(searchList.isEmpty()){
			System.out.println("검색결과가 없습니다.");
		}else {
			for(int i=0; i<searchList.size();i++) {
				System.out.println(searchList.get(i));
			}
		}
		
		
>>>>>>> 6679743967226419902fe255f9fe410bf922cd55
	}
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("=========특정 곡 수정 ===============");
		
		sc.nextLine();
		
		System.out.println("수정하고싶은 노래");
		String title = sc.nextLine();
		
		
		System.out.println("제목 수정 : ");
		String uptitle = sc.nextLine();
		
		System.out.println("수정 가수: ");
		String upartist = sc.nextLine();
		
		int result = mc.updateMusic(title,uptitle,upartist);
		
		if(result>0) {
			System.out.println("성공적으로 수정");
			selectMusic();
		}else {
			System.out.println("수정값을 찾지 못했습니다.");
		}
		
		
	}
		
	
}