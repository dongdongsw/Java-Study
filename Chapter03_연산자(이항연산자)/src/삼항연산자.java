
/*
 * 		(조건) ? 값1 : 값2 => true / false
 * 			ㄴ 1) 부정 연산자
 * 			ㄴ 2) 비교 연산자
 * 			ㄴ 3) 논리 연산자
 */
import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//조건을 입력 받아서 짝수 / 홀수
//		System.out.println("정수를 입력하시오 : ");
//		int a = scan.nextInt();
//		System.out.println(a % 2 == 1 ? "홀수" : "짝수");
		
		//3의 배수
		System.out.println("정수를 입력하시오 : ");
		int a = scan.nextInt();
		System.out.println(a % 3 == 0 && a !=0 ? "3의 배수다" : "3의 배수 아니다");
	}

}
