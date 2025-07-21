package 자바기본문법;

/*
 * 		숫자
 * 		 = 정수
 * 			= 2진법 => 1000 => 0b를 앞에 넣으면 이진법 출력 -> 1000 (8 + 0 + 0 + 0) 십진법으로 8 나옴
 * 
 * 			= 8진법 => 111 => 0를 앞에 넣으면 팔진법 출력 -> 001 001 001 (64 + 8 + 1)하면 십진법 73이 나옴
 * 			= 10진법 => 100 => 그대로 
 * 			= 16진법 => 111 => 0x111 -> 0001 0001 0001 (256 + 16 + 1)하면 십진법 273 나옴
 * 
 * 			= 21억 4천 정도 인식
 * 				=> 이상을 넘어가면 : ~ L(1)
 * 		 = 실수
 * 			=10.5, 100.23...
 * 
 * 		문자
 * 		 = 문자 한개 저장
 * 			'A', '홍', '심' ...=> 모든 국가의 언어 사용이 가능
 * 				=> 문자 사용이 가능
 * 		문자열
 * 		 = 문자 여러개
 * 			"홍길동"
 * 		논리형
 * 		 = true/false
 * 	
 * 		특수문자 
 * 		 = \t => 탭 기능 
 * 		 = \n => 줄바꿈 기능
 * 		 = \" => "출력
 * 		 = \\ => 출력 => 경로명
 * 
 * 		실행 과정
 * 		-------
 * 		프로그램 구동
 * 		----------
 * 		컴파일 : java / c# / c / c++ => 컴퓨터가 인식하는 언어로 변경
 * 		인터프리터 : 한줄씩 읽어서 출력
 * 				   HTML / JavaScript / Python
 * 					  javac
 * 					  컴파일
 * 		A.java ====================> 컴퓨터가 인식 언어로 변경
 * 		원시소스						| 0101001010
 * 		|프로그래머만 알고 있는 언어		  0101001011
 * 										   |
 * 										A.class (바이트 코드)
 * 										   |
 * 										   | java
 * 										한줄씩 읽어서 출력
 * 		=> 문법 : 컴파일 에러		
 * 		=> 실행시 에러 : 인터프리터 에러
 * 		---------------------------------
 *		c/c++		: 저급 언어 => 하드웨어
 *		Python		: 고급 언어 => 소프트웨어
 *		Java 		: 고급 언어 
 *		코볼 / 포트란	: 고급언어
 */
public class 자바표현식_실행과정 {

	public static void main(String[] args) {
		System.out.println(0b1000);
		System.out.println(0111);
		System.out.println(0x111);
		System.out.println(2500000000L);
		System.out.println(10.5);
		System.out.println('홍');
		System.out.println('길');
		System.out.println('동');
		System.out.println("홍길동");
		System.out.println(true);
		System.out.println(false);
		System.out.print("Hello\tJava!!");
		System.out.print("\nHello Java!!\n");
		System.out.println("\" 홍길동 \""); // " 홍길동 "
		System.out.println("C:\\Users\\sist\\git\\Java-Study\\자바기본문법\\src\\자바기본문법\\자바표현식_실행과정.java");



	}

}
