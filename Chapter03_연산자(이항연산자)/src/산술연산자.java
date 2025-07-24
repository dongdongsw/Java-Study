
/*
 * 산술연산자
 * 	=> 자동형변환
 * 		1) 큰 데이터형으로 변경 후 연산
 * 			ㄴ 10 + 10.5 = 20.5
 * 			ㄴ int + char => int 변환
 * 			ㄴ double + char = double 변환
 * 
 * 		2) int 이하 데이터형 (byte, char, short)
 * 			ㄴ연산시에 결과 값 => int
 * 			ㄴchar + char = int
 * 			ㄴshort + byte = int
 * 			ㄴbyte + byte = int
 * 
 * 		3) +,-보다 *, /, %이 우선
 * 			3 + 5 * 2 = 13
 * 
 * 	+ : 덧셈, 문자열 결합(String)
 * 		ㄴ산술 규칙
 * 		ㄴ7 + "7" + 7 = "777"
 * 		ㄴ7 + 7 + "7" + 7 + 7 ==> "14777"
 * 	
 *  - : 뺄셈 
 * 	
 * 	* : 곱하기
 * 		ㄴ 7 + "7" *10 => 오류
 * 	/ : 나누기
 * 		1) 정수 / 정수 = 정수
 * 		2) 정수 / 소수 = 소수
 *		3) 10 / 0 = 오류
 * 	% : 나머지 값
 * 		1) 5 % 2 = 1
 * 		2) -5 % 2 = -1
 * 		3) -5 % -2 = -1
 * 		4) 5 % -2 = 1
 * 			ㄴ결과 값은 항상 왼쪽 부호와 동일
 * 
 * 	연산처리
 * 		ㄴ 자동형변환 / 복잡한 계산은 ()
 * 		ㄴ 오버플로우
 */

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[] args) {

//		int a = 369;
//		int b = 369 / 100;
//		int c = (a%100) / 10;
//		int d = (a%10) / 1;
//		System.out.println(b +" " + c + " " + d);
//		System.out.println((byte)340);
//		System.out.println(~43);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫 번째 정수 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 정수 : ");
//		int num2 = scan.nextInt();
//		
//		System.out.println("=========결과=========");
//		System.out.printf("%d + %d = %d\n", num1,num2,num1 + num2);
//		System.out.printf("%d - %d = %d\n", num1,num2,num1 - num2);
//		System.out.printf("%d * %d = %d\n", num1,num2,num1 * num2);
//		System.out.printf("%d / %d = %d\n", num1,num2,num1 / num2);
//		System.out.printf("%d % %d = %d\n", num1,num2,num1 % num2);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("단어 입력(abc abc abc) : ");
//		String s = scan.nextLine(); // 한줄
//		String st1 = scan.next();
//		String st2 = scan.next();
//		String st3 = scan.next();
//		
//		System.out.println("=========결과=========");
//		System.out.println(st1 +" " + st2 + " " + st3);
//		System.out.println(s);
		Scanner scan = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력");
		int a = scan.nextInt();

		System.out.print("두 번째 정수 입력");
		int b = scan.nextInt();

		System.out.print("세 번째 정수 입력");
		int c = scan.nextInt();


		System.out.println(a * b + c);


	}

}
