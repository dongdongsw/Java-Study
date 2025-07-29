/*
 * index 번호 찾기
 * 자바는 index 번호 0번 부터 시작
 * 오라클은 index 번호 1부터 시작
 * 
 * 
 * 
 */

import java.util.Scanner;

public class 제어문_4 {

	public static void main(String[] args) {
		String  msg = "ABCDEFGHPOLMNGBACTK";
		System.out.println("문자의 총갯수 :" + msg.length());
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 대문자 입력 :");
		String b = scan.next();
		int index = 0;
		for(int i = 0; i< msg.length(); i++) {
			
			char c = msg.charAt(i);
			if(c == b.charAt(0)) {
				
				index = i;
				
			}
		}
		System.out.println(b + "는 " + (index+1) + "번째 위치한다!!");

		
		
	}

}
