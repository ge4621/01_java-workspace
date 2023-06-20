package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		//계층 구조를 보면
		//List 계열 , Set 계열의 클래스들은 Collection 구현한 클래스다.
		//=> 객체를 추가하고자 할 때 공통적으로 add메소드 이용!!!!
		
		// Map계열은 Collection 을 구현한 클래스가 아니다.
		//=> 추가하고자 할 때 put 메소드 이용 (이때 키 + 벨류 를 세트로 담아야 한다.)
		
		//1.put(K key , V value ) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));  //키값이 중복되면 안되지만 벨류값은 중복되도 상관이 없다.
		
		System.out.println(hm); //{키 = 벨류, 키 = 벨류} 형식으로 담겨서 출력이 된다.
		//저장되는 순서는 유지되지 않는다. value 값이 중복되도 키 값이 중복안되면 잘 저장이 된다.
		
		hm.put("새우깡", new Snack("매운맛", 700)); //키값을 중복, 벨류값은 중복 x 
		//동일한 키값으로 다시 추가하는 경우 value 값이 덮어 씌우짐(중복된 키값은 공존할 수 없다. 키 값이 식별자 같은 개념)
		
		System.out.println(hm);
		
		//2. get(Object key) : V => 컬렉션에서 해당 키 값을 가지는 value 값을 반환시켜주는 메소드 
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		//3. size() : 컬렉션에 담겨 있는 객체들의 개수를 반환
		System.out.println("몇개 있을까? : "+ hm.size() + "개 있음");
		
		//4. replace(K key,V value) => 컬렉션에서 해당 키값을 찾아서 다시 전달한 Value 값으로 수정시켜주는 메소드
		hm.replace("포테이토칩",new Snack("겁나 짠맛", 1000));
		//hm.replace("포테이토칩123",new Snack("겁나 짠맛", 1000));//없는 키값을 제시하면 무시한다.
		System.out.println(hm);
		
		//5. remove(Object key) => 켈렉션에서 해당 키 값 찾아서 그 키 - 벨류 세트로 삭제시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("===============================================================");
		
		//map 공간에 모든 키값과 벨류값 다 출력하고자 할 때
		//for each문 안됨
		/*
		for(Object o :hm) {
			
		}
		*/
		
		//ArrayList도 안됨!!!
		//ArrayList list = new ArrayList(hm);
		
		//Iterator 반복자 이용
		//Iterator it = hm.iterator();  //곧바로 iterator() 호출 못함, 왜?? iterator()은 List 계열 또는 set계열에서만 쓸수 있는 메소드
		
		// Map을 Set으로 바꿔주는 메소드 제공함(게다가 2개)
		
		//Map계열을 Set으로 바꾸기
		//1. keySet() 메소드 이용하는 방법
		
		Set keySet = hm.keySet(); //hm에 있는 키들만 Set에 담기(키들의 집합형태)
		
		//위 과정에서 작업된 keySet을 Iterator에 담기
		//keySet.iterator();  : Iterator (=> 반환형이 Iterator이다.)
		Iterator itkey = keySet.iterator();
		
		//반복문을 통해 뽑기
		while(itkey.hasNext()) {
			String key = (String)itkey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + " = " + value);
		}
		
		//2. entrySet() 메소드 이용하는 방법
		
		//1)hm.entrySet() : Set
		Set entrySet = hm.entrySet();
		
		//2)entrySet.interator() : Iterator
		Iterator itEntry = entrySet.iterator();
		
		//3)반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			
			Entry entry = (Entry)itEntry.next();
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			
			System.out.println(key + " = " + value);
		}
		
		
	}

}
