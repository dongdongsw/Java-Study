package com.sist.exception;
/*
 * 다중 catch사용
 * 	ㄴ 의심되는 에러
 * 
 *  	1. 배열을 생서
 *  	2. 문자열 정수 입력 => 정수로 변환 => 배열에 저장
 *  	3. 나누기
 *  
 *  
 *  
 *  
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b= 0;
		try {
			System.out.println(a/b);
		}

		catch(NumberFormatException e) {
			System.out.println("에러발생");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눔");

		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오류");

		}
//		catch(Exception e) {
//			System.out.println("최상위 오류");
//
//		}  // 맨 마지막에 있어야함 (크기를 알아야함)
		catch(RuntimeException e) {
		System.out.println("런타임 오류");

	} //런타임이 3개를 다 잡음 맨 마지막 줄에 있어야 함
	}

}
