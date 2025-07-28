/*
 * 
 * 
 * 
 * 	1. 식별자
 * 		= 알파벳, 한글로 시작한다 (알파벳은 대소문자 구분)
 * 		= 숫자를 사용(앞에 사용 금지)
 * 		= 키워드는 사용이 불가능 (빨간색)
 * 		= 공백 금지
 * 		= 특수문자 사용( _ , $)
 * 		------------------------------------------------
 * 		변수 / 상수 / 클래스/ 인터페이스 / 메소드
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수입력(90 90 90) :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int avg = (a + b + c) / 3;
		
		System.out.println("=============결과===============");
//		char score = 'A';
//		if(avg >= 90)
//			score = 'A';
//		if(avg >= 80)
//			score = 'B';
//		if(avg >= 70)
//			score = 'C';
//		if(avg >= 60)
//			score = 'D';
//		if(avg < 60)
//			score = 'F';
//		----------------------------------------------------------
//		char score = 'A';
//		if(avg >= 90 && avg <= 100)
//			score = 'A';
//		if(avg >= 80 && avg <= 89)
//			score = 'B';
//		if(avg >= 70 && avg <= 79)
//			score = 'C';
//		if(avg >= 60 && avg <= 69)
//			score = 'D';
//		if(avg < 60)
//			score = 'F';
//	--------------------------------------------------------------
		char score = 'A';
		if(avg >= 90)
			score = 'A';
		else if(avg >= 80)
			score = 'B';
		else if(avg >= 70 )
			score = 'C';
		else if(avg >= 60 )
			score = 'D';
		else
			score = 'F';
		
		System.out.println("학점 :" + score);

		
		
	}

}
