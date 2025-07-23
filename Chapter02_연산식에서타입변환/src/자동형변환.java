
/*
 * 		1. 연산자 (목표) => 단항연산자 / 이항연산자 (산술연산자)
 * 			1) 기본 : 변수 / 연산 / 제어
 * 			2) 데이터를 묶어서 사용
 * 				ㄴ 같은 데이터 : 배열
 * 				ㄴ 다른 데이터 : 객체
 * 			3)관련된 명령문 : 기능
 * 				게시판 => 목록 출력 / 글쓰기 / 상세보기 / 수정 / 삭제
 * 				=> 기능 (메소드)
 * 				=> 재사용이 가능 : 최종 목적임
 * 				=> 기능 추가 => 답변 / 수정 => 목록 (이미지)
 * 		
 * 		2025-07-22 정리
 * 		--------------
 * 		1.  자바 실행 과정
 * 			1) 클래스명과 파일 저장명이 동일해야 함(대소문자 구분)
 * 				ㄴclass MainClass.java != class mainClass.java
 * 			2) EditPlus / 울투라Edit
 * 			3) 자바 파일 --(javac(컴파일))--> 클래스 파일 --(java(인터프리터))--> 실행
 * 				ㄴ 컴파일 : 컴퓨터 언어로 변경(문법)
 * 				ㄴ 인터프리터 : 실행시 입력값
 * 			
 * 		변수 : 한개의 데이터만 저장하는 메모리(주소값) 공간의 이름
 * 			변수를 사용(메모리 크기(데이터형 / 자료형))
 * 
 * 		정수
 * 			byte (-128 ~ 127) => 8bit => 1byte
 * 			int (-21억 4천 7백 ~ 21억 4천 7백) => 32bit => 4byte
 * 			====기본 : 컴퓨터는 모든 정수를 int로 인식
 * 			long => 64bit => 8byte
 * 
 * 		실수 
 * 			double => 8byte => 소수점 15자리
 * 
 * 		문자
 * 			문자 한개만 저장 => 0~65535 (각국의 언어사용이 가능)
 * 
 * 		논리
 * 			제어문(조건문 => 표현식 ' ') / 연산자 (비교 연산자, 부정연산자, 논리 연산자)
 * 			
 * 		문자열
 * 			String : 일반 데이터형 / 참조 데이터형
 * 			------ 기능
 * 		---------------------------------------------------------------------
 * 		변수 선언 : 변수는 반드시 초기값을 첨부
 * 		--- 변경이 가능, 상수 : 변경이 불가능
 * 			데이터형 변수, final(상수) 데이터형 변수
 * 				
 * 		1. 선언
 * 		   값 저장
 * 		   데이터형 변수
 * 		   변수 = 값
 * 
 * 		2. 선언과 동시에 값을 부여
 * 			데이터형 변수명 = 값(리터럴)
 * 			int a = 10
 * 
 * 		----------------------------------------------------------------------
 * 		정수 표현법
 * 			=> 10, 20 ....(10진법)
 * 			=> 0b11100, 0B => (2진법)
 * 			=> 0123 => 8진법
 * 			=> 0x, 0x => 16진법
 * 		----------------------------------------------------------------------
 * 		형변환
 * 			자동형변환
 * 				= 변수에 값대입
 * 					*int a = 'A'
 * 							---char => int(65)
 * 					byte < char < int < long < double
 * 					
 * 					*char c = 65
 * 							---int => char ('A')
 * 	
 * 					*double d = 10
 * 								---int => char ('A')
 * 
 * 					*int a =d; => 오류
 * 					----
 * 					크거나 같다
 * 					
 * 				= 연산처리 (데이터형이 동일 => 연산)
 * 					=> 데이터형이 동일하지 않을 때는 큰 데이터형으로 변경후에 처리 
 * 
 * 						int + int = int
 * 						int + long = long
 * 						double + int + long + char = double (double이 가장 크기 때문에)
 * 
 * 						char + char = int 
 * 						byte + byte = int
 * 						char + byte = int
 * 						int 이하 데이터 ( byte ,char, short)
 * 						
 * 						결과값 int => int / long / float / double
 * 						결과값 long => long / float / double
 * 						결과값 float => float / double
 * 
 * 			강제형변환 = 많이 나온다 (연산처리 => 객체)
 * 						인간 = 남자 + 여자
 * 						인간 a = 남자 => 정상작동(o) 인간이 남자보다 더 큰 값이다
 * 						남자 a = 인간 => 비정상작동(x) 남자가 인간보다 더 작은 값이기에 옳지 않다
 * 							ㄴ올바르게 하는 방법은 강제형변환 => 남자 a = (남자)인간
 * 
 * 						큰 데이터형 변경 => UpCastion
 * 						작은 데이터형 변경 => DownCasting
 * 			
 * 						boolean은 변환이 안된다
 * 					
 * 						String : 모든 데이터형을 문자열로 변환
 * 						int => String => int
 * 							String.valueof(10) => "10" //문자열이 됨
 * 							Integer.parseInt("10") => 10 //숫자가 됨
 * 						
 * 						long => String => long
 * 							String.valueof(10L) => "10" //문자열이 됨
 * 								Long.parseLong("10") => 10L
 * 
 * 						double => String => double
 *							String.valueof(10.5) => "10.5" //문자열이 됨 
 * 								Double.parseDouble("10.5") => 10.5
 * 
 * 						boolean => String => boolean
 * 							String.valueof(true) => "true" //문자열이 됨
 * 								Boolean.parseBoolean("true") => true
 * 
 * 			윈도우 개발 / 웹 개발 => 데이터는 String
 * 			----------------------------------
 * 			<input type = " text">
 * 			JTextField
 * 		--------------------------------------------------------------
 * 			입출력 => 69페이지
 * 			System.out.println() : 가장 많이 사용
 * 				ㄴ웹 => 입력값 확인, 오류 메시지 출력
 * 				ㄴ사용을 하면 줄바꿈
 * 			System.out.print() : 문법 사항 => 줄바꿈이 안된다
 * 				ㄴ가로로 출력 => 한명에 대한 데이터 출력
 * 			System.out.printf() : 출력 서식을 만들어서 출력
 * 				ㄴc언어에서 주로 사용
 * 				ㄴprintf("서식", 값...)
 * 					ㄴ 서식 => 정수값 : %d (정렬 : 왼쪽 %-3d => 3은 3자리의 임의의 공간을 만들고 앞에 숫자를 넣어라 / 
 * 										오른쪽 %3d => 3은 3자리의 임의의 공간을 만들고 뒤에 숫자를 넣어라)
 * 
 * 							  실수값 : %f, %2f, %3f...
 * 							  
 * 							  문자 : %c
 * 							  문자열 : %s
 * 
 * 							  특수문자
 * 								\n : 줄바꿈
 * 								\t : 일정간격
 * 								-----------
 * 								\" : " 출력 => html 전송시에 주로 사용
 * 								\\ : \ 출력 => 경로명
 * 			-------------------
 * 			Scanner : 클래스화 => 키보드 입력값 (사용자 정의 데이터형)
 * 					Scanner scan = new Scanner(System.in);
 * 						    ----   ---
 * 							변수	   저장
 * 			
 * 			사용자 정의 데이터형
 * 			1. 정수 => scan.nextInt()
 * 			2. 실수 => scan.nextDouble()
 * 			3. 논리 => scan.nextBoolean()
 * 			4. 문자열 => scan.next()
 * 
 * 			입력 : 공백 => 메모리에 저장 => 엔터
 * 			주석 : ctrl + / 그 줄 주석처리
 * 				ㄴ ctrl + shift + / : 블록을 주석으로 처리 ("/* * /")
/*				ㄴ ctrl + shift + \ : 블록 주석을 해제
 * 				
 *
 */


