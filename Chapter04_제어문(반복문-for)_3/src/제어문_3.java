//10번 가위바위보
// 몇전 몇승 몇무 몇패

import java.util.Scanner;

public class 제어문_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int win = 0;
		int lose = 0;
		int same = 0;
		int i;
		for( i= 1; i <= 10; i++) {
			int a = (int)(Math.random()*3);
			System.out.print("가위(0) 바위(1) 보(2) :");
			int b = scan.nextInt();
			
			if(b < 0 || b > 2) {
				System.err.println("가위바위보 입력해야 합니다.");
				i--;
				continue;
			}
			else if(a > b) {
				System.out.println("컴터가 이김");
				lose +=1;
			}
			else if(a < b) {
				System.out.println("당신이 이김");
				win +=1;
			}
			else {
				System.out.println("비김");
				same += 1;
			}
			
			
		}
		System.out.println("==================결과값==================");
		System.out.printf("%d전 %d승 %d무 %d패",i-1, win, same, lose);

	}

}
