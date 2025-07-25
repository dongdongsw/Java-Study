
/*
 * 		자바에서 지원하는 프로그램 형식
 * 		평문 : 위에서 아래로 한문장씩 수행
 * 		
 * 		조건문 : 상황에 따라서 동작 형식 변경
 * 		
 * 		반복문 : 중복제거 
 * 
 * 		형식)
 * 			package package명 => 한번만 사용
 * 			import ... => 여러개 사용이 가능
 * 			class ClassName{
 * 				public static void main(String[] args){
 * 					1. 변수 선언
 * 					2. 변수에 초기화
 * 					3. 사용자 요청 따른 처리 => 제어문
 * 					4. 결과를 출력
 * 
 * 				}
 * 			}
 * 
 */


public class 단일조건문정리 {

	public static void main(String[] args) {

		int a = 15;
		if(a%3 == 0) {
			System.out.println("3의 배수");
		}
		else if(a%3 == 0) {
			System.out.println("5의 배수");
		}
		
	}

}