/*
 * class Scanner {
 * 
 * }
 * 
 * 
 * => include <stdio.h>  - c언어
 * => using   - c#
 * => import ~~~  - 파이썬
 * 
 */


import java.util.Scanner;

public class 자동형변환 {

	public static void main(String[] args) {
//-----------------------------형변환--------------------------------------------------------------------------
//		자동형변환 a = new 자동형변환();
//		자동형변환 b = new 자동형변환();
	
		
//		double d = 10; //10.0
//		System.out.println(d);
//		int a = (int)d; //강제형 변환
//		System.out.println(a);
//		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte b3 = b1 + b2; //오류 발생 => int / long/ double/ float 대체해야함
//		
//		System.out.printf("%d \n%-5d\n %5d\n",10,20,30);
//		System.out.printf("%f\n",10/3.0);
//		System.out.printf("%.2f\n",10/3.0);
//		System.out.printf("%.1f\n",10/3.0);
//		System.out.printf("%02d\n",12);
//		System.out.printf("%03d\n",12);
//		System.out.printf("%c",'A');
//		System.out.printf("%s","홍길동");
//		System.out.println(10 + " " + 20 + " " + 30 + " ");
		
//-----------------------------입출력--------------------------------------------------------------------------
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("국어 점수 :" );
//		int kor = scan.nextInt();
//		System.out.print("영어 점수 :" );
//		int eng = scan.nextInt();
//		System.out.print("수학 점수 :" );
//		int math = scan.nextInt();
//		System.out.printf("국어 영어 수학입력(90 90 90):");
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		System.out.printf("%3d%3d%3d",kor,eng,math);
		System.out.print("문자열 입력:");
//		String msg = scan.nextLine(); //공백 포함
//		System.out.println(msg);
		System.out.print("true/false입력 : ");
		boolean b = scan.nextBoolean();
		System.out.println(b);
		System.out.print("실수 입력 : ");
		double d = scan.nextDouble();
		System.out.println(d);
		
	}

}
