//컴퓨터와 가위 바위 보 
/*
 * 경우의 수
 * 컴퓨터 
 * 	ㄴ가위 => 사용자 = (가위, 바위, 보)
 * 	ㄴ바위 => 사용자 = (가위, 바위, 보)
 * 	ㄴ보 => 사용자 = (가위, 바위, 보)
 */
import java.util.Scanner;
import java.util.*;

public class 제어문_조건문1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*2);
		
		System.out.println("가위 : 0 / 바위 : 1 / 보 : 2");
		int user = scan.nextInt();
		
		System.out.println(com);

		if(com == user && user <3 && user >= 0 ){
			System.out.println("비김");

		}
		else if(com > user && user <3 && user >= 0){
			System.out.println("컴퓨터가 이김");

		}
		else if(com < user && user <3 && user >= 0){
			System.out.println("사용자가 이김");

		}
		else {
			System.out.println("정확한 숫자를 적으시오");
		}
		
	}

}
