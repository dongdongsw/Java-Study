//사용자로부터 세개의 정수를 입력받아, 그 수들의 최대값과 최소값,합계와 평균을 구해보자

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세개의 정수를 입력하시오 :");
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		int c = scan.nextInt();
		
		int max = a;
		int min = a;
		int sum = a + b + c;
		double avg = sum / 3.0;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		System.out.printf("최대값 : %d \n 최솟값 : %d \n 합계 : %d \n 평균 : %.2f",max,min,sum, avg);
				
	}

}
