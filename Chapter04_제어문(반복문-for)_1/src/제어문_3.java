/*
 * 5개의 알파벳 입력
 * 
 * A -> a
 * b -> B
 * 
 * 
 * 
 */
import java.util.Scanner;

public class 제어문_3 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		for(int i = 0; i < 5; i++) {
//			System.out.print("알파벳을 입력하시오 :");
//			
//			String a = scan.next();
//			char aa = a.charAt(0);
//			if(aa >= 'A' && aa <= 'Z') {
//				System.out.println("소문자 :" + (char)(aa+32));
//				
//			}
//			else {
//				System.out.println("대문자 :" + (char)(aa-32));
//			}
//		
//		}
//		---------------------소문자를 대문자로----------------------------
//		Scanner scan = new Scanner(System.in);
//		System.out.print("알파벳 문장을 입력하시오 :");
//		String a = scan.next();
//		
//		
//		System.out.println(a.toUpperCase());
		
		
//		---------------------------------------------------------------
		
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 문장을 입력하시오 :");
		String a = scan.next();
		
		int acount = 0;
		int bcount = 0;
		
		for(int i = 0; i<= a.length()-1; i++) {
			char s = a.charAt(i);
			if(s >= 'A' && s <= 'Z')
			{
				acount += 1;
			}
			else if(s >= 'a' && s <= 'z')
			{
				bcount += 1;
			}
			
		}
		System.out.println("대문자의 개수는 :" + acount);

		System.out.println("소문자의 개수는 :" + bcount);
	
	}

}
