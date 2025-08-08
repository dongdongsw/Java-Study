/*
 * 	클래스
 * 		ㄴ 1. 데이터 클래스 > 관련된 변수를 모아서 관리
 * 			ㄴ 배열 대체
 * 			ㄴ ~Vo, ~DTO
 * 		ㄴ 2. 액션 클래스 > 기능을 모아서 관리
 * 						 ---- 메소드
 * 			ㄴ ~DAO(Data Access Object) : database에 접근하는 역할을 하는 객체	
 *				 ㄴ 오라클  
 * 			ㄴ ~Service :  	사용자의 요청을 받아 비즈니스 로직을 수행하는 것
 * 				ㄴ 브라우저
 * 			ㄴ ~Manager :
 * 				ㄴ 크롤링
 * 								
 * 		ㄴ 3. 혼합 클래스
 * 			ㄴ 변수 + 메소드
 * 			ㄴ ~Controller : 조립
 * 
 * 		데이터 관리 클래스 => 사용자 정의 데이터형
 * 						------------------
 * 						 데이터형을 제작
 * 		class : 필요한 데이터를 모아서 사용
 * 		
 * 		기본형 
 * 			int a= 10;
 * 			1. 메모리 할당 => 메모리 크기를 결정 => 저장
 * 			class 맛집{
 * 			--
 * 			------
 * 				-------
 * 			}
 * 
 * 		맛집 a = new 맛집();
 * 					ㄴ 생성자 => 메모리에 초기화 값을 등록, 생략이 가능(컴파일러에 의해 자동생성)
 * 				ㄴ 메모리를 맛집 크기에 만들어서 저장
 * 		ㄴ 변수 객체
 * 
 * 	****
 * 
 * 		맛집 a1 = new 맛집();  == int a = 10;
 * 
 * 
 * 	class ClassName{
 * 		1. 기본형
 * 		   번호 / 랭크 / 평점 ...
 * 		2. 클래스 => String 이름
 * 		3. 배열 => 출연, 이미지 : 캡슐화 (데이터 보호)
 * ---------------------------
 * 		ㄴ 메소드 : 기능 => 상속 , 수정(오버라이딩) , 추가 (오버로딩)
 * 								------------------------
 * 								ㄴ 다형성
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

class Student {
	
	int hakbun;
	String name;
	int kor;
	int eng;
	int math;
}



public class 클래스_1 {

	static void print(String msg) {
		System.out.print(msg);
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student hong = new Student();
		System.out.println("hong =" + hong);

		print("학번 = ");
		hong.hakbun = scan.nextInt();
		
		print("이름 = ");
		hong.name = scan.next();
		
		print("국어 점수 = ");
		hong.kor = scan.nextInt();
		
		print("영어 점수 = ");
		hong.eng = scan.nextInt();
		
		print("수학 점수 = ");
		hong.math = scan.nextInt();
		
		
//		hong.hakbun = 1;
//		hong.name = "홍길동";
//		hong.kor = 90;
//		hong.eng = 80;
//		hong.math = 70;
		
		System.out.println("학번 = " + hong.hakbun);
		System.out.println("이름 = " + hong.name);
		System.out.println("국어 = " + hong.kor);
		System.out.println("영어 = " + hong.eng);
		System.out.println("수학 = " + hong.math);
		
		
		
		
	}

}
