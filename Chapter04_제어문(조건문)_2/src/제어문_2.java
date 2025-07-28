/*
 * 
 * 		정수 2개 입력
 * 		연산자 입력
 * 		+ - * 나누기 => 
 * 
 */

import java.util.*;
public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 2개 입력하시오 :");

		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.print("연산자를 고르시오 (+, -, /, *) :");

		String c = scan.next();
		char op = c.charAt(0);
		
		System.out.println("===========입력 값============");
		System.out.println("첫 번쨰 입력 값 :" + a);
		System.out.println("두 번쨰 입력 값 :" + b);
		System.out.println("연산자 :" + op);

		
		
		if(op == '+' ) {
			System.out.printf("%d + %d = %d",a, b, a + b  );
		}
		else if(op == '-' ) {
			System.out.printf("%d + %d = %d",a, b, a - b  );
		}
		else if(op == '*' ) {
			System.out.printf("%d + %d = %d",a, b, a * b  );
		}
		else if(op == '/' ) {
			System.out.printf("%d + %d = %d",a, b, a / b  );
		}
		else {
			System.out.println("정상적인 연산자나 숫자가 입력되지 않았습니다");

		}

	}

}
