/*
 * 
 * 		선택문
 * 		형식) 
 * 			switch(정수, 문자, 문자열)
 * 			{
 * 				case 1:
 * 					처리문장
 * 					break;
 * 				case 2:
 * 					처리문장
 * 					break;
 * 				default : 
 * 					처리문장			
 * 				}			
 * 			--------------요즘---------------
 * 			break없이 사용
 * 			switch(문자, 문자열, 정수)
 * 			{case 1 -> {
 * 				람다 => break 없이 사용
 * 			}
 * 			.
 * 			.	
 * 			. 
 * 
 * 
 *			=> 값 한개 선택 => 다중 조건문을 간결하게
 *			=> 메뉴 , 게임키를 누르는 경우
 *			=> 게임 / 네트워크
 *			=> 1개만 사용이 가능 
 *			=> 웹에서는 많이 사용하지 않는다
 *			
 *			=> 데이터형 : short, float
 *						byte => 파일업로드 / 파일 다운로드
 *						=> int / long / double / String
 *						
 *			
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 :");
		int a = scan.nextInt();
		
		System.out.print("연산자를 입력하시오 :");
		String b = scan.next();
		
		System.out.print("첫 번째 정수를 입력하시오 :");
		int c = scan.nextInt();
		
//		char ag = b.charAt(0); 
//		switch(ag) {
//			case '+':{
//				int k = a + c; 
//				System.out.printf("%d + %d = %d", a, c, k);
//				break;
//		}
//			case '-': {
//				int k = a - c; 
//				System.out.printf("%d - %d = %d", a, c, k);
//				break;
//			}
//			case '*': {
//				int k = a * c; 
//				System.out.printf("%d * %d = %d", a, c, k);
//				break;
//			}
//			case '/': {
//				int k = a / c; 
//				System.out.printf("%d / %d = %d", a, c, k);
//				break;
//			}
//			default : 
//				System.out.println("연산자를 잘못 입력함");
//		}
		switch(b) {
		case "+" -> {
			int k = a + c; 
			System.out.printf("%d + %d = %d", a, c, k);
	}
		case "-" ->  {
			int k = a - c; 
			System.out.printf("%d - %d = %d", a, c, k);
		}
		case "*" ->  {
			int k = a * c; 
			System.out.printf("%d * %d = %d", a, c, k);
		}
		case "/" ->  {
			int k = a / c; 
			System.out.printf("%d / %d = %d", a, c, k);
		}
		default ->{ 
			System.out.println("연산자를 잘못 입력함");
		}
		}
	}

}




















