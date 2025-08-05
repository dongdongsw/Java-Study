/*ㅏㅏㅏㅏ
 * 자바 => 기본 문법
 * 			=> 변수 / 데이터형(기본형)
 * 			=> 가공 (사용자 요청)
 * 			   --------------연산자 / 제어문
 * 	=> 관리
 * 		=> 데이터 시작
 * 			=> 배열 => 한개 이름으로 관리 = 같은 데이터형
 * 			=> 클래스 => 한개 이름으로 관리 = 다른 데이터형
 * 		=> 소스 코딩을 분리 => 문장 단락
 * 							ㄴ 메소드 : 객체지햐앙의 핵심
 * 								ㄴ 변수 / 연산자 / 제어문
 * 	--------------------------------한개로 묶어서 저장
 * 									--------------객체
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		System.out.println(arr);
//		int[] arr = {10,20,30,40,50};
//		
//		
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		
		String[] names = {"홍길동", "심청이", "춘향이", "박문수", "이순신"};
		for(String i : names) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + " ");
				
		}
	}

}
