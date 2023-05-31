package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {

	
	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다.!
		 * 즉, java.until.Scanner 클래스를 이용하는 것이다.!
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		 */
		
		//스캐너 생성(new가 있는 것)
		Scanner sc = new Scanner(System.in);     //스캐너 할때 필수적으로 있어야 됨
		//System.in 은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		
		System.out.print("아무거나 입력해보세요 : ");
		String message = sc.nextLine();
		
		
		System.out.println("입력받은 내용 : " + message);
		
		sc.close();  //스캐너 반납
		
	}
		public void inputTest2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("당신의 이름은 무엇입니까?");
			
			
			//사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
			//String name = sc.next();
			//next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
			// 따라서 거주지처럼 공백이 있는 데이터는 제대로 된 값을 못가져 올 수도 있음
			
			//이렇게 하면 공백도 가능!
			String name = sc.nextLine();
			//nextLine() : 사용자가 입력한 값을 모두 읽어옴(엔터 전 까지의 모든 값) 
			
			System.out.print("당신의 나이는 몇 살입니까?");
			int age = sc.nextInt(); //사용자가 입력한 값을 정수로 읽어들이는 메소드
			
			System.out.print("당신의 키는 몇 입니까?(소수점 첫째 자리까지) :");
			double height = sc.nextDouble();//사용자가 입력한 값을 실수로 읽어들이는 메소드
			
			//XX님은 XX살이며, 키는 XXX.Xcm 입니다.
			System.out.println(name + "님은 " + age +"살이며, 키는"+ height +"cm 입니다.");
			sc.close();
	}
		//키보드로 값을 입력 받을 때 종종 발생되는 문제
		public void inputTest3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt(); 
			
			//버퍼에 남아있는 엔터를 비워주는 코드를 추가
			sc.nextLine();
			
			System.out.print("주소 : ");
			String address = sc.nextLine();
			
			System.out.print("키 : ");
			double height = sc.nextDouble(); //실수형으로 사용
			
			//XX님은 XX살이며, 사는 곳은 XXX이고, 키는 XXX.Xcm입니다.
			System.out.println(name + "님은" + age +"살이며, 사는 곳은" + address + "이고, 키는" + height +"cm입니다.");
			
			System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.",name,age,address,height);  //키는 실수형으로 사용했기 때문에 %f사용
			sc.close();
		}
		
		public void inputTest4() {
			//스캐너 생성
			Scanner sc = new Scanner(System.in);
			
			//문자열을 입력 받을 때 => sc.nextLine() sc.next() => 문자만 공백까지만
			//정수값을 입력 받을 때 => sc.nextInt()
			//실수값을 입력 받을 때 => sc.nextDouble()
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			//char gender = sc.nextChar(); //nextChar()와 같은 메소드는 존재하지 않는다.
			char gender = sc.nextLine().charAt(4);
			//문지열.charAt(인덱스) : 해당 문자열로부터 해당 인텍스의 문자를 추출해주는 메소드
			//**인덱스 : 순번 같은 존재, 단 0부터 시작한다.
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double heigth = sc.nextDouble();
			
			/*
			 * XXX님의 개인정보
			 * 성별 : X
			 * 나이 : XX
			 * 키 : XXX.X
			 */
			System.out.println(name + "님의 개인정보");
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + heigth);
			sc.close();
		}
		
		public void chartTest(){
		
			String str = "Hello";
			
			//변수에 기록하여 출력하는 방식
			char ch =str.charAt(0);  //H
			System.out.println(ch);
			
			//바로 출력하는 방식
			System.out.println(str.charAt(4));
			
			}
			
			
		
		
		
		
		
		//존재하지 않는 인덱스 : 오류발생!!!
		//System.out.println(str.charAt(12)); //java.lang.stringIdexOutOfBoundsException

		//System.out.println(str.charAt(12));
		
		/*정리**
		 * 1.콘솔창에 (모니터) 출력하기 위해 : System.out.println[ln]() 메소드 이용
		 * 2.콘솔창에 (키보드) 입력받기 위해 : Scanner  이용해서 (nextLine(), next(), nextInt(), nextDouble()....)
		 * 
		 * 
		 * 
		 *   >주의사항
		 *   1)sc.nextXXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야될 경우
		 *     sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아 있는 엔터를 빼주는 과정 필수!
		 *   2)'문자'값을 입력받아야 될경우
		 *     sc.nextLine()메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스 값) 메소드를 통해서 문자하나 추출
		 */
	 
		
		
		
		
}


