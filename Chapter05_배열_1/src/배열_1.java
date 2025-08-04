/*
 * 1. 데이터 저장
 * 	ㄴ 변수 : 한개만 저장이 가능
 * 	ㄴ 배열 : 같은 종류의 데이터를 여러개 저장이 가능
 *  ㄴ 클래스 : 관련된 다른 데이터형을 모아서 저장
 *  	ㄴ 영화 정보 / 맛집 정보 (상세보기)
 * 
 * 	
 */


import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//10개의 정수를 저장
		int[] a = new int[3];
		int[] b = new int[3];

		int[] rank = new int[3];
		//배열 => 같은 종류의 데이터가 3개 이상

		for(int i =0; i < a.length; i++) {
			System.out.print("국어 점수 입력 :");
			a[i] = scan.nextInt();
		}
		for(int i =0; i < a.length; i++)
			rank[i]++;
			
			
		
		
		
		
		System.out.println("============= 결과 값 ============");
		for(int i = 0; i<a.length; i++) {
			System.out.printf("%-5d\n " + a[i]);
		}
	}


}
