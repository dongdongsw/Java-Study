package com.sist.map;
/*
 * 				Map =====> 인터페이스
 * 				|
 * 		-----------------
 * 		|				|
 * 	 HashMap		 Hashtable
 * 		ㄴ 비동기			ㄴ 동기 		==> Hashtable을 보완 HashMap
 * 
 * ==> List : ArrayList
 * ==> Set : HashSet
 * ==> Map : HashMap
 * 
 * ---------------------
 * 
 * => 특징
 * 		두개를 동시에 저장 (key, value)
 * 		=> 웹 / MyBatis / Spring
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;

// => 저장 (push) / 읽기 (get(key))
public class Map_1 {

	public static void main(String[] args) {

//		Map map = new HashMap(); // 비동기 => 일반
		Map map = new Hashtable(); //동기 => 쓰레드

		/*
		 * ArrayList : 비동기 => 데이터베이스
		 * Vector : 쓰레드 => 동기 => 네트워크
		 * LinkedList : 파일 입출력
		 * 
		 * 
		 */
		
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("id", "hong"); //key 중복 => 덮어쓴다
		
		System.out.println("ID : " + map.get("id"));
		System.out.println("PWD : " + map.get("password"));
		System.out.println("NAME : " + map.get("name"));
		System.out.println("SEX : " + map.get("sex"));
		System.out.println("AGE : " + map.get("age"));
		// 키는 대소문자 구분 => 문자로 시작한다
		
		System.out.println();
		Set set = map.keySet();
		for(Object obj : set) {
			String key =(String) obj;
			System.out.println(obj + ": \t" + map.get(key));
		}
		/*
		 * clear() : 전체 삭제
		 * get(String key) : 값 읽기
		 * put() : 저장 (데이터 추가)
		 * isEmpty() : 데이터가 있는지 여부
		 * size() : 저장 갯수
		 * keySet() : key 전체를 읽는 경우
		 * values() : 실제 저장된 값만
		 *
		 * 
		 * 
		 */
		
		System.out.println();
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
		
	}

}





























