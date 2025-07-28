


/*
 * 	국어 영어 수학 점수 입력 => 총점, 평균 => 60 이상이면 합격 / 불합격
 * 
 * 
 * 
 */

import java.util.*;


public class 제어문_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학점수 입력(90 90 90):");

		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n" , avg);
		
		if((int)avg >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}

}
