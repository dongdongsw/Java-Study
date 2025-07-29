import java.util.Scanner;

public class 문제6 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int a = scan.nextInt();
		int b = 0;
		for(int i = 1; i<=a; i++) {
			b += i;
			
		}
		System.out.println("1~10까지의 합 :" + b);

		}

}