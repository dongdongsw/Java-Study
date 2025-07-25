
/*
 * 1. 	12, 1, 2 => 겨울
 * 		3, 4, 5 => 봄
 * 		6,7,8 => 여름
 * 		9,10,11 => 가을
 * 2. 		사용자 입력을 받는다(월입력)
 * 3. 결과값은 봄, 여름, 가을, 겨울 계절을 출력
 * 
 */
import java.util.*;
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력 하시오 :");
		int a = scan.nextInt();
		
		
		
		if(a == 12 || a == 1 || a == 2)
			System.out.println("겨울");
		if(a >= 3 && a <= 5 )
			System.out.println("봄");
		if(a >= 6 && a <= 8)
			System.out.println("여름");
		if(a >= 9 && a <= 10)
			System.out.println("가을");
		
		
	}

}
