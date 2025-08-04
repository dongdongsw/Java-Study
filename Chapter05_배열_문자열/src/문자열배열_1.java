/*
 * 문자열 => String : 1, 2, 3, 4 프로젝트
 * 					-----------------사용하는 변수 / 배열 / 클래스 	
 * 									여기에 사용되는 데이터형 85%
 * 
 * 문자 여려개를 동시에 저장
 * 	String == char[]
 * 	ㄴ 쉽게 제어 가능
 * 
 * 저장 방법
 * String s = "문자열" => 일반 데이터형
 * String s = new String("문자열", "문자코드")
 * 
 * 제어하는 기능
 * -----------메소다는 반드시 결과값
 * 	1. 변환
 * 		toUpperCase() : 대문자 변환
 * 		toLowerCase() : 소문자 변환
 * 		-----------------------검색
 * 		valueOf() ---------> 모든 데이터형을 문자열 변환
 * 		valueOf(10) => "10"
 * 
 * 	2. 제어
 * 		ㄴ 문자 자르기
 * 		ㄴ String subString(int beginIndex)
 * 		ㄴ String subString(int beginIndex, int endIndex - 1)
 * 
 * 		문자를 자른다 => 구분자 문자별
 * 		green, blue, black
 * 		String[] split(String del)
 * 
 * 		공백문자 제거 => 유효성 검사
 * 		String trim() => 좌우 공백 제거
 * 
 * 	3. 변경
 * 		ㄴ replace(char c1, char c2)
 * 		ㄴ replace(String s1, String s2)
 * 		
 * 		String ss = "Hello java";
 * 		ss.replace('a', 'b') => "Hello jbvb"
 * 		
 * 		String replaceAll(바꿀 문자(문자열), 문자열)
 * 
 * 	4. 찾기
 * 		char charAt(int index) => 문자한개 추출
 * 		int indexOf(char)
 * 		int lastIndexOf(char)
 * 
 * 
 * 	5. 비교
 * 		boolean equals(String s)
 * 			ㄴ 대소문자 구분
 * 			ㄴ 로그인 처리 / 아이디 중복 체크	
 * 		boolean equalsIgnoreCase(String s)
 * 			ㄴ 대소문자 구분 없이
 * 		boolean startsWith(String s)
 * 			ㄴ 시작문자열이 같은지 확인 : 대소문자 구분
 * 				ㄴ 자동완성기	
 * 		boolean endsWith(String s)
 * 			ㄴ 끝나는 문자열이 같은 경우 : 대소문자 구분
 * 		compareTo(String s) 
 * 			ㄴ "Hello".compareTo("Java") => 양수
 * 			ㄴ "Hello".compareTo("Hello") => 0
 * 			ㄴ "Java".compareTo("Hello") => 음수
 * 
 * 
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

public class 문자열배열_1 {

	public static void main(String[] args) {

		char[] ch =  {'a', 'B', 'c', 'd','E', 'K'};
		
//		for(char c : ch) {
//		if(c >= 'a' && c<= 'z') {
//		c = (char)(c - 32);
//		
//	}
//		System.out.print(c + " ");
//	}
		
		
		
		for(int i =0; i < ch.length; i++) {
			

			if(ch[i] >= 'a' && ch[i]<= 'z') {
				ch[i] = (char)(ch[i] - 32);
				
			}
			System.out.print(ch[i] + " ");
			
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(ch));
		
		String s = "aBcdEK";
		System.out.println(s.toUpperCase());
		
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));

		int[] arr2 = arr;
		System.out.println(Arrays.toString(arr2));
		arr2[0] = 100;
		arr2[1] = 200;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		System.out.println(arr);
		System.out.println(arr2);

		int[] arr3 = arr.clone(); //깊은 복사
		System.out.println(arr3); //메모리 주소가 다르다

		String s1 = "Hello";
		String s2 = "Java";
		int res = s2.compareTo(s2); // 같으면 0
		System.err.println(res);
		
		int aa = 100;
		int bb = 200;
		
		aa = bb;
		bb = aa;
		
		System.out.println(aa + "|" + bb);
		
		
	}

}
