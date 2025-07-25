/*
 * 		(국어 영어 수학) 점수 입력
 * 		평균 출력, 총점, 
 * 학점
 * A+ = 97 ~ 100
 * A0 = 96 ~ 94
 * A- = 93 ~ 90
 * 
 * B+ = 87 ~ 89
 * B0 = 84 ~ 86
 * B- = 80 ~ 83
 * 
 * 나머지 60
 */

import java.util.*;

public class 제어문_조건문5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("국어 점수를 입력하시오: ");
		int a = scan.nextInt();
		System.out.print("영어 점수를 입력하시오: ");
		int b = scan.nextInt();
		System.out.print("수학 점수를 입력하시오: ");
		int v = scan.nextInt();
		int sum = (a + b +v);
		double avg = sum / 3.0;
		
		System.out.println("총점은 : " + sum);
		if((a <= 100 && a>=0) && (b <= 100 && b>=0) && (v <= 100 && v>=0)) {
			if(avg >= 97 && avg <= 100) {
				System.out.println("학점은 A+");
			}
			if(avg >= 94 && avg <= 96) {
				System.out.println("학점은 A0");
			}
			if(avg >= 90 && avg <= 93) {
				System.out.println("학점은 A-");
			}
			if(avg >= 87 && avg <= 89) {
				System.out.println("학점은 B+");
			}
			if(avg >= 84 && avg <= 86) {
				System.out.println("학점은 B0");
			}
			if(avg >= 80 && avg <= 83) {
				System.out.println("학점은 B-");
			}
			if( avg <= 79) {
				System.out.println("학점은 F");
			}
		}
		
	}

}
