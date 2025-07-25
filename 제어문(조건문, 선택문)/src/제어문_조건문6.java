/*
 * 	1. 알파벳을 입력을 받아서 (단일 조건문) => 연산자
 * 		ㄴ대문자
 * 		ㄴ소문자
 * 		ㄴ알파벳이 아님
 * 
 * 
 */

import java.util.*;
public class 제어문_조건문6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳을 입력하시오 : ");

		String a = scan.next();
		
		char c = a.charAt(0);
		

		if(c >= 'A' && c <= 'Z') {
				System.out.println("대문자");
				
		}
		if(c >= 'a' && c <= 'z') {
				System.out.println("소문자");
		}
		
		if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
			System.out.println("알파벳이 아님");
		}
		
		
	}

}
