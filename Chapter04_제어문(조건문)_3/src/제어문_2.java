/*
 * 문자 1개 입력 => 대문자, 소문자, 숫자, 한글
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 1개 입력 :");
		String s = scan.next();
		char c= s.charAt(0);
		
		
		if(c >= 'A' && c<= 'Z') {
			System.out.println("대문자임");
		}
		else if(c >= 'a' && c <= 'z') {
			System.out.println("소문자임");

		}
		else if(c >= '0' && c <= '9') {
			System.out.println("숫자임");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
