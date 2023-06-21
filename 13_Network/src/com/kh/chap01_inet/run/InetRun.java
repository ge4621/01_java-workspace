package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {

		/*
		 * * 네트워크(Network) : 여러대의 컴퓨터들이 연결되어 있는 통신망 같은거 => 이런 네트워크를 통해 서로간의 데이터를 교환할 수
		 * 있다.
		 * 
		 * * IP주소 : 네트워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호(컴퓨터의 주민번호)
		 * 
		 * * 서버와 클라이언트 >서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 (클라이언트의 요청을 처리해서 응답해주는 것) => 쉽게
		 * 생각하면 서빙하는 역할 >클라이언트 : 서버에 요청하는 컴퓨터(서비스를 제공 받는 고객)
		 * 
		 * - 서버에 요청하기 위해서는 그 요청하고자 하는 서버의 IP주소(또는 도메인명), 포트번호 알아야 한다.
		 */

		// InetAddress : 네트워크 정보(ip주소 관련)를 확인 할 수 있는 클래스

		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);//내 pc명 / 내 IP 주소
			
			System.out.println("내 pc명 : "+ localHost.getHostName());
			System.out.println("내 IP주소 : " + localHost.getHostAddress());
			
			System.out.println("==================================================");
			
			//내가 알고 있는 도메인을 통해서 그 서버 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("www.google.com"); //도메인 명을 통해서 해당 호스트에 대한 정보 반환
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 Ip주소 : " + googleHost.getHostAddress());
			
			System.out.println("============================================");
			
			//도메인을 통해서 서버관련한것들을 배열로 받을 수 있음
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			for(InetAddress n : naverHost) {
				System.out.println("네이버의 서버명 : " + n.getHostName());
				System.out.println("네이버의 IP주소 : " + n.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
