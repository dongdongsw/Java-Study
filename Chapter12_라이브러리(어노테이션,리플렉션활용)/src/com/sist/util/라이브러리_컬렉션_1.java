package com.sist.util;
/*
 * 15장
 * 
 * 	Collection
 * 	----------
 * 	1) 데이터를 묶어서 쉽게 관리할 수 있게 만든 클래스의 집합
 * 	   -------------------- 자료구조(스택, 큐, 데큐)
 * 		0 => length-1
 * 		0 => 0
 * 
 * 	2) Collection Framework : 데이터를 묶어서 저장하고, 삭제하고, 검색하는 작업들을
 * 				 ---------	 효율적으로 할 수 있게 해주는 프레임워크
 * 					 ㄴ 표준화 (형식이 동일함)				
 * 					 ㄴ Spring / MyBatus / Jquery / Vue / React
 * 					 ㄴ 일정 틀 => 쉽게 개발자의 코딩 분석
 * 
 *  3) 배열의 단점을 보완
 *     --- 고정적 => 가변형
 *     
 *  4) 종류
 *  	Collection (interface)
 *  	----------------------
 *		  		  |
 *  	----------------------
 *  	 |		  |			 |
 *    	List	 Set 		Map => interface
 * 	     |		  | 		 |
 * 	     |		----------	 --------------------
 * 	     |		|	     |			|			|
 * 	     |	HashSet		TreeSet	  Hashtable	  HashMap
 * 	     |
 * 	     |
 * 	  ----------------------- 구현된 클래스
 * 	  |			| 	 		|
 * ArrayList  Vector 	LinkedList 
 * 							|
 * 							Queue
 * 
 * 		List 
 * 			1) 순서를 가지고 있다 (인덱스 번호) => 0
 * 			2) 데이터 중복 저장 허용
 * 			3) CRUD를 주로 사용
 * 				(추가, 읽기, 수정, 삭제)
 * 			4) 비동기적 => 속도가 빠르다 => 데이터베이스 사용
 * 			5) 주요 기능
 * 			   -------
 * 				1. 데이터 추가 : add(Object)
 * 				2. 데이터 읽기 : get(int index)
 * 				3. 데이터 수정 : set(int index, Object)
 * 				4. 데이터 삭제 : remove(int index)
 * 				5. 데이터 개수 : size()
 * 				6. 데이터 전체 삭제 : clear()
 * 				7. 데이터 존재여부 : isempty()
 * 			
 * 			6) 구현된 클래스
 * 				ArrayList : 가장 많이 사용되는 클래스
 * 					=> 데이터베이스 (비동기적)
 * 
 * 				Vector : 스레드(Thread)가 동시에 이 Vector에 접근해서 
 * 							데이터를 추가하거나 삭제할 때, 데이터가 꼬이는 걸 방지
 * 					=> 네트워크 (동기적)
 * 
 * 				LinkedList : 양방향 => 저장되는 내용이 많아 메모리가 커진다
 * 					ㄴ '이전 데이터 주소'랑 '다음 데이터 주소'도 같이 저장
 * 					ㄴ 중간에 데이터를 넣거나 뺄 때는 ArrayList보다 훨씬 빠름
 * 					ㄴ  데이터를 조회할 때는 겁나 느림
 * 
 * 			7) import 추가 => java.util
 * --------------------------------------------------------------------------
 * 		
 * 		Set
 * 			1) 순서가 없다 (인덱스가 없다)
 * 
 * 			2) 중복된 데이터를 허용하지 않는다
 * 			add(1) add(1) add(1) add(2)
 * 
 * 			3) 주로 사용 => List에 중복된 데이터 제거
 * 
 * 			4) 구현된 클래스 : HashSet, TreeSet
 * 
 * 			5) 주요 기능
 * 			   -------
 * 				1. 데이터 추가 : add(Object)
 * 				2. 데이터 읽기 : get()
 * 				3. 데이터 수정 : set(Object)
 * 				4. 데이터 삭제 : remove(Object)
 * 				5. 데이터 개수 : size()
 * 				6. 데이터 전체 삭제 : clear()
 * 				7. 데이터 존재여부 : isempty()
 * --------------------------------------------------
 * 
 * 		Map
 * 			1)
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
 * 
 * 
 */

import java.util.*;

public class 라이브러리_컬렉션_1 {

	public static void main(String[] args) {

//		ArrayList names = new ArrayList();
//		Vector names = new Vector();
//		LinkedList names = new LinkedList();
		List names = new Vector();

		names.add("홍길동"); // 0
		names.add("박문수"); // 1
		names.add("심청이"); // 3 
		
		System.out.println("현재인원 :" + names.size());
		for(Object obj : names) {
			System.out.println(obj);
		}
		
		System.out.println();
		names.add("이순신"); // 4
		names.add(2,"강감찬"); // 2
		
		
		System.out.println("현재인원 :" + names.size());

		for(Object obj : names) {
			System.out.println(obj);
		}
		System.out.println();

		names.remove(0); //0번이 삭제되니 순서가 앞으로 떙겨진다
		
		System.out.println("현재인원 :" + names.size());

		for(Object obj : names) {
			System.out.println(obj);
		}
		System.out.println();
		
		names.set(2, "춘향이");
		System.out.println("현재인원 :" + names.size());

		for(Object obj : names) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		names.clear();
		System.out.println("현재인원 :" + names.size());

		for(Object obj : names) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		if(names.isEmpty()) {
			System.out.println("인원이 없습니다");
		}
	}

}

















