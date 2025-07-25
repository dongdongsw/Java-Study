//사용자 정수 2 => 연산자 1
/*
 * 
 * 
 */

import java.util.Scanner;
import java.util.*;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = scan.nextInt();
		
		System.out.print("첫번째 정수 입력 : ");
		int b = scan.nextInt();
		
		System.out.print("연산자 입력 : ");
		String c = scan.next();
		char op = c.charAt(0);
		
		if(op == '+') {
			System.out.printf("%d + %d = %d",a,b,a+b);

		}
		if(op == '-') {
			System.out.printf("%d - %d = %d",a,b,a-b);
			
		}
		if(op == '*') {
			System.out.printf("%d * %d = %d",a,b,a*b);
			
		}
		if(op == '/') {
			
			if(b == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			if(b != 0)
			System.out.printf("%d / %d = %d",a,b,a/b);
			
			
		}
		if(op == '%') {
			System.out.printf("%d % %d = %d",a,b,a%b);
			
		}
		
		
	}

}
