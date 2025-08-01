/*
 * 	문자열 저장
 * 		ㄴ 기능
 * 			ㄴ String : 데이터형 + 클래스
 * 									ㄴ 클래스 : 기능 처리(메소드)
 * 			println , print => 화면 출력, random => 임의 실수 추출
 * 		ㄴ
 * 		ㄴ 저장 방법
 * 			ㄴ String 변수명 = "문자열" => 제한이 없다
 * 
 * 		ㄴ 문자열 제어가 가능하게 기능처리(메소드 제공)
 * 			메소드 
 * 				ㄴ 1. 리턴형
 * 				ㄴ 2. 메소드명
 * 				ㄴ 3. 매개변수
 * 				ㄴ 4. 어떤 기능인지 확인
 * 				----------------------이미 제작 => 암기 (String => 변경할 수 없다)
 * 				ㄴ 변경이 안되는 클래스
 * 					ㄴString, System, Math => 종단 클래스(final)
 * 				ㄴ 형태
 * 					ㄴ 리턴형 메소드명 (매개변수_list)
 * 						------------------------외워야 함
 * 				ㄴ 1) 문자의 개수
 * 					ㄴ length()
 * 						ㄴ 원형 : int length() => .(주소 접근 연산자)
 * 
 * 				ㄴ 2) toUpperCase() aaa => AAA
 * 					  toLowerCase() AAA => aaa
 * 						ㄴ 원형 : String toUpperCase()
 * 								String toLowerCase()
 * 				ㄴ 3) substring() => 원하는 문자열을 자르는 경우 사용
 * 						ㄴ 원형 : String substring(int beginIndex)
 * 								ㄴ beginIndex부터 마지막 문자열 자르기
 * 								String substring(int beginIndex, int endIndex)
 * 																	 --------endIndex - 1
 * 		메소드는 같은 이름으로 제작할 수 없다
 * 		예외 조건 : 매개변수의 갯수나 데이터형이 다르면 다른 메소드로 인식								
 * 			ㄴ오버로딩
 * 
 */
public class 정리_8 {

	public static void main(String[] args) {

//		String s = "0123456789";
//		System.out.println("갯수 :" + s.length());
//		String s1 = "Hello 자바 12345";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		System.out.println("원본 : " + s1);
		String s = "0123456789";
		System.out.println(s.substring(5));
		s = s.substring(5,9);
//		System.out.println(s.substring(5,9));
		System.out.println(s);

		
		
	}

}
