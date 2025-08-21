package com.sist.lang;
/*
 * java.lang / java.text
 * --------- 자바의 기본의 클래스 (import 생략)
 * 
 * 1) Object : 모든 클래스의 상속을 내리는 클래스 (최상위 클래스)
 * 		ㄴ 모든 데이터를 포함한다
 * 		ㄴ 모든 클래스 : extends Object
 * 		ㄴ 주요기능
 * 			ㄴ String toString() : 객체 메모리 주소를 리턴한다
 * 				ㄴ 생략이 가능
 * 			ㄴ boolean equals(Object o) : 객체 비교 (주소비교)
 * 			ㄴ Object clone() : 복제 (새로운 메모리 만든다)
 * 			ㄴ void finalized() : 소멸자
 * 			ㄴ int hashCode() : 객체의 메모리 부소를 기반으로 정수형으로 만든다
 * 
 * 2) String : 문자열을 저장하는 데이터형
 * 		ㄴ 사용법) String s = "" => 일반 데이터형과 동일
 * 				 String s = new String("") => 클래스형태
 * 		ㄴ 주요기능 
 * 			ㄴ 문자의 갯수 : length() => int length()
 * 			ㄴ 문자를 있는 그대로 가지고 오기: toString()
 * 			ㄴ 문자변환 : replace() replaceAll()
 * 						String replace(char c1, char c2)
 * 						String replace(String c1, String c2)
 * 						String replaceAll(String regex, String s)
 * 										 ---------------
 * 										 정규식
 * 			ㄴ 문자 위치 찾기 : int indexOf(char c) ,int indexOf(String s)
 * 							int lasIndexOf(char c)
 * 							int lastIndexOf(String c)
 * 
 * 			ㄴ 문자 자르기 : subString() , split()
 * 						 ------------
 * 						String subString(int b)
 * 						String subString(int b,int e)
 * 						String[] split(String regex)
 * 									  --------------- 정규식을 이용
 * 						=> 보완 : StringTokenizer
 * 			ㄴ 공백 문자 젲거 : trim() : 좌우의 공백 제거
 * 			ㄴ 비교 : equals() => boolean equals(String s)
 * 			ㄴ 검색 : startsWith(), endsWith(), 		contains()
 * 					------------  ----------- 		----------
 * 					시작 문자열(검색) 끝 문자열(확장자) 	포함된 문자열
 * 					원형) boolean startsWith(String s)
 * 					원형) boolean endsWith(String s)
 * 					원형) boolean contains(String s)
 * 		
 * 			ㄴ 문자열 변환 : valueOf(기본형)
 * 							ㄴ static String valueOf(int)
 * 
 * 3) StringBuffer(비동기식) / StringBuilder(동기식)
 * 	  ------------	 		 -------------
 * 		ㄴ append() : 문자열 결합
 * 			ㄴ char, String
 * 		ㄴ 문자가 많은 경우 => 문자열 결합의 최적화
 * 
 * 4) Math : only static
 * 		ㄴ static double random()
 * 		ㄴ static double ceil(double d) : 올림함수
 * 
 * 5) System : 프로그램 종료 / 메모리 해제 / 콘솔 출력
 * 		ㄴ System.exit(int a) => a =0 정상 종료
 * 		ㄴ System.gc() => 가비지 컬렉션
 * 		ㄴ System.in / System.out => 표준 입출력
 * 		  ---------	  -----------
 * 		예외처리			예외철리(x)
 * 
 * 6) Wrapper : 기본 데이터형을 쉽게 제어가 가능하게 만든 클래스
 * 				ㄴ 제네릭을 이용하는 목적
 * 				 데이터형을 통일할 경우에 사용
 * 				<클래스>
 * 				ㄴ 문자열을 해당 데이터형으로 변경
 * 
 * 		ㄴ Integer => Integer.parseInt("10")
 * 		ㄴ Double =>Double.parseDouble("10.5")
 * 		ㄴ Boolean => Boolean parseBoolean("true")
 * 		ㄴ Long -> Long.parseLong("10L")
 * 
 * 7) MessageFormat : SQL문장 / 복잡한 문자의 출력 형식
 * 
 * 8) DecimalFormat : 숫자 표현 세자리아 ,,,\, ##,### = > 오카르 : 99,999
 * 			DecimalFormat d = new DecimalFormat("#,###,###,###")
 * 9) SimpleDateFormat : 날짜 변환
 * 					년도 : yyyy / yy
 * 					월 : MM / M
 * 					일 : dd /d
 * 					시간 : hh / h
 * 					분 : mm / m
 * 					초 : ss / s
 * 			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.*;

public class 라이브러리_lang {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("키보드 입력 : ");
		int a = System.in.read();
		System.out.println(a);
	}

}
