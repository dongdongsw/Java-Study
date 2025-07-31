import java.util.Scanner;

public class 제어문_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("등급 입력(3 ~ 7) :");
		int level = scan.nextInt();
		
		int bomb = (int)(Math.random()*5)+1;
		
		int success=0;
		
		System.out.print("🎃🎃폭탄 피하기 게임(1 ~ 5) 사이의 정수 입력 :");
		while(success < level) {
			System.out.print("정수 입력 :");
			int input = scan.nextInt();
			
			if(input < 1 ||input > 5) {
				System.err.println("🙈사용할 수 없는 숫자입니다:");
				continue;
			}
			
			if(input == bomb) {
				System.out.print("☠️게임오버 폭탄 위치는 " + bomb + "번에 있었습니다");
				
					break;
			}
			else {
				System.out.println("😊게임을 계속 진행하세요");
				success++;
			}
			
		}
		if(success == level)
		{
			System.out.println(" 🔮축하합니다!! 폭탄을 피했습니다3");
			
			
			
			
		}
		
	}

}
