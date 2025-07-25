
/*
 * 점수를 입력 => 0 ~ 100사이
 * 	= 60이상이면 합격
 * 	= 60 이하면 불합격
 * 
 * 
 */

import java.util.*;

public class 제어문_조건문7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int a = scan.nextInt();
		
		if(a >= 0 && a<= 100 ) {
			if(a >= 60) {
				System.out.println("합격");
			}
			if(a < 60) {
				System.out.println("불합격");
			}
		}
		if(a < 0 || a > 100)
			System.out.println("점수가 잘못되었습니다.");
		
		
	}

}
