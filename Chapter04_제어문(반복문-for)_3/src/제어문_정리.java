/*
 * 	1. 조건문 
 * 		ㄴ if()
 * 		
 *    
 *  2. 다중 조건문 => 사용빈도가 낮다 => DECODE / CASE 때문에 
 * 		ㄴ if(){ } else{ }
 * 		ㄴ if(){ } else if{ } else{ }
 * 		ㄴ switch(){ case{ }  default{ } }
 * 
 * 	3. 반복문 
 * 		ㄴ for(;;)
 * 		ㄴ while()
 * 		ㄴ do{ } ~ while
 * 		
 * 		
 * 		
 */

import java.util.*;

public class 제어문_정리 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 :");
		int year = scan.nextInt();
		System.out.print("월 입력 :");
		int month = scan.nextInt();
		System.out.print("일 입력 :");
		int day = scan.nextInt();
		
		System.out.printf("😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️ %d년 %02d월 %d일 😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️",year, month, day);
		
//		System.out.print("일\t");
//		System.out.print("월\t");
//		System.out.print("화\t");
//		System.out.print("수\t");
//		System.out.print("목\t");
//		System.out.print("금\t");
//		System.out.print("토");
//		System.out.println();
		System.out.print("\n");

		String a = "일월화수목금토";
		
		
		for(int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			System.out.print(b+"\t");
		}
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		week = week -1;
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.print("\n");
		
		for(int i = 1; i<=lastday; i++) {
			if(i==1) {
				for(int j = 0; j < week; j++) {
					
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t",i);
			week++;
			if(week>6) {
				
				week = 0;
				System.out.println();
				
			}
		}
	}

}
