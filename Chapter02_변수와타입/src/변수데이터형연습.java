import java.util.*;
import java.util.Scanner;
public class 변수데이터형연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//new => 메모리 저장 / System.in 키보드 입력값
		System.out.print("국어 입력:");
		int kor = scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng = scan.nextInt();
		
		System.out.print("수학 입력:");
		int math = scan.nextInt();
		
		System.out.println("국어 점수:" + kor);
		System.out.println("영어 점수:" + eng);
		System.out.println("수학 점수:" + math);
		
		int total = kor + eng + math;
		
		System.out.println("총점 : " + total);
		
		double avg = /*(kor + eng + math)*/total / 3.0;
		
		System.out.printf("평균 : %.2f\n",avg); //%2.f 는 소수점 2자리까지
		
	}

}
