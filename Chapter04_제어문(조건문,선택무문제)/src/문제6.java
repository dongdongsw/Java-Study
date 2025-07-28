//임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = (int)((Math.random()*2)+ 1);
		char c = ' ';
		
		if(a == 1) {
			c = (char)((Math.random()*26)+65);
		}
		else{
			c = (char)((Math.random()*26)+97);
		}
		if(c >= 'A' && c <= 'Z') {
			System.out.println(c + "는 대문자이다");
		}
		else {
			System.out.println(c + "는 소문자이다");

		}
		
		
		
	}

}
