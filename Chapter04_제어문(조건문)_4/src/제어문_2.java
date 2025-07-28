/*
 * 1. 사용자 입력 -> 메소드 (중복 제거) => 기능
 * 
 * 2. 입력 처리 -> 메소드 => 재사용
 * 	----------
 * 3. 결과값 출력 -> 메소드
 */

import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10 사이의 정수 입력 :");
		
		int a = scan.nextInt();
		
//		switch(a) {
//			case 10:
//			case 9: {
//				System.out.println("A");
//				break;
//			}
//			
//			case 8: {
//				System.out.println("B");
//				break;
//			}
//			case 7: {
//				System.out.println("C");
//				break;
//			}
//			case 6: {
//				System.out.println("D");
//				break;
//			}
//			default : {
//				System.out.println("F");
//
//			}
//		}
//		
		switch(a) {
		case 10, 9 -> {
			System.out.println("A");
		}
		
		case 8-> {
			System.out.println("B");
		}
		case 7-> {
			System.out.println("C");
		}
		case 6-> {
			System.out.println("D");
		}
		default -> {
			System.out.println("F");

		}
	}
	
		
	}

}
