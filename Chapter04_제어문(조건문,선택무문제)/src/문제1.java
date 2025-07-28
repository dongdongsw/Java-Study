//정수 한개를 입력 받아서, 그 수가 50 이상의 수인지 50 미만의 수인지 판단해보자

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 한개 입력하시오");
		
		int a = scan.nextInt();
		
		if(a >= 50) {
			System.out.println(a + "는 50 이상이다");
		}
		else {
			System.out.println(a + "는 50 미만이다");
			
		}
		
	}

}
