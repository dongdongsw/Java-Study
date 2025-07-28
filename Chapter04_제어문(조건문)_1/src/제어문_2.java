
/*
 * 		자바 = 한개의 클래스에서 작업하지 않는다
 * 			클래스 여러개를 만들어서 연관관계
 * 		모든 프로그램 => Actor  
 * 
 * 		선택에 따라 출력 내용 변경
 * 			ㄴtrue / false 를 나눠서 작업
 * 				ㄴ 로그인을 성공 / 실패
 * 				ㄴ 대문자 / 소문자
 * 				ㄴ 짝수 / 홀수 
 * 				ㄴ if{
 * 				
 * 					}
 * 				  else{
 * 			
 * 				 	}
 * 			// 문자 => 입력을 받아서 => 대문자 / 소문자
 * 			// 짝수 / 홀수
 */
import java.util.*;


public class 제어문_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다");
		}
		else {
			System.out.println(num + "은 홀수입니다");
				
		}
	}

}
