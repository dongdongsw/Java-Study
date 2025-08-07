/*
 * 달력 => 메소드 => 전역변수 => 요일 (1일자) 
 * 
 * 1. 입력
 * 2. 1년도 1월 1일 ~ 입력달의 1일 => 총날수
 * ------------------------------------------세분화
 * 3. 총 날수를 7로 나눈 나머지 ==> 요일
 * 4. 요일 ==> 해당 마지막날까지 출력
 *  => 메소드 : 기능 별 분리 / 재사용
 *  	ㄴ 윤년 여부
 * =====================================
 * 1. 반복 구간 => 메소드 : 공통모듈
 * 2. 기능별 분리
 * 3. 순차적으로 메소드 호출
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class 메소드_2 {

	static Scanner scan() {
		return new Scanner(System.in);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = 메소드_2.scan();
		
		// 년 월
		System.out.print("년도 입력 :");
		int year = scan.nextInt();
		System.out.print("월 입력 :");
		int month = scan.nextInt();
		
		
		//1. 전년도까지 총날수
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// 2. 전달까지 총날수
		int[] lastday = {
				31,28,31,30,31,30
				,31,31,30,31,30,31
		};
		
		if((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;	
		}
		
		for(int i = 0; i<month-1; i++ ) {
			total += lastday[i];
		}
		
		//+1 => 각달의 1일차 확인
		total++;
		
		//요일 구하기
		int week = total%7;
		
		//달력 출력
		String[] strWeek = {
			"일", "월", "화", "수", "목", "금", "토"	
		};
		System.out.printf("%d년도 %d월\n",year,month);
		
		for(String s : strWeek) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
		for(int i = 1; i <= lastday[month-1]; i++) {
			
			if(i==1) {
				
				for(int j = 0; j < week; j++) {

				System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6) {
				week = 0;
				System.out.println();
			}
		}
		
		
		
		
	}

}
