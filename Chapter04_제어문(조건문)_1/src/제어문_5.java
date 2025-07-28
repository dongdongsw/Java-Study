
/*
 *  => 입력을 받아서 => 로그인 처리
 *  id, pwd => 오라클에서 처리
 *  
 */

import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		//임의로 ID, PWD설정
		
		final String ID = "admin";
		final String PWD =  "1234";
		// final : 상수 => 상수는 변수와 구분 => 모든 키워드를 대문자로 설정
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		if(ID.equals(id) && PWD.equals(pwd)){
			System.out.println("로그인 되었습니다");
		}
		else {
			System.out.println("로그인에 실패 되었습니다");
				
		}
	}

}
