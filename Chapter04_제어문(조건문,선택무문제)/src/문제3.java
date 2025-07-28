//1학년 부터 4학년까지 중간고사 시험을 보았다
//4학년은 70점 이상이면 합격, 그이외의 학년은 60점 이상이면 합격이다
//이를 판단하는 프로글매을 작성해보자
//점수가 0미만 100초과이면 경고문구 출력!

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 학년인지 입력하시오 :");
		int a = scan.nextInt();
		
		System.out.print("점수를 입력하시오 :");
		int b = scan.nextInt();
		
		if(a == 4) {
			if(b >= 70 && b <= 100) {
				System.out.println("합격");

			}
			else if(b < 70 && b >=0) {
				System.out.println("불합격");

			}
			else {
				System.out.println("불합격");

			}
		
		}
		else{
			if(b >= 60 && b <= 100) {
				System.out.println("합격");

			}
			else if(b < 60  && b >=0) {
				System.out.println("불합격");

			}
			else {
				System.out.println("불합격");

			}
		}
		
	}

}
