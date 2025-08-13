package com.sist.main;

/*
 * 	재사용법
 * 		ㄴ 1. 변경없이 재사용 => 포함 클래스 (has - a) 웹
 * 		ㄴ 2. 변경 후에 재사용 => 상속 (is - a)
 * 			ㄴ 1) 상속
 * 					ㄴ 기존의 클래스(이미 만들어지 클래스)의 모든 기능과 변수
 * 						받아서 새로운 기능 클래스를 만든다
 * 							----------- 확장
 * 					ㄴ 목적
 * 						ㄴ 코드 재사용(소스 간결하다)
 * 						ㄴ 신뢰성이 뛰어나다
 * 						ㄴ 유지보수가 용이하다
 * 
 * 					ㄴ 키워드 : extends
 * 					ㄴ 기능 변경이 가능하다 => 오버라이딩
 * 					ㄴ 단점 : 속도가 늦다
 * 								ㄴ 상속 내린 클래스 => 메모리 할당
 * 								ㄴ 상속 받은 클래스 => 메모리 할당
 * 								ㄴ 메모리가 비대
 * 					ㄴ 상속의 예외 조건
 * 						ㄴ 생성자
 * 						ㄴ static => 사용이 가능하게
 * 							ㄴ private 상속이 된다 => 접근이 불가능
 * 					ㄴ 가독성이 떨어진다
 * 					ㄴ 자신의 클래스 => this
 * 					ㄴ 상위 클래스 => super
 * 					ㄴ 자바는 단일 상속만 가능하다
 * 							--------- 다중 상속 가능 : 인터페이스
 * 
 * 					ㄴ 상속 내린 클래스 : 부모 클래스, 슈퍼 클래스, 베이스 클래스, 상위 클래스
 * 					ㄴ 상속 받은 클래스 : 자식 클래스, 서브 클래스, 파생 클래스, 하위 클래스 
 * 						class A{
 * 							int a, b, c;
 * 						}
 * 						class B extends A{
 * 			
 * 						}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */		
class Super{
	int age = 100;
	String name = "이순신";
	
	public Super() {
		age = 100;
		name = "이순신";
	}
	
	public void eat() {
		System.out.println("super : 먹는다");
	}
	public void run() {
		System.out.println("super : 달린다");
	}
	
}

class Sub extends Super{
	
	
//	public Sub() {
//		super();
//	}
	
	
//	public Sub() {
//		
//		super(); //=> 생략됨
//		age = 50;
//		name = "춘향이";
//		
//		
//	}
	public void eat() {
		System.out.println("Sub : 먹는다");
	}
	public void run() {
		System.out.println("Sub : 달린다");
	}
	
}

public class 재사용 {

	public static void main(String[] args) {
		/*
		 * 1. 변수 => 선언되는 클래스
		 * 		ㄴ Super ss => ss가 가지고 있는 변수
		 * 2. 메소드 => 생성자
		 * 		ㄴ Super ss = new Sub()
		 * 					-----------메소드
		 * 		  ----------변수
		 */
		
		
		Super s = new Super();
		s.age = 30;
		s.name = "홍길동";
		System.out.println("나이:" + s.age);
		System.out.println("이름:" + s.name);
		s.eat();
		s.run();
		
		System.out.println("=================================");
		Sub sub = new Sub();
		sub.age = 20;
		sub.name = "심청이";
		System.out.println("나이:"+ sub.age);
		System.out.println("이름:"+ sub.name);
		sub.eat();
		sub.run();
	
		System.out.println("=================================");
//		Super ss = new Super();
		Super ss = new Sub(); //인터페이스

		//크기 => 상속 내린 클래스 > 상속 받는 클래스
		
		System.out.println("나이:" + ss.age);
		System.out.println("이름:" + ss.name);		
		ss.run();
		ss.eat();
		
	}

}
