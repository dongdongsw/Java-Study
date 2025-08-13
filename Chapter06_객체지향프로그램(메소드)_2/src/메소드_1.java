/*
 * 	1. 메소드
 * 		ㄴ 특정 작업(기능)을 수행하는 명령문의 집합(관련된 명령문만 모아서 관리)
 * 		ㄴ	1) 재사용 => 변경이 가능 
 * 		ㄴ 	2) 다른 클래스와 통신
 * 			ㄴ 요청 메소드, 응답 메소드
 * 			ㄴ 요청값 요청, 데이터 전송
 * 		ㄴ	3) 유지보수가 용이하다
 * 		ㄴ 	4) 프로그램을 구조화(기능별 분리가 가능)
 * 			ㄴ 한가지 기능만 수행
 * 			ㄴ 메소드
 * 				ㄴ 사용자 정의 메소드
 * 				ㄴ 라이브러리 메소드 => 암기
 * 			ㄴ 메소드는 독립적으로 사용이 불가능 => 클래스안에 존재
 * 		ㄴ 형식
 * 			ㄴ [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 * 				{
 * 					return 결과 값;
 * 				}
 * 					ㄴ 결과 값이 여러개 있는 경우 : 데이터를 묶어서 전송
 * 												------------ 배열 / 클래스
 * 
 * 			접근 지정어 : private, default, protected, public
 * 				ㄴ	private : 자신의 클래스 내부에서만 사용이 가능
 * 						ㄴ 데이터 보호 : 멤버변수
 * 						ㄴ 변수 => 기본형 / 참조형
 * 								ㄴ 메모리 주소를 저장하고 있다
 * 								ㄴ 배열, 클래스
 * 						ㄴ 모든 변수는 private => 데이터를 보호한다(x)
 * 						class Win extends JFrame
 * 						{
 * 							JButton b = new JButton() => 멤버변수
 * 							------------------------
 * 							ㄴ public	
 * 
 * 
 * 						}
 * 	
 * 				ㄴ default : 같은 패키지 안에서 접근이 가능
 * 
 * 				ㄴ protected : 같은 패키지, 상속과정이 있는 경우(패키지가 다른)
 * 					-----------------------------com.sist.super
 * 
 * 					class Super
 * 					{
 * 						private 1 2 3  
 * 					}
 * 				
 * 					----------------com.sist.sub
 * 
 * 					class  Sub extends Super
 * 					{
 * 						//~~~ => 상속은 가능 => 접근이 불가능
 * 						// => private  => protected
 * 						실무에서는 private를 많이 사용함
 * 					}
 * 
 * 					----------
 * 					객체지향 프로그램 : 특성 (캡슐화, 상속, 추상화, 수정, 추가)
 * 						ㄴ 권장사항 => OOP에 접근하지 않아도 된다
 * 				
 * 				ㄴ public : 모든 클래스에서 접근이 가능(패키지와 관련 없다)
 * 				ㄴ 데이터를 저장하는 일반 변수 : private (웹)
 * 				ㄴ 메소드 / 클래스 / 인터페이스 : => 연결 : public
 * 					ㄴ 메소드 : public
 * 					ㄴ 인터페이스 : 모든 변수가 public
 * 						ㄴ 선언되는 상수
 * 				
 * 				ㄴ 패키지 
 * 					ㄴ 클래스나 인터페이스를 그룹화한 단위
 * 					ㄴ 관련된 클래스를 모아둔 폴더
 * 					ㄴ 접근 지정어 확인
 * 
 * 				ㄴ 메소드의 종류
 * 					ㄴ 인스턴스 메소드(92%) 
 * 							ㄴ 저장되는 시점 : new => 따라 저장이 된다
 * 								ㄴ 객체명.메소드()
 * 					ㄴ 정적 메소드(1%) => 공통 사용 => 한글 변환
 * 								ㄴ 이미지 축소 / 확대
 * 								ㄴ 저장되는 시점 : 컴파일시에 저장
 * 									ㄴ 클래스명.메소드명()
 * 					ㄴ 추상 메소드	=> 여러개 클래스가 공통 기능
 * 							ㄴ 추상 클래스 / 인터페이스
 * 					ㄴ 종단 메소드 => (0.000000000000000000001%) final 사용빈도가 거의 없다
 * 
 * 					class A{
 * 						int age;
 * 						String name;
 * 						public void eat(){}
 * 						public void run(){}
 * 					}
 * 
 * 					Human hong = new Human()
 * 
 * 					------hong------
 * 						0X100				0X100	
 * 					----------------	------age------
 * 												0	=> hong.age
 * 										------name-----
 * 											  null => homg.name
 * 										---------------
 * 											  eat() => hong.eat()
 * 										---------------
 * 											  run() => hong.run()
 * 										--------------- OOP
 * 											SM/SI
 * 					--------------------------------------
 * 					객체ㅔ => 변수(클래스 / 배열) + 메소드 => 관리
 * 
 * 
 * 
 * 
 * 
 * 
 */
//interface A{
//	int a = 10; //public static final
//}
class Calc{
	int num1,num2;
	char op;
	
	public void add() {
		
		System.out.println(num1 + num2);
	}
	public void minus() {
		
		System.out.println(num1 - num2);
	}
	public void gop() {
		
		System.out.println(num1 * num2);
	}
	public void div() {
	
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없다");	
		}
		else
			System.out.println(num1 / num2);
}
}


public class 메소드_1 {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.num1 = 10;
		c.num2 = 5;
		c.add();
		c.minus();
		c.gop();
		c.div();
	}

}
