package com.sist.exception;
/*
 * 	예외처리 (Exception)
 * 		ㄴ 일반 예외(CheckException)
 * 			ㄴ 컴파일러가 예외처리 코드가 있는지 확인
 * 			ㄴ 반드시 예외처리한다
 * 			ㄴ java.io => 입출력
 * 						------
 * 						1) 메모리 입출력
 * 							ㄴ System.in / System.out
 * 						2) 파일 입출력
 * 						3) 네트워크 입출력
 * 			ㄴ java.net => URL / Socket
 * 			ㄴ java.sql => 오라클 연동
 * 			ㄴ 웹         
 * 				
 * 		ㄴ 실행시 예외(UnCheckException)
 * 			ㄴ 컴파일러가 예외처리 코드를 확인하지 않는다
 * 			ㄴ 사용자 입력
 * 		--------------------------------------------
 * 		예외처리 => 상속도 : 466참조
 * 		어떤 클래스가 큰지 여부 (위로 올라 갈수록 크다)
 * 		-------------------------------------------
 * 
 * 		예외처리 코드
 * 		-----------
 * 		try{
 * 			예외 => 예외2-----	자동으로 해당 catch를 찾는다
 * 		}			----- NullPointerException
 * 		catch(예외처리1 => 배열){} 
 * 		catch(예외처리2 => 숫자 변환){}
 * 		catch(예외처리3 => NULL){}
 * 		catch(예외처리4 => 0으로 나눈 경우){}
 * 		catch(예외처리5 => 클래스 형변환){}
 * 		
 * 		finally{
 * 			무조건 수행
 * 				ㄴ 반드시 닫기를 해야되는 경우
 * 				  ---------
 * 					서버 연결
 * 					데이터베이스 연결
 * 					파일 연결
 * 		}
 * 
 * 
 * 
 * 		throws
 * 			ㄴ 메소드 , 생성자
 * 				ㄴ 초기화 블록에서는 사용할 수 없다
 * 			ㄴ 선언 => 처리하는 부분이 아니다
 * 				ㄴ 예측만 한다
 * 			ㄴ 시스템에 알려만 주는 상태다
 * 
 * 
 * 
 * 
 * 
 * 
 */
class A{
	
}

class B extends A{
	
}

public class 예외처리_6 {

	public static void aaa(int a, int b) {
		//if 실행시 예외
		try {

			System.out.println(a/b);
			
		}
		catch(ArithmeticException ex) {
			System.out.println("0으로 나눌 수 없다");
		}
		
	}
	
	public static void bbb(String data) {
		
		try {
			System.out.println(data.length());
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	public static void ccc(String num) {
//		int a = Integer.parseInt(num.trim());

		try {
			int a = Integer.parseInt(num);
			System.out.println(a);
		}
		catch(NumberFormatException ex ) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void ddd() {
		
		try {
			int[] arr = new int[2];
			arr[0] =100;
			arr[2] = 200;
			System.out.println(arr[1]);
			}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static void eee() {
		try {
			A a = new A();
			B b = (B)a;
		}
		catch(Exception  ex ) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
			
		aaa(10, 0);
		bbb(null);
		ccc(" 20");
		ddd();
		eee();
	}

}
