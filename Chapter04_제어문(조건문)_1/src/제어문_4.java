
/*
 * 	문자 1개를 난수 발생 => 대문자 / 소문자
 * 
 */

import java.util.*;

public class 제어문_4 {

	public static void main(String[] args) {
		
		int change = (int)(Math.random()*2);
		
		char c = ' ';
		if(change == 0) {
			c = (char)((Math.random()*26) + 65);
			
		}
		else {
			c = (char)((Math.random()*26) + 97);
		
		}
		System.out.print("결과 값 : ");
		if(c >= 'A' && c <= 'Z') {
			System.out.println(c+"는 대문자입니다");
		}
		else {
			System.out.println(c+"는 소문자입니다");
				
		}
	}

}
