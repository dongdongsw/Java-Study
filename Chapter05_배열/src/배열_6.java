/*
 * 
 * 
 * 
 * 
 * 
 * 가위 바위 보 게임
 */

import java.util.Scanner;

public class 배열_6 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		System.out.print("가위(0) 바위(1) 보(2) :");
		int user = scan.nextInt();
		
		System.out.println("========= 결과값 =========");
		String[] res = {"가위", "바위", "보"};
		System.out.println("컴퓨터 :" + res[com]);
		System.out.println("사용자 :" + res[user]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(com == 0) {
//			System.out.println("컴퓨터 : 가위");
//		}
//		else if(com == 1) {
//			System.out.println("컴퓨터 : 바위");
//		}
//		else if(com == 2) {
//			System.out.println("컴퓨터 : 보");
//		}
//		
//		if(user == 0) {
//			System.out.println("컴퓨터 : 가위");
//		}
//		else if(user == 1) {
//			System.out.println("컴퓨터 : 바위");
//		}
//		else if(user == 2) {
//			System.out.println("컴퓨터 : 보");
//		}
		
	}

}
