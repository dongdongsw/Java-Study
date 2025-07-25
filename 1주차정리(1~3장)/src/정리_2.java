
/*
 * 		변수 : 한개의 데이터값을 저장할 수 있는 메모리(주소/번지) 공간의 이름
 * 			ㄴ 1) 임시로 데이터값을 컴퓨터에 인식 => 재사용
 * 				ㄴ변수 : 한개의 값
 * 				ㄴ배열 : 같은 것 여러개 => 사과 박스
 * 				ㄴ클래스 : 다른 것 여러개 => 종합 과일 세트
 * 				------------------------------------------------메모리에 저장
 * 				File 
 * 				RDBMS(오라클)
 * 				------------------------------------------------영구적으로 저장이 가능
 * 				=> 프로그램은 저장 (데이터 관리) => CRUD
 * 					C(Create) R(READ) U(Update) D(Delete)
 * 					저장			출력		수정			삭제
 * 			
 * 			ㄴ 2) 변수 => 읽기 / 쓰기(저장 / 수정)(getter / setter)
 * 
 * 			ㄴ 3) 메모리 크기(데이터형)
 * 				ㄴ 정수
 * 					ㄴbyte (1byte)
 * 					ㄴint (4byte) = 일반 정수 => 가장 사용되는 데이터형
 * 					ㄴlong (8byte) = 통계, 확률, 빅데이터
 * 						ㄴ1(L)
 * 				ㄴ실수
 * 					ㄴdouble (8byte) => 15자리 
 * 				ㄴ문자 
 * 					ㄴchar (2byte) => 0 ~ 65535
 * 				ㄴ논리
 * 					ㄴboolean (1byte) => true/false만 저장이 가능
 * 
 * 			ㄴ 4) 변수 선언
 * 				ㄴ 데이터형 변수명; => 메모리 저장 공간이 만들어짐
 * 					ㄴ변수명 = 알파벳, 한글로 시작(대소문자 구분)
 * 					ㄴ숫자는 사용이 가능(앞에 사용 불가능)
 * 					ㄴ키워드는 사용금지 (int, long)
 * 					ㄴ특수문자 => (_, $)
 * 					ㄴ공백없이 사용
 * 					ㄴ문자길이 => 제한(3~7)
 * 					 ------------------------가독성 (리팩토링)
 * 						ㄴ코드리뷰 / 디자인 패턴(8개) / 공통모듈
 * 						ㄴ테스트
 * 
 * 			ㄴ 5) 초기값 부여
 * 				ㄴ변수선언 => 초기값이 없는 경우에는 사용이 불가능
 * 					ㄴbyte => 0
 * 					ㄴint => 0
 * 					ㄴlong => 0L
 * 					ㄴchar => '\0' => ' '
 * 					ㄴboolean => false
 * 					ㄴdouble => 0.0
 * 					ㄴString => ""
 * 					======>변수 => 필요시마다 변경해서 사용
 * 		
 * 				=> 명시적 초기화 => int a= 10;
 * 				=> 사용자 입력값 : Scanner / JOptinePane ...
 * 				=> 임의로 데이터 추출 => random
 * 
 * 
 * 				
 */



public class 정리_2 {

	public static void main(String[] args) {

		byte b1 = Byte.MIN_VALUE;
		byte b2= Byte.MAX_VALUE;
		
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		
		double d1 = Double.MIN_VALUE;
		double d2 = Double.MAX_VALUE;
		
		char c1 = Character.MIN_VALUE;
		char c2 = Character.MAX_VALUE;
		
		System.out.println("byte \t: " + b1 + " ~ " + b2);
		System.out.println("int \t: " + i1 + " ~ " + i2);
		System.out.println("long \t: " + l1 + " ~ " + l2);
		System.out.println("double \t: " + d1 + " ~ " + d2);
		System.out.println("char \t: " + 0 + " ~ " + 65535);
	}

}
