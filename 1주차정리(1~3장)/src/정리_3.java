
/*
 * 		변수 + 연산자 + 제어문 = 메소드
 * 		메소드 + 메소드 + ... = 클래스
 * 		클래스 + 클래스 + ... = 패키지 => jar
 * 
 * 		연산자 
 * 			ㄴ 단항 연산자
 * 			ㄴ 증감 연산자( ++, --)
 * 			ㄴ 부정 연산자(!)
 * 			ㄴ 형변환 연산자 (데이터형)
 * 				
 * 			ㄴ 이항 연산자 
 * 			ㄴ 산술 연산자 ( +, -, /, *, %)
 * 				ㄴ자동형변환
 * 					ㄴ큰데이터형으로 변경 후 연산
 * 					-------------------------- # 연산은 같은 데이터형끼리만 연산
 * 			ㄴ 비교 연산자 (==, !=, <, >, <=, >=)
 * 			ㄴ 논리 연산자	(&&, ||)
 * 			ㄴ 대입 연산자 (=, +=, -=)
 * 
 * 			ㄴ 삼항 연산자	((조건)?값1: 값2)) => true => 값1, false => 값2
 * 							
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class 정리_3 {

	public static void main(String[] args) {
			
			int x = 10;
			int y = 10;
			int z;
			
			x++;
			++x;
			System.out.println("x = "+x);
			System.out.println("=======");
			
			y--;
			--y;
			System.out.println("y = "+y);
			System.out.println("=======");
			
			z = x++;
			System.out.println("z = "+z);
			System.out.println("=======");
			
			z = ++x;
			System.out.println("z = "+z);
			System.out.println("z = "+x);
			
			z =++x + y++;
			
			System.out.println("z = "+z);
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			
			System.out.println("=======");
			boolean bCheck = false;
			System.out.println(bCheck);
			System.out.println(!bCheck);
			
			System.out.println("=======");
			System.out.println(65.0);
			System.out.println((int)65.0);
			System.out.println((char)65.0);
			System.out.println((double)'A');
			System.out.println((double)65);

			
			char c1 = 'A';
			char c2 = 'B';
			int c3 = c1 + c2;
			
			byte b1 = 10;
			byte b2 = 20;
			int b3 = b1 + b2;  //int로 받아야됨 byte로 받으면 오버플로우 발생할 수 있기에
			
			

			
	}

}
