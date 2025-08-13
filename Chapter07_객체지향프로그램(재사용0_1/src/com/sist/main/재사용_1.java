package com.sist.main;
/*
 * 	상속 
 * 		ㄴ 재사용 기법
 * 		ㄴ 코드를 간결하게
 * 		ㄴ 신뢰성이 뛰어나다 (검증된 클래스를 이용)
 * 		ㄴ 한개의 클래스만 상속 -> 단일 상속
 * 		ㄴ 기능을 변경해서 사용이 가능(오버라이딩)
 * 		ㄴ 라이브러리 상속이 많다
 * 			ㄴ결합성이 높아진다
 * 				ㄴ 클래스를 수정 => 다른 클래스에 영향
 * 				ㄴ 개발에 제약이 많다
 * 					ㄴ 메소드가 동일
 * 			ㄴ 메모리가 비대 => 메모리 누수 현상
 * 			ㄴ 상속내리는 클래스의 모든 내용을 파악
 * 
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
class A{
	
	public void aaa(){
		System.out.println("aaa() Call");
	}
	public void bbb(){
		System.out.println("bbb() Call");
	}
}
class B extends  A{
	
	A a = new A() { //오버라이딩
	
	public void aaa(){
		System.out.println("B : aaa() Call");
	}
	public void bbb(){
		System.out.println("B : bbb() Call");
	}
	public void ccc(){
		System.out.println("B : ccc() Call");
	}
	};
}

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B(); // aaa, bbb만 접근 가능
		a.aaa();
		a.bbb();
//		a.ccc(); // 오류 : ccc에 접근 불가능
		
//		B b = new A(); //불가능
//		B b = new B(); //가능
//		b.aaa();
//		b.bbb();
//		b.ccc();
	}

}
