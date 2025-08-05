/*
 *  숫자 야구 게임
 * 	난수 => 3,6,9
 * 	456 => 1B
 * 	379 => 2S
 * 	
 * => 저장 => 배열
 */

import java.util.Arrays;
import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. 컴퓨터 난수 => 중복없는 난수 => 1~9
		int[] com  = new int[3];
		for(int i =0; i< com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0; j < i; j++) {
				
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		//==================================
		//2. 사용자 입력
		int[] user = new int[3];
		int i = 0;
		int input = 0;
		while(true) {
			System.out.print("세자리 정수를 입력하시오 :");
			input = scan.nextInt();
			if(input < 100 || input > 999) {
				System.out.println("세자리 정수 입력을 꼭 하셔야 합니다.");
				continue; // 처음부터 다시 시작
				// => while => 조건식, for =>  증가식
			}
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10; 
			if(user[0] == user[2] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			//0을 입력할 수 없다
			if(user[0] == 0 || user[1] ==0 || user[2] ==0) {
				
				System.out.println("0은 사용할 수가 없다.");
				continue;
			}
		
		//3. 힌트
		int s = 0, b = 0;
		for(i = 0; i<3; i++) {
			for(int j = 0; j < 3; j++) {
				if(com[i] == user[j]) {
					if(i == j) {
						s++;
					}
					else {
						b++;
					}
				}
			}
			System.out.printf("Input Number : %d, Result : %dS-%dB\n", input, s, b);
			if(s ==3) {
				System.out.println("축하합니다");
				break;
			}
			
		}
		//4. 종료여부=> break
		//=========================반복문
		}
	}

}
