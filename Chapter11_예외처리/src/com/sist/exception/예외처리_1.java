package com.sist.exception;
/*
 * 	프로그램 
 * 			 javac				  java
 * 	A.java =========== A.class =========== 실행
 * ------	 컴파일		------   인터프리터
 * 	원시소스			  바이트 코드
 * 	  |					 |
 * 	개발자 개발자       컴퓨터가 인식하는 언어
 * 				|				|
 * 			컴파일시에러		실행시 에러
 * 			CheckException		UnCheckException
 * 			--------------				ㄴ 필요시에만 예외처리
 * 			컴파일시에 예외처리여부 확인				| 
 * 			ㄴ 반드시 예외처리					필요시에만 예외처리
 * 			ㄴ 파일읽기 / 크롤링				자주 에러가 나는 부분
 * 			  	네트워크 / 웹
 * 				쓰레드
 * 
 * 
 * 	전체 : 
 * 			에러 ㅣ 소스 수정이 불가능
 * 			예외 : 소스 수정이 가능 => 가벼운 에러
 * 
 * 	에러처리
 * 			정의 : 프로그램 실현시에 발생할 수 있는 에러에 대비한 코드
 * 					예외 -> 프로그래머 실수 (디버깅)
 * 							사용자 입력 (유효성 검사)
 * 
 * 	목적 : 비정상 종료를 방지하고 정상 상태 유지
 * 	-----------------------------------
 * 	에러 : 심각한 에러
 * 			ㄴ 메모리 부족 => 종료
 * 			ㄴ 윈도우 종료
 * 	예외 : 가벼운 에러(소수상에서 수정이 가능)
 * 			사이트 연결 => URL주소
 * 			파일 읽기 / 경로명의 문제
 * 			서버연결 => IP /PORT
 * 		에외처리를 하면 에러가 수정된다 (x)
 * 		에러를 건너뛴다
 * 
 * 	1. 	
 * 		try ~ catch
 * 	2. 예외 회피
 * 		throws
 * 	3. 예외 발생
 * 		throw
 * 	4. 사용자 정의
 * 		class A extends Exception
 * 
 * 
 * 				throwable
 * 					|
 * 		Error-------------Exception
 * 		 |					|
 * 			CheckException----------UnCheckException		
 *					|							ㄴ RuntimeException
 *				IOException							실행시에러
 *				입출력 관련								|
 *												NumberFormatException
 *				System.in						문자열 => 정수형 변환이 안되는 경우
 *					ㄴ 예외처리 반드시				웹에서 주로 발생
 *				System.out						list.jsp?page = 1
 *					ㄴ 예외처리 선택				
 *				InterruptedException			ArrayIndexOutOfBoundsException	
 *				ㄴ 쓰레드 충돌							배열의 범위를 초과할 때
 *				MalformedURLException			ClassCastException
 *				ㄴ URL관련 => 크롤링					클래스 형변환의 문제
 *				ClassNotFoundException
 *				ㄴ 리플렉션						NullPorinterException
 *				=> 클래스명으로 메모리 할당				클래스에 메모리 할당이 안된상태 (null값)
 *													String s;
 *				SQLException						s.subString(); <- 에러
 *				ㄴ 데이터베이스 관련						ㄴ 테이터베이스
 *
 *				=> java.io
 *				=> java.net
 *				=> java.sql
 *
 *				예외처리
 *					ㄴ 예외 복구
 *						try ~ catch
 *	
 *
 *
 *
 *
 *
 *
 *
 */			
 

public class 예외처리_1 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		try {
			for(int i = 0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception ex) {}
		System.out.println("프로그램 종료!!");
		
	}

}
