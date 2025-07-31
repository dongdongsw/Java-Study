import java.util.Scanner;

public class 제어문_8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		for(;;) {
//			System.out.print("q를 입력하면 종료합니다 :");
//			String input  = scan.next();
//			if(input.equals("q")) {
//				System.out.println("종료합니다!!");
//				break;
//				
//			}
//		}
		
//	----------------------------------------------------------
//		while(true) {
//			System.out.print("q를 입력하면 종료합니다 :");
//			String input  = scan.next();
//			if(input.equals("q")) {
//				System.out.println("종료합니다!!");
//				break;
//				
//			}
//		}
//		
//		----------------------------------------------------------

		String input = "";
		do {
			System.out.print("q를 입력하면 종료합니다 :");
			input  = scan.next();
			
			
		}while(input.equals("q"));
		System.out.println("do ~ while문 종료합니다!!");

		
		
		
		
		
		
		
		
		
		
		
	}
	
}
