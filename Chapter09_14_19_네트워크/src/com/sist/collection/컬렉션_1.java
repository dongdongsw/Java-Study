package com.sist.collection;
/*
 * 
 * 		라이브러리
 * 			Object
 * 				ㄴ clone / hashCode / equals / finalize / toString
 * 			String
 * 				ㄴ length / equals / startsWith / endsWith / contains
 * 				ㄴ indexOf / lastIndexOf / trim / valueOf
 * 				ㄴ substring / split
 * 			StringBuffer
 * 				ㄴ append
 * 			Math
 * 				ㄴ random / ceil
 * 			System
 * 				ㄴ System.out.println()
 * 		----------------------------------------------------------------java.lang
 * 
 * 		java.text
 * 			SimpleDateFormat
 * 			MessageFormat
 * 			DecimalFormat
 * 			--------------------format()
 * 
 * 		java.util
 * 			StringTokenizer
 * 				ㄴ hasMoreTokens / countToken / nextToken
 * 			Random
 * 				ㄴ nextInt(int bound)
 * 			Collection
 * 				ㄴ List => ArrayList
 * 				ㄴ map => HashMap
 * 				ㄴ Set => HashSet
 * 		-------------------------------------
 * 		 	정규식 / 리플렉션 / 어노테이션
 * 		-------------------------------------
 * 			기본 자바 => 데이터베이스 자바 => 웹 자바 => spring 자바
 * 
 * 	
 * 		제네릭
 * 		----- 컬레션에서만 사용하는 것 같다 => List<필요한 데이터형> 
 * 											--------------- 자바 클래스
 * 											--------------- 사용자 정의
 * 										List<EmpVO>
 * 		제네릭을 지정 => 데이터형의 한계
 * 		List<String> : 무조건 String만 저장이 가능
 * 		add(String a) add(Object obj)
 * 		------------String[]
 * 
 * 
 * 
 */
import java.util.*;

public class 컬렉션_1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); //제네릭을 String으로 했으니 list.add(숫자 안됨)
//		list.add(1);
		// List<String> list = new ArrayList<String>();
		// List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		
		for(String f : list) {
			System.out.println(f);
		}
		
		
		// 정수 => Integer <클래스형> : wrapper
		// 형변환 (x) , 지정값만 저장 => 리턴형도 지정된 값만 사용
		
	}

}

