package com.sist.main;
/*	7장 => 캡슐화 / 상속 / 다형성 / this / super / this() / super()
 * 
 * 	키워드
 * 		ㄴ this : 자신의 객체
 * 			class A => 설계 
 * 			{
 * 				this를 사용하는 위치
 * 				ㄴ 생성자
 * 				ㄴ 인스턴스 메소드에서만 사용이 가능
 * 				ㄴ static 메소드에서는 사용할 수 없다
 * 				ㄴ 클래스 자신이 가지고 있는 것
 * 				  -----------------------
 * 					인스턴스 변수 / 인스턴스 메소드 / 생성자
 * 				public void aaa(A this)
 * 				{
 * 					this.				------------생략
 * 					-------- 지역변수 / 매개변수가 인스턴스 변수가 동일 할떄 구분
 * 				}
 * 				public A(A this)
 * 				{		--------생략
 * 
 * 				}
 * 				int a;
 * 				public void bbb(int aa)
 * 				{
 * 					a = aa
// * 					this.a =  a
 * 				}
 * 				ㄴ 지역변수 우선 순위
 * 					-------------- 지역변수가 없는 경우 인스턴스 변수
 * 									정적 변수 찾기
 * 			}
 * 			A a = new A() => 사용법
 * 			------------
 * 			JVM
 * 			-----1) this 저장
 * 					this = a
 * 			ㄴ 웹 : this가 아니고 page
 * 			ㄴ 구분자 : 없는 경우는 생략이 된 것이다
 * 		ㄴ this() : 자신의 생성자를 호출할 경우에 사용
 * 		ㄴ super : 상위
 * 		ㄴ super() : 상위 클래스의 생성자 호출
 * 		  --------상속 받는 경우에는 무조건 호출 => 없는 경우에도 자동 추가
 * 
 * 		ㄴ 접근 지정어 (사용자 정의가 없다)
 * 			ㄴ public : 모든 클래스에 접근이 가능
 * 			ㄴ protected : 같은 패키지 + 상속 내린 클래스 (패키지가 다른경우)
 * 			ㄴ default : 같은 패키지
 * 			ㄴ private : 같은 클래스
 * 			
 * 			ㄴ 다른 클래스와 연결
 * 				ㄴ 1. 클래스
 * 				ㄴ 2. 메소드
 * 				ㄴ 3. 생성자	
 * 				--------------------public
 * 				ㄴ 4. 멤버변수(인스턴스 변수) => private : 데이터보호
 * 			ㄴ final : 상수
 * 			
 * 			static , 접근지정어, final
 * 			----------------------- 인스턴스 변수, 정적변수
 * 			지역변수는 final만 사용이 가능
 * 			------------------------------------------------------------------
 * 	
 */



//class A{
//	int a;
//	public void display(int a) {
//		a=a;
//	}
//	
//}
/*
 * 	---상속 내린 클래스 = 상속 받은 클래스
 * 		ㄴ----------------사용
 * 
 * 		class A{
 * 			int a= 100;
 * 			String name = "홍길동"
 * 		}
 * 		class B extends A{
 * 			int b = 200;
 * 			//int a =100;
 * 			//String name = "홍길동"
 * 		}
 * 
 */
class A{
	int a =100;
	public A(String name,int a) { //얘는 자동으로 실행됨 (암묵적으로)
		System.out.println("상위 클래스 생성자 호출!!");	//이게 먼저 호출됨
	}
//	public A(String name, int a) { //얘는 자동으로 실행됨 (암묵적으로)
//		System.out.println("상위 클래스 생성자 호출!!");	//이게 먼저 호출됨
//	}
}

class B extends A{
//	int a =200; //이걸 주석하면 this.a는 100이 됨 // 변수 오버라이딩
	public B() {
		super("홍길동",10);
		System.out.println("this.a =" + this.a);
		System.out.println("super.a =" + super.a);
	}
}

public class 정리_2 {

	public static void main(String[] args) {
//		A aa = new A();
//		aa.display(100);
//		System.out.println(aa.a);
		B b = new B();//부모 먼저 실행 =>  자식
		
		
		
	}

}
