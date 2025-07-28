//정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// (90이상이면 A, 80점 이상이면  B, 70이상이면 C, 60점 이상이면  D, 나머지는 F)

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 점수를 입력하시오 :");
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		int c = scan.nextInt();
		
		int sum = a + b + c;
		int avg = sum / 3;
		int score = 0;
		
		if(avg >= 90 && avg <= 100) {
			score = 5;
		}
		else if(avg >= 80 && avg < 90) {
			score = 4;
		}
		else if(avg >= 70 && avg < 80) {
			score = 3;
		}
		else if(avg >= 60 && avg < 70) {
			score = 2;
		}
		else if(avg >= 0 && avg < 60){
			score = 1;
		}
		else {
			score = 11;

		}
		
		switch(score) {
			case  5 ->{
				System.out.println("A");
				
			}
			case  4 ->{
				System.out.println("B");
				
			}
			case  3 ->{
				System.out.println("C");
				
			}
			case  2 ->{
				System.out.println("D");
				
			}
			case  1 ->{
				System.out.println("F");
				
			}
			default -> {
				System.out.println("점수를 제대로 입력해주세요");

			}
		}
		
	}

}
