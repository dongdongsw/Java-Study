/*
 * 1. 기본
 * 	  ---- 변수 (데이터형) / 연산자/ 제어문
 * 		ㄴ 1) 변수 / 상수
 *					 ㄴ 여러개 => 열거형 (생성자) 
 * 			 ㄴ 여러개 => 배열
 * 			ㄴ 변수 : 수정이 불가능
 * 			ㄴ 상수 : 수정ㅇ ㅣ불가능 => final
 * 			ㄴ 변수 : 한개의 데이터를 저장하는 메모리 공간
 * 				ㄴ 메모리 크기 결정
 * 				 ---------- 데이터형
 * 		ㄴ 2) 데이터형
 * 				ㄴ 기본형 : 메모리에 데이터형
 * 					ㄴ 정수 저장
 * 						ㄴ byte => 8bit => 네트워크 송수신 / 웹
 * 						ㄴ int => 32bit => 일반 정수 => default
 * 						ㄴ long => 64bit : 금융권 / 증권
 * 					ㄴ 실수 저장
 * 						ㄴ double => 64bit => 소수점 15자리
 * 								 => 일반 실수 => 건축 => 정밀도
 * 					ㄴ 논리 저장
 * 						ㄴ boolean => 8bit => 조건 / 반복
 *  				ㄴ 문자 저장
 *  					ㄴ char => 16bit => 양수만 사용
 *  								ㄴ 0~ 65535
 *  					
 *  			ㄴ 참조형 : 여러개 데이터를 저장하는 경우 => 주소
 * 					ㄴ 배열 / 클래스 
 * 							ㄴ String 문자열
 * 								ㄴ String : 문자열 여러개 저장
 * 									ㄴ 클래스 형 => 메소드 지원
 * 									ㄴ 비교
 * 										ㄴ 1) equals : 대소문자 구분 비교
 * 											 	ㄴ 로그인 / 회원가입
 * 											 	ㄴ boolean equals (String s)
 * 													------			--------
 * 													리턴형			비교 대상 문자
 * 										ㄴ 2) contains : 대소문자 구분 => 포함 여부
 * 												ㄴ 검색 
 * 												ㄴ boolean contains(String fd)
 * 																	--------
 * 																	 포함 문자
 * 										ㄴ 3) startsWith : 대소문자 구분 => 시작 문자열
 * 												ㄴ자동완성기 /쿠키 찾기
 * 												ㄴ boolean startsWith(String s)
 * 																	 ---------
 * 																	 시작 문자열
 * 										ㄴ 4) endsWith : 대소문자 구분 => 끝 문자열
 * 												ㄴ 이미지의 확장자
 * 												ㄴ boolean ensWith(String s)
 * 																  ----------
 * 																	끝 문자열
 * 									ㄴ 제어
 * 										ㄴ 1) substring : 자르기
 * 												ㄴ css 
 * 												ㄴ 우편 번호 / 주소 / 생성AI
 * 												ㄴ 오버로딩 
 * 													ㄴ 같은 이름의 메소드가 여러개 존재
 * 													ㄴ 메소드명이 동일
 * 													ㄴ 리턴형은 관계 없다
 * 													ㄴ 매개변수의 갯수가 다르다
 * 													ㄴ 매개변수의 데이터형이 다른 경우
 * 													ㄴ 비슷한 기능
 * 
 * 
 * 
 * 
 * 										------------------------------------------
 * 									ㄴ 원형
 * 										ㄴ String substring(int beginIndex)
 * 											ㄴ 지정된 위치에서 마지막 문자까지 자른다
 * 											ㄴ 웹 => 필요(MVC)
 * 											ㄴ 브라우저에서 서버연결 : URL 주소
 * 											ㄴ login.jsp?id = aaa&pwd = 1234
 * 
 * 									ㄴ 찾기
 * 										ㄴindexOf : 지정된 문자, 문자열의 인덱스 번호 확인
 * 											ㄴ 앞에서 부터
 * 											ㄴ int indexOf(char c)
 * 											ㄴ int indexOf(String s)
 * 
 * 										ㄴ lastIndexOf : 지정된 문자, 문자열의 인덱스 번호 확인  
 * 											ㄴ 뒤에서 부터
 * 											ㄴ int lastIndexOf(char c)
 * 											ㄴ int lastIndexOf(String s)
 * 
 * 
 * 									ㄴ 변환
 * 										ㄴ replace : 문자 / 문자열
 * 											ㄴ String replace(char c, char c1)
 * 															------     ------
 * 															찾는 문자    변경할 문자
 * 											ㄴ String replace(String s, String s1)
 * 											ㄴ 오라클에 데이터 추가
 * 											   ----------------
 *												& =>  입력 => 크롤링 오라클에 첨부
 *												ㄴ 네트워크에서 채팅
 * 												ㄴ \n => \t
 * 	
 * 										ㄴ replaceAll : 문자 / 문자열 => 정규식
 * 											ㄴ String replaceAll(String regex, String s)
 * 									
 * 										ㄴ trim : 공백 문자
 * 										ㄴ valueOf : 모든 데이터형을 문자열 변환
 * 										
 * 
 * 									192.168.10.1
 * 									192.168.10.2
 * 									192.168.10.3
 * 									192.168.10.4
 * 									192.168.10.5
 * 									192.168.10.6
 * 									192.168.10.7
 * 									1111-1111
 * 									555.555.555
 * 									666.666.1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 정리_1 {

	public static void main(String[] args) {

		String url = "http://localhost:8080/member/login.jsp?id=admin&pwd=1234";
		String s = url.substring(url.lastIndexOf("/")+1, url.indexOf("?"));
		System.out.println(s);
		//getRequestParam("id")	
		s = url.substring(url.indexOf("=") + 1, url.indexOf("&"));
		System.out.println(s);
		s = url.substring(url.lastIndexOf("=") + 1);
		System.out.println(s);
		System.out.println(url);

		String ss = "blue|black|yellow|pink|green";
		String[] data = ss.split("|");
		for(String sss : data) {
			System.out.println(sss);
		}
}

}
