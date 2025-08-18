package com.sist.main;
/*
 * 	상속 / 오버라이딩 / 형변환
 * 						ㄴ 자동 형변환 / 강제 형변환
 * 						ㄴ 자바 라이브러리 클래스 리턴 => Object
 * 	클래스는 크기 비교
 * 	--------------상속 관계 : 논리적 => 상속 내리는 클래스 > 상속 받는 클래스 
 * 	--------------포함 관계 : 포함하고 있는 클래스가 크다
 * 
 * 	상속
 * 		ㄴ 정의 : 이미 만들어진 클래스의 변수와 메소드를 받아서 새로운 클래스를 만들어서 사용
 * 							-----------------
 * 							ㄴ 예외) static/ 생성자 / 초기화 블록
 * 							ㄴ private은 상속은 가능 => 접근이 불가능
 * 								ㄴ getter / setter 
 * 		
 * 		=> 문법 
 * 		=> 형식
 * 			class Parent
 * 			{
 * 				int a= 10;
 * 				int b = 20;
 * 				public void aaa(){}
 * 			}
 * 			class Child extends Parent
 * 			{
 * 				int c = 30;
 * 				int d = 40;
 * 				public void bbb(){}
 * 				
 * 			}			class => class extends
 * 						interface => class implements
 * 
 * 			parent p = new Parent()
 * 				   p => a, b ,aaa()
 * 			Child c = new Child()
 * 				  c => a,b,aaa(),c,d,bbb()
 * 			Parent p2 = new Child()
 * 				   p2 => a, b, Child:aaa()
 * 			---------
 * 				Parent p = new Child()
 * 				--------  -------------
 * 							ㄴ Parent가 가지고 메소드 호출 => 메소드의 주소변경
 * 							ㄴ Child가 오버라이딩 메소드 호출
 * 				ㄴ Parent가 가지고 있는 변수
 * 			상속의 목적
 * 				ㄴ 코드 재사용
 * 				ㄴ 유지보수 효율성 => 기능을 미리 알고 있다 => 현재에 맞게 변경
 * 				ㄴ 소스가 간결하다
 * 				ㄴ 반복 제거
 * 					ㄴ 가독성 , 재사용, 수정 용이, 최적화
 * 
 * 		=> 특징
 * 			ㄴ 단일 상속만 가능
 * 				------------인터페이스는 다중 상속이 가능
 * 			ㄴ 모든 클래스는 Object클래스가 최상위 클래스다
 * 							ㄴ Object 상속을  받고 있다
 * 			ㄴ private은 직접 접근이 불가능 => getter/setter
 * 			ㄴ 상위 클래스는 공통적으로 가지고 있는 변수/메소드
 * 			ㄴ 하위 클래스는 메소드를 필요시에 변경해서 사용(오버라이딩)
 * 
 * 		=> 메소드 재정의(오버라이딩) => 프로그램에 맞게 구현
 * 			ㄴ 조건)
 * 				ㄴ 상속 =====> 익명의 클래스
 * 				ㄴ 메소드명이 동일
 * 				ㄴ 리턴형이 동일
 * 				ㄴ 매개변수가 동일
 * 				ㄴ 접근지정어 확장이 가능
 * 				--------------------
 * 				private < default < protected < public		
 * 				ㄴ 모든 메섣드는 public로 만든다
 * 				class A{
 * 					(public abstract)void display()
 * 				}
 * 				class B implements A{
 * 					void display(){ // 오류
 * 					}
 * 				}
 * 		=> 형변환
 * 			ㄴ 1. 자동형변환
 * 					ㄴ 클래스는 크기 결정 : 상속 / 포함
 * 			ㄴ 2. 강제 형변환
 * 				객체명 instanceof 클래스명
 * 			Object obj
 * 			String str
 * 			StringBuffer sb
 * 			
 * 			str instanceOf Object
 * 			sb instance Object
 * 
 * 			obj instanceOf String 
 * 			str instanceOf StringBuffer
 * 
 * 
 * 			1. 자동 형변환
 * 				class A
 * 				class B extends A
 * 
 * 				A > B
 * 			
 * 				A a = new A()
 * 				double
 * 				B a = new B()
 * 				int
 * 				A c = b;
 * 				
 * 				사용자 정의 데이터형 / 기본형
 * 				--------------- 메모리 크기 제작
 * 				12byte => 8byte , 4byte
 * 
 * 
 */
import java.util.*;
class Parent{
	int a =10;
	int b =20;
	//메소드는 주소 => aaa
	public void aaa() {
		System.out.println("Parent:aaa() Call ....");
	}
}
class Child extends Parent{
//	int a =10;
//	int b =20;
//	public void aaa() {
//		System.out.println("Parent:aaa() Call ....");
//	}
	//ㄴ 상속이 되어서 따로 추가할 필요가 없다
	int c =30;
	int d =40;
	public void bbb() {
		System.out.println("Child:bbb() Call ....");
	}
	
	
}


public class 정리_3 {

	public static void main(String[] args) {
		Parent p = new Parent(); // a,b, aaa()
		// 사용빈도가 없다
		Child c = new Child(); // a, b, aaa(), c, d, bbb()
		// 거의 대부분 사용
		Parent pp = new Child(); // a, b, aaa()
		// 관련된 클래스를 모아서 관리 => 추상클래스 / 인터페이스
		// 자동 형 변환
		// Parent => double Child => int
		// 변수는 Parent가 가지고 있는 변수 호출
		// 메소드는 Child가 가지고 있는 오버라이딩된 메소드 호출
//		p.aaa();
		Object obj = new Object();
		String str = "";
		StringBuffer sb = new StringBuffer();
		
		if(str instanceof Object)
			System.out.println("True");
		if(sb instanceof Object)
			System.out.println("True");
		if(obj instanceof Object)
			System.out.println("True");
		else
			System.out.println("True");
		
	}

}
