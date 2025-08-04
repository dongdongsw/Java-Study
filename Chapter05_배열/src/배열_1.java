/*
 * 데이텅 관리 ==== 데이터 가공(사용자 요청) ======== 화면 출력 
 * => 변수			연산자					1) Application( 콘솔 / 윈도우) => 네트워크
 * => 배열			제어문					2) WebApplication(브라우저)(데이터베이스)
 * => 클래스									3) MobileApplication(XML, JSON)(Flutter/Dart
 * 
 * 
 * => 데이터 관리 / 재사용
 * 	=> 데이터를 묶어서 관리
 * 	------------------
 * 		같은 데이터형 / 관련된 데이터 => 배열
 * 		다른 데이터형 : 학생정보 / 맛집 정리 => 클래스
 * => 재사용 => 다른 클래스에서 사용
 * 	메소드 : 연산자 / 제어문
 * 	-----------------------------명령문을 어떻게 묶어서 사용
 * => 프로그램은 누가 관련된 것을 잘 묶는가?
 * ----------------------재사용
 * 배열, 클래스, 변수 => 메모리에 저장
 * 변수 = 스택
 * 클래스 / 배열 => 힙
 * ----------주소 참조 : 참조형 변수
 * 
 * 1) 배열 => 일차원 / 이차원 : 로직
 * 
 * 2) 배열 선언
 * 
 * 3) 배열 초기화
 * 
 * 4) 배열 사용 방법 => 인덱스 
 * 
 * 5) 데이터 저장 방법
 * 
 * 6) 배열 복사
 * 	ㄴ 주소 참조
 * 	ㄴ 새로운 배열 생성
 * 	ㄴ Call By Value / Call By Reference
 * 
 * 1. 배열의 특징
 * 	ㄴ 같은 데이터형을 연속적으로 메모리 저장
 * 		ㄴ 인덱스는 0번 부터 ~ 순차적으로 나열 => for을 처리
 * 	ㄴ 고정적이다 : 한번 선언 => 수정할 수 없다
 * 		ㄴ 데이터 삭제가 불가능
 * 	ㄴ 가변형 : 컬렉션
 * 
 * 2. 배치
 * 	int[] arr = { 1,2,3,4,5} <= 스택에 저장이 됨 (힙)
 * 
 * 배열 
 * 	=> 같은 데이터형끼리 묶는다 => 관련된 데이터를 묶어서
 * 	=> 예) 3명의 학생 => 성적 관리
 * 		국어, 영어, 수학, 총점, 평균, 학점, 등수
 * 
 * 
 */



public class 배열_1 {

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		
//		System.out.println(arr);
		int a = 10, b= 20, c=30, d=40, e = 50;
		
		int total = a + b + c + d + e;
		double avg= total/3.0;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("총합= " + total);
		System.out.println("평균= " + avg);
		System.out.println("============== 데이터를 묶어서 처리 =============");

		/*
		 * 배열
		 * int[] 배열명; => 권장
		 * int 배열명[] => c언어 파생
		 * 	ㄴ int 니까 4byte 메모리 공간을 5개 연속적으로 배치
		 * 
		 * 
		 */
		
		
		int[] arr = {a,b,c,d,e};
		System.out.println("배열 데이터 갯수 :" + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr ["+ i + arr[i]);
			
			
		}
	
	}

}
