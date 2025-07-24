
/*
 * 		웹 개발 => 자바스크립트, 오라클
 * 			ㄴ 1. 산술 연산자(중요)
 * 			ㄴ 2. 비교 연산자
 * 			ㄴ 3. 증감 연산자(중요)
 * 			ㄴ 4. 형변환 연산자(중요)
 * 			ㄴ 5. 논리 연산자
 * 			ㄴ 6. 부정 연산자(중요)
 * 			ㄴ 7. 대입 연산자
 * 		
 * 		조건문 / 반복문 
 * 			if(비교 연산자 | 논리 연산자 | 부정 연산자)
 * 
 * 			while(비교 연산자 | 논리 연산자 | 부정 연산자)
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class 비교연산자 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		
		char c1 = 'A';
		char c2 = 'B';
		boolean result4 = (c1 < c2); //true
		// char 데이터형은 모든 연산이 수행되면 정수로 변환
		// 65 < 66
		float f = 0.1f;
		double d = 0.1;
		boolean result5 = (f==d);
		System.out.println(result5);
		
		boolean b1 = true;
		boolean b2 = false;
		boolean result6 = (b1 == b2);
		boolean result7 = (b1 != b2);
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "Hello";
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

		boolean result8 = (s1==s2);
		boolean result9 = (s1!=s2);
		boolean result10 = (s2==s3);
		boolean result11 = (s2!=s3);
		boolean result12 = (s1.equals(s2));

		
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		System.out.println("result5=" + result5);
		System.out.println("result6=" + result6);
		System.out.println("result7=" + result7);
		System.out.println("result8=" + result8);
		System.out.println("result9=" + result9);
		System.out.println("result10=" + result10);
		
		System.out.println("result11=" + result11);
		System.out.println("result12=" + result12);

		
		String ss1 = "Hello";
		String ss2 = "Hello";
		System.out.println(ss1.equals(ss2));	
		
		boolean result13 = (ss1.equals(ss2));
		//대소문자 구분 => 비교
		boolean result14 = (!ss1.equals(ss2));
		boolean result15 = (ss1.equalsIgnoreCase(ss2));
		//대소문자 구분하지 않고 비교
		
		System.out.println("result13=" + result13);
		
		System.out.println("result14=" + result14);
		System.out.println("result15=" + result15);
		
		//비교 연산자 => 숫자 (정수,실수), 문자, boolean
		//문자열은 자체 라이브러리를 이용한다
		/*
		 * 	String => 클래스 (기능 => 메소드) => 표준화
		 * 
		 * 	contains() => 단어가 포함이 되어있는지
		 * 	---------------------
		 * 	startswith() => 시작 문자열이 같은 경우
		 * 	endswith() => 맨 마지막 문자 같은 경우(확장자 .jpg, .png등)
		 * -------------------서제스트
		 * 
		 * 	System / String / Math ...
		 */
		
	}

}
