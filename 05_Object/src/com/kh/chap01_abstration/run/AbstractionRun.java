package com.kh.chap01_abstration.run;

import com.kh.chap01_abstration.model.vo.Student;

public class AbstractionRun {
	
	/*
	 * 1. 객체지향언어 : "객체"를 "지향"하는 "언어"로 "객체 중심"으로 돌아간다고 생각하면됨.
	 * 
	 *  지양 => 좋지 않음
	 *  지향 => 좋음(추구한다.)
	 *  
	 *  2. 객체란 : 현실세계에 독립적으로 존재(목적이 있고 가치가 있고 의미가 있는)하는 모든것들을 의미(유형,무형,개념,...)
	 *  			현실세게에서는 객체들간의 상호작용으로 돌아감(내가 물을 먹는다.)
	 *  
	 *  3. 객체지향 프로그래밍 : 현실세계의 객체들간의 상호작용
	 *  					프로그래밍을 통해 가상세계로 구현하는 것(내가 쇼핑몰에서 로그인 한다.)
	 *  
	 *  4. 구현하고자 하는 프로그램상의 필요한 객체들을 만들기 위해서 (즉, 생성하기 위해서)
	 *  	:클래스라는 틀을 먼저 만들어야됨!!(클래스란 ? 각 객체들의 속성(정보)들을 담아낼 그릇 같은 존재) => 이름, 나이, 주소, 휴대폰번호 등을 담을 수 있는 그릇
	 *  	>>어떻게 만드는 걸까? => 추상화 + 캡슐화 접목해서 만들어야함!!
	 *  
	 *  5.추상화 과정
	 *  1)내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해볼 것 => 쇼핑몰
	 *  2)그 객체들이 가지는 공통적인 속성, 기능들을 모두 추출 => 이름, 나이, 주소, 휴대폰번호,mbti,혈액형....
	 *  3)추출한 것들을 가지고 내가 구현하고자 했던 프로그램 "실질적인 목적"에 맞춰 불필요한 속성, 기능들을 제거할 것 =>mbti, 혈액형..
	 *  4)그렇게 최종적으로 추려진 속성들을 어떤 자료형으로 , 어떤 변수명으로 사용할 건지 생각
	 *  
	 *  ex)학생 관리 프로그램
	 *  1)학생관련객체(문동은 학생, 박연진 학생, 이사라 학생...)
	 *  2)공통적인 속성 및 기능들(이름, 나이, 주소, 전화번호, 키, 몸무게, 달리기속도, 학년, 반, 국어점수, 수학점수, 영어점수, 머리색깔, 발사이즈, 밥먹는다., 잠잔다....)
	 *  3)학생"인적사항"을 관리하는 프로그램이라고 한다면 : 이름, 나이, 주소, 전화번호, 학년, 반
	 *   학생의 "성적"을 관리하는 프로그램 이라고 한다면 : 이름, 학년, 반, 국어점수, 수학점수, 영어점수
	 *   학생 "건강"을 관리하는 프로그램 이라고 한다면 : 이름, 학년, 반, 키, 몸무게, 달리기속도, 먹는다. 잠잔다.
	 *   
	 *   결국 추려진게 "이름, 나이, 키"라는 가정하에 
	 *   
	 *  4)이름 : String name;
	 *    나이 : int age;
	 *    키  : double height;
	 *    
	 *  6. 위에 선정된 것들을 가지고 본격적인 프로그램을 할껀데....
	 *  
	 *  	1)"번수"만으로 프로그래밍을 한다면??
	 *  		*변수 - 하나의 자료형의 하나의 값만을 보관할 수 있음
	 *  	예시)문동은이라는 학생 객체를 하나 만들어내기 위해서? ->String name1 = "문동은"; int age1 = 20; double height = 162.3;
	 *  		박연진이라는 학생 객체를 하나 만들어내기 위해서? ->String name2 = "박연진"; int age2 = 21; double height = 163.5; 
	 *  		이사라 라는 학생객체를 하나 만들어 내기 위해서? ->String name3 = "이사라"; int age3 = 22; double height = 165.7;
	 *  		....등등의 수백명에 해당하는 학생들 만들어야 됨!!
	 *  
	 *  어떤 문제가 발생?? -> 수백명에 해당하는 학생들을 만들때 => 수천개의 변수가 만들어진다.
	 *  	2) "배열"로 프로그래밍을 한다면?
	 *  	*배열 - 하나의 자료형의 여러개의 값들을 보관할 수 있음
	 *  
	 *  	학생들의 이름들을 보관하는 String[] name = {"문동은", "박연진", "이사라"}
	 *  	학생들의 나이를 보관하는 int[] age = {20,21,22}
	 *  	학생들의 키를 보관하는 double[] height = {162.3, 163.5, 165.7}
	 *  
	 *  	어떤 분제 발생??
	 *  	=>기존의 학생 정보를 지워야할 때 뒤의 정보들을 앞으로 땡기는 과정을 진행해야함..
	 *  	잘못땡기면 정보가 틀어진다..
	 *  	
	 *  	=>새로운 학생이 전학오면?? 배열을 다시 만들어야함 + 복사해야함
	 *  
	 *  	3)그래서 나온 개념이 구조체!!!
	 *  	
	 *  	*구조체 - 여러개의 자료형의 여러개의 값들을 보관할 수 있음
	 *  
	 *  	String 값도 보관하고, int 값도 보관하고, double 값도 같이 보관할 수 있도록
	 *  	나만의 배열같은 자료형을 만들자!!! 그게 바로 클래스!!!!
	 *  
	 *   	Student 라는 클래스로 만들꺼임!! => 객체의 정보를 보관할 그릇과도 같은 이런 클래스들은 => model.vo
	 *   	
	 *  
	 */
	
	
	public static void main(String[] args) {
		//자배에서의 객체로 만들기 위해서 new라는 키워드를 통해 Heap영역에 생성 먼저 해야 됨!!!(공간할당)
		Student moon = new Student();
		//클래스명 별칭 = new 클래스명();
		//주소값을 담고 있음!! 기본자료형이 아니기 때문에
		
		//여기까지는 Heap영역에 할당된 공간에는 JVM의 초기값들이 세팅되어 있을 것
		
		//각 영역에 "직접접근"해서 내가 원하는 값 대입 => public 이라서 개방되어 있음
		//arr[0]=10;
		
		moon.name = "문동은";
		moon.age = 20;
		moon.height = 162.3;
		
		System.out.println(moon);//주소값
		System.out.println(moon.name + "님의 나이는 "+ moon.age + "살이고, 키는 " + moon.height+"cm 입니다");
		
		//박연지 학생 객체 만들기 -> 박연진, 21, 173.4
		Student park = new Student();
		
		park.name = "박연진";
		park.age = 21;
		park.height = 173.4;
		
		System.out.println(park.name+"님의 나이는 "+park.age+"살이고, 키는 "+park.height+"cm 입니다.");
		
		/*
		 * 필드를 public 접근제한자로 작성
		 * =>필드에 직접적으로 접근해서 값 대입하거나 값을 가져올수 있음!
		 * =>외부에서 함부로 값을 변질시키거나 조회권한이 없는 사람이 가져올 수 있는 문제 발생
		 *   >>>캡슐화 작업을 할꺼임!!
		 */
		
		
		
		
	}

}
