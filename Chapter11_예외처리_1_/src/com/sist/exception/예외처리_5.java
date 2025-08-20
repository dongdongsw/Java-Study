package com.sist.exception;
/*
 * 간접 처리 : throws 
 * 	ㄴ 예외 회피 => 컴파일 통과를 위해 시스템에 알려준다
 * 		ㄴ 예외 떠맡기기 
 * 		  -----------
 * 				ㄴ 처리 => 메소드 호출시에 처리(개발자)
 * 				ㄴ 애매한 상태
 * 					ㄴ 에러가 예측이 안되는 상태
 * 					ㄴ 메소드 처리				
 * 						ㄴ 소스량이 많다
 * 
 * 형식) 
 * 		public void display() throws 예외처리클래스1, 예외처리클래스2, 예외처리클래스3{} //여러개 일수도 있다
 *									----------------------------------------
 *		public void aaa() throws Exception{ //이렇게 하나로 통일할 수 있다 Exception은 최상위 예외처리이다
 *
 *			display();
 *		
 *		}							 
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


public class 예외처리_5 {

	
	//복구는 못함 
	//예외처리는 됬다라고만 알려줌
//	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(0);
//	}
	
	// 1.
//	public static void display() throws NumberFormatException,ArrayIndexOutOfBoundsException, NullPointerException{
//		
//		System.out.println("display call...");
//		
//	}
	
	// 2.
//	public static void display() throws NumberFormatException,ArrayIndexOutOfBoundsException, Exception{ // 오류 발생
//		
//		System.out.println("display call...");
//		
//	}
	
	// 3.
public static void display() throws NumberFormatException,ArrayIndexOutOfBoundsException, Throwable{ // 예외와 에러처리까지 해결한다
		
		System.out.println("display call...");
		
	}
	
	// 1.
//	public static void main(String[] args) {
//		
//		try {
//		
//			Thread.sleep(0);
//			
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//			
//		}
//		
//		display();
//		
//}	 
	
	// 2.
//	public static void main(String[] args) throws Exception{ // 이렇게 받아주면 오류 안생김
//		
//
//		display();
//		
//}	 
	
	// 3.
	public static void main(String[] args) throws Throwable{ 
	

		display();
	
}	 
	
}
