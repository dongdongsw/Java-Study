// 6개의 난수 => 1~45 => 중복없는 데이터
// 고스톱
/*
 * 데이터별 묶음 : 배열
 * 단위별 묶음 : 클래스
 * 명령문 묶음 : 메소드
 * ----------------------------전체를 묶으면 클래스
 * 
 * 	Method Area => static
 * 		main/사용자 정의 메소드 => 기능
 * -------------------------------
 * heap : 배열 데이터 / 클래스 데이터
 * 		=> 프로그래머 관리 영역
 * 		=> new / delete(사라짐) => 자동 메모리 해제를 해줌(가비지 컬렉션) 
 * -------------------------------
 * stack : 지역변수 / 매개변수 / 참조 주소
 * 		=> 메모리 관리 => 자동으로 삭제
 * 		{}이 종료가 되면 자동삭제
 * -------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Arrays;


public class 배열_9 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		System.out.println(lotto);

		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i] + " ");


			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(lotto);
		System.out.println(" ");

		//오름차순
//		for(int i : lotto) {
//			System.out.print(i + " ");
//		}
		
		//내림차순
		for(int i=lotto.length-1; i>=0; i--) {
			System.out.print(i + " ");
		}
	}

}
