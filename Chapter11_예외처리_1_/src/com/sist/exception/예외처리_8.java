package com.sist.exception;
/*
 * 예외 임의 발생 => throw => 견고한 프로그램인지 테스트
 * 배포전에 주로 사용 => 개발상에서는 사용빈도가 낮음
 * 
 * 
 * 
 */
import java.util.*;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

public class 예외처리_8 {

	public static void main(String[] args) {

		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("정수입력 :");
			int num = scan.nextInt();
			
			if(num%2==0) {
				System.out.println("여기는 상관이 없다");
				throw new MyException("홀수만 입력이 가능합니다");
//				System.out.println("여기는 에러가 난다");
			}
			/*
			 * throw 예외처리 클래스의 생성자 호출
			 * -----------------------------
			 * 밑에는 코딩이 불가능
			 * 
			 * if(조건문){
			 * 		System.out.println(1);
			 * 		throw new Exception();	---- catch 이동
			 * 		System.out.println(2); // error
			 * 
			 * }
			 * 
			 * 
			 */
			
		}
		catch(MyException ex) {
			
			System.out.println(ex.getMessage());
	}
//		catch(NumberFormatException ex) {
//			
//				System.out.println("홀수만 입력이 가능합니다.1");
//		}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			
//			System.out.println("홀수만 입력이 가능합니다.2");
//	}
//		catch(Exception ex) {
//			
//			System.out.println("홀수만 입력이 가능합니다.3");
//	}
		
	}

}
