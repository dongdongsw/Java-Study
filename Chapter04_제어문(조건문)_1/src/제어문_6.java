/*
 * 		선택 조건문 : true/false  나눠서 작업
 * 		
 * 	11 22 33 ... => 같은 수 /다른 수 입니다
 * 
 */

import java.util.*;

public class 제어문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리 정수를 입력하시오");
		int a = scan.nextInt();
		
		//분리
		if(a >= 10 && a <= 99) {
			//정상적으로 입력이 된경우
//			int b = a / 10;
//			int c = a % 10;
			if(a%11 == 0) {
				System.out.println(a + "는 같은 수 입니다");

			}
			else {
				System.out.println(a + "는 다른 수 입니다");

			}
		}
		else {
			System.out.println("잘못된 입력입니다!!");

		}
		
		
	}

}
