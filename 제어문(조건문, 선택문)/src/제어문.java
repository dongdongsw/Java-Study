
/*
 * 		자바 지원하는 제어문 => 제어문을 사용하는 이유
 * 							ㄴ프로그램 순차적 : 위에서 아래로 이동하면서 실행
 * 		순차문
 * 			= 문법		
 * 
 * 
 * 		조건문
 * 			= 단일 조건문
 * 				ㄴif(조건문) => 조건문 : 비교 연산자, 논리연산자, 부정연산자
 * 					{
 * 						실행문장
 * 					}
 * 
 * 			= 선택 조건문
 * 				ㄴif(조건문) => 조건문 : 비교 연산자, 논리연산자, 부정연산자
 * 					{
 * 						실행문장
 * 					}
 * 				 else{
 * 						if 외
 * 					}
 * 
 * 			= 다중 조건문 : 조건에 맞는 문장만 수행 => 1개의 조건만 수행
 * 			  
 * 		선택문  : switch ~ case
 * 
 * 		반복문
 * 			while : 반복횟수가 지정이 안된 경우
 * 					ㄴ네트워크 / 데이터 베이스
 * 			do~while : 반드시 한번 이상 수행 => 버린다
 * 			for : 반복 횟수가 지정된 경우
 * 					=> 화면 출력
 * 		반복제어문 : break : 종료
 * 
 * 		
 * 
 */

import java.util.Scanner;
public class 제어문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num + " = 짝수다");
				
		}
		if(num%2 == 1){
			System.out.println(num + " = 홀수다");
			
		}
	}

}
