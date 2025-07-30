/*
 * 문자열을 입력을 받아서 => 좌우 대칭 여부 확인
 * ABBA
 * 모든 문자열은 짝수
 * 
 */

import java.util.Scanner;

public class 구글코딩테스트 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String msg = "";
		for(;;) {
			
			System.out.print("문자열 입력(짝수) :");
			msg = scan.next();
			if(msg.length() % 2 ==0) {
				
				break;
			}
		
		}
		
		boolean bCheck = true;
		
		for(int i =0; i<msg.length()/2; i++) {
			
			if(msg.charAt(i) != msg.charAt(msg.length() - i - 1)) {
				bCheck = false;
				
				System.out.println( msg.charAt(i) + "와" + msg.charAt(msg.length() - i - 1) + "는 같지 않습니다");
				
				break;
				
			}
			else {
				System.out.println( msg.charAt(i) + "와" + msg.charAt(msg.length() - i - 1) + "는 같습니다");
			}
			
		}
		if(bCheck == true) {
			
			System.out.println(msg + "는 좌우 대칭입니다");
		}
		else {
			System.out.println(msg + "는 좌우 대칭이 아닙니다");

			
		}
		
		
		
	}

}
