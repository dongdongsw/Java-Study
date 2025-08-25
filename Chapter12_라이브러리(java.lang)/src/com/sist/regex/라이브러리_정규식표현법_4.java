package com.sist.regex;

import java.util.regex.Pattern;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 라이브러리_정규식표현법_4 {

	public static void main(String[] args) {

		String email = "test@example.com";
		
		String regex = "^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
		
		boolean result = Pattern.matches(regex, email);
		
		if(result) {
			
			System.out.println("이메일 형식이 맞습니다.");
		}
		else {
			
			System.out.println("이메일 형식이 맞지 않습니다.");
		}
		
		
	}

}



















