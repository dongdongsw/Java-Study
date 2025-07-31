import java.util.Scanner;

public class 제어문_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print(" 세자리 정수 입력 :");
			int num = scan.nextInt();
			if(num < 100 || num < 999) {
				System.out.print("잘못된 입력입니다.");
				continue;

			}
			int a = num/100;
			int b = (num%100)/10;
			int c = num % 10;
			
			if(a==b || b == c ||a ==c) {
				System.out.print("중복된 수를 사용할 수 없습니다");
				continue;

			}
			switch(a) {
			case 1 :
				System.out.print(1);

			case 2 :
				
				System.out.print("프로그램 종료!!!");
				System.out.print(1);
			case 3 :{
				if(a == 3)
					System.out.print("프로그램 종료!!!");
							System.out.print(1);
			}
				
														
				
				
				
			}
		}
	}

}
