//사용자들로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 :");
		String a = scan.next();
		
		char b = a.charAt(0);
		
		if( b == '-' ) {
			System.out.println(a + "는 음수입니다");
		}
		else {
			System.out.println(a + "는 양수입니다");
				
		}
		
		
	}

}
