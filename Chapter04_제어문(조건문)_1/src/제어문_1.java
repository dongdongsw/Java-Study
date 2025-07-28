
/*
 * 		프로그램 : 순차적 
 * 				 위에서 아래 => 한줄씩 번역
 * 
 * 		프로그램 종류 
 * 			= 평문 : 일반 명령문만 수행 => HTML /CSS
 * 					=> 문법사항 (변수 선언, 연산처리 ..)
 * 			= 조건문 : 필요시에만 명령문을 수행
 * 					ㄴ 상황에 따라서 다른 기능 수행
 * 						ㄴ 검색(사이트)
 * 						ㄴ 상세보기
 * 						ㄴ 로그인 처리 / 아이디 중복 / 아이디 찾기 / 비밀번호 찾기
 * 			1) 단일 조건문 
 * 				ㄴ 독립적 조건문 하나하나 검색 => 속도가 늦다
 * 				ㄴ 중복적으로 수행
 * 					ㄴ1 ~ 100=> 3의 배수, 5의 배수, 7 의 배수
 * 				ㄴ 문법 / 형식
 * 					ㄴ 형식 : 자바에서 지원하는 모든 제어문은 바로 밑에 있는 문장만 제어(여러개의 문장을 제어 할때 {})
 * 					ㄴ 가독성 / 수정 편리 => {}
 * 				ㄴ제어문에 특별한 경우가 아니면 ;을 사용하지 않는다
 * 			
 * 				
 * 			2) 선택 조건문 
 * 				ㄴ 조건이 true / false
 * 				ㄴ 웹에서 사용빈도가 많다
 * 			3) 다중 조건문 => 메뉴
 * 				ㄴ 한개의 문장만 수행 => 조건에 맞는 if만 찾는다
 * 				ㄴ 메뉴 제작
 * 			4) 중첩 조건문
 * 				ㄴ 112 page
 * 		
 * 		실행 순서 => 형식, 문법, 실행
 * 			if => 필요하면 명령문 수행, 필요없는 경우에는 건너뛴다
 * 				  필요싣마다 다르게한다
 * 
 * 		string = equals / contatins / startsWith / endsWidth => 결과 값은 true / false
 * 		<button> / <select>
 * 
 * 
 */

// 예제 최대값 / 최솟값 => 정수를 3개 입력 받아서
import java.util.*;
public class 제어문_1 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("3개의 정수를 입력하시오 :");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
		
		int a = (int)(Math.random()*100) + 1;
		int b = (int)(Math.random()*100) + 1;
		int c = (int)(Math.random()*100) + 1;
		
		int max = a;
		int min = a;
		
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		System.out.println("a = " +a + "\n" + "b = " +b + "\n" + "c = " +c);
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
