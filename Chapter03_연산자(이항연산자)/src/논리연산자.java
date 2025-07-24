
/*
 * 		우선순위 => &&, ||
 * 		
 * 		
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;


public class 논리연산자 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		
//		char c = str.charAt(0);
//		
//		if(c >= 'A' && c <= 'Z') {
//			System.out.println("대문자");
//	
//		}
//		else if(c >= 'a' && c <= 'z') {
//			System.out.println("소문자");
//	
//		}
//		else {
//			System.out.println("알파벳이 아닌 듯");
//			
		
		//효율적 연산
		// && => (조건) && (조건)
		//		앞 조건이 false가 되면 뒤의 조건은 확인조차 안한다
		
		
		//윤년
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		String result = (year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0) ? "운년입니다" : "윤년이 아닙니다";
		System.out.print(result);

		
		
		
		
		
		
		
	}

}
