package com.sist.set;
/*
 * 	 Set
 * 	  |
 * 	  -------------
 * 	  |			  |
 * HashSet		TreeSet
 * ------- 중복 제거 ==> 코딩 테스트
 * 
 * 	1) 특징 
 * 		ㄴ 순서가 없다(인덱스 번호가 없다)
 * 		  일반 for문을 사용할 수 없다 => forEach , Iternater
 * 		ㄴ 데이터 중복을 허용하지 않는다
 * 		ㄴ 주로 => ArrayList에 있는 데이터 중에 중복 제거
 * 		ㄴ 구현된 클래스
 * 			ㄴ HashSet / TreeSet
 * 	2) 주요 기능 (수정이 없다)
 * 		ㄴ 데이터 저장 		: add() 
 * 		ㄴ 데이터 읽기  		: get
 * 		ㄴ 저장된 데이터 갯수 	: size()
 * 		ㄴ 전체 삭제 			: clear()
 * 		ㄴ 데이터 존재 여부 	: isEmpty()
 * 
 * 		ArrayList => Set => ArrayList
 * 					  |
 * 					Cookie => MyBatis => Spring
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class Set_1 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		//데이터 추가 => 중복된 데이터는 제외
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("귤");
		set.add("망고");
		set.add("사과");
		set.add("배");
		
		System.out.println("과일 갯수" + set.size());
		for(Object obj : set) {
			System.out.println(set.toString());
		}
		
		//CRUD => 추가 / 읽기 / 수정 / 삭제
		System.out.println();
		System.out.println("====== 삭제 ======");
		set.remove("배");
		System.out.println("과일 갯수" + set.size());
		for(Object obj : set) {
			System.out.println(set.toString());
		}
		
		System.out.println();
		System.out.println("====== 전체삭제 ======");
		set.clear();
		System.out.println("과일 갯수" + set.size());
		for(Object obj : set) {
			System.out.println(set.toString());
		}
		
		if(set.isEmpty()) {
			System.out.println("과일이 없습니다");
		}
		else {
			System.out.println("과일이 있습니다");
		}
		//단점 => 객체 단위 저장 => 같은 이름이 있는경우에는 제거할 수 없다
		//JSP(x) , Servlet(x), Spring(x)
		//WebSocket
		//오라클에 존재 
	}

}

























