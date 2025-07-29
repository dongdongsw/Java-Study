/*
 * 	=> UpDown 게임
 * 	=> 난수 => 1 ~ 100사이
 * 	=> 사용자 입력
 * 		=> 힌트 UP
 * 			   DOWN
 * 
 * 	continue => if와 switch문에서 사용 x
 * 	break => for문이랑 while문, switch문, if문 o
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 제어문_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = (int)((Math.random()*100)+1);
		int count = 0;
		System.out.print("UpDown 게임의 숫자를 입력하시오(1 ~ 100) :");
		
		for(int i = 0; i <= 10; i++ ) {
			
			int b = scan.nextInt();
			count += 1;
			if(b <= 100 && b >= 0){
				
				if(b > a) {
					System.out.println("DOWN");
				}
				else if(b < a) {
					System.out.println("UP");	
				}
				else if(a==b){
					System.out.println("정답");	
					System.out.printf("시도 횟수 : %d",count);	
					break;
				}
				
			}
			else {
				System.out.print("1 ~ 100까지의 숫자로 다시 입력하시오 :");
				continue;
			}
			
		}
		

	}
}
