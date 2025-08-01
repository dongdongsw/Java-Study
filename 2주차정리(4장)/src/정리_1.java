/*
 * 
 * 자바 학습
 * 
 * ------------초급 과정--------------------
 * 
 * 	1단계 : 자바 기초 문법
 * 		ㄴ 변수 / 데이터형
 * 			ㄴ 변수 : 재사용 => 처리
 * 				ㄴ관련된 데이터 : 배열
 * 				ㄴ 문장(문제)
 * 				ㄴ 웹
 * 				ㄴ 이미지
 * 				---------
 * 				자바
 * 					ㄴ 데이터 저장 === 데이터 연산처리 == 프로그램 제어
 * 						ㄴ 데이터형
 * 							ㄴ 정수 : int, long
 * 							ㄴ 실수 : double
 * 							ㄴ 논리 : true / false : boolean
 * 							ㄴ 문자 : char(x)
 * 							ㄴ 문자열 : String
 * 						ㄴ 연산자
 * 							ㄴ딘항 : ++, --, !, ()
 * 									--------------형변환(클래스)
 * 							ㄴ이항 
 * 								ㄴ 산술 : +, -, *, /, %
 * 								ㄴ 비교 : == != < > >= <=
 * 								ㄴ 논리 : && ||
 * 								ㄴ 대입 : =, +=, -=, *=, /=
 * 							ㄴ삼항 : 조건? 값1 : 값2
 * 								ㄴ 요청 => 통계 / 합 ... 산술
 * 								ㄴ 비교 연산자 => 체크박스
 * 								ㄴ 논리 => 두개의 정보
 * 								ㄴ 삼항은 출력 / => if ~ else
 * 
 * 						ㄴ 같은 데이터형(배열)
 * 						ㄴ 다른 데이터형(클래스)
 * 							ㄴ메모리
 * 								ㄴ영구적인 저장장치
 * 									ㄴ파일 => 노출(보안 취약)
 * 										ㄴRDBMS => 오라클
 * 		ㄴ 연산자
 * 		ㄴ 제어문
 * 			ㄴ 조건문
 * 			ㄴ 반복문
 * 		ㄴ 배열
 * 
 * ------------중급 과정--------------------
 * 
 * 	2단계 : 메소드와 클래스 기초
 * 		ㄴ 메소드 정의와 호출
 * 		ㄴ 매개변수 / 리턴 값 => 라이브러리
 * 		ㄴ 클래스 선언 / 객체 생성
 * 		ㄴ 멤버변수 / 멤버 메소드
 * 		ㄴ 생성자 / this, super
 * 	
 * 	3단계 : 객체지향 프로그램 (OOP)
 * 		ㄴ 접근 제어어
 * 		ㄴ 상속 , 오버라이딩 / 오버로딩
 * 		ㄴ 추상 클래스 / 인터페이스
 * 		ㄴ 다형성(수정, 추가), 클래스 형변환
 * 		ㄴ static, final, abstract
 * 	
 * 	4단계 : 자바 활용 /실전
 * 		ㄴ 예외 처리
 * 		------------11장
 * 		ㄴ 라이브러리
 * 			ㄴ 컬렉션 프레임워크 => 한번에 묶어서 처리
 * 			ㄴ 자바 입출력 (파일, 네트워크, 메모리)
 * 			ㄴ 데이터베이스 연동
 * 
 * 	5단계 : 주제별 프로젝트 => 실무 연계
 * 		ㄴ Swing / javaFx
 * 		ㄴ Thread => 동기화
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1, b=2,c=3,d=4,e=5,f=6,k=8, m=10,n=20,o=30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		int[] arr = {1,2,3,4,5,6,8,10,20,30};
		for(int i= 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
			
		}
	}

}
