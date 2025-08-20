package com.sist.lang;
/*
 * 
 * 	1. 라이브러리 => 자바에서 지원하는 클래스의 집합
 * 		ㄴ java.lang : import 생략 가능
 * 			ㄴ Object  
 * 			ㄴ String  
 * 			ㄴ StringBuffer 
 * 			ㄴ Math 
 * 			ㄴ System 
 * 			ㄴ Wrapper
 * 				ㄴ Integer => int
 * 				ㄴ Double  => double
 * 				ㄴ Byte, Short 
 * 				ㄴ Boolean => boolean
 * 				ㄴ Float => float
 * 		ㄴ java.util
 * 			ㄴ StringTokenized
 * 			ㄴ Date / Calendar
 * 			ㄴ Collection
 * 				ㄴ List / Set / Map 
 * 			
 * 		ㄴ java.io
 * 			ㄴ 파일 입출력
 * 				ㄴ FileInputStream / FileReader
 * 				ㄴ FileOutputStream / FileWriter
 * 				ㄴ BufferedReader / BufferedWriter 
 * 		ㄴ java.net
 * 			ㄴ URLEncoder
 * 			ㄴ URL
 * 			ㄴ Socket
 * 		ㄴ java.sql
 * 			ㄴ Connection
 * 			ㄴ PreparedStatement
 * 			ㄴ ResultSet
 * 		ㄴ java.text
 * 			ㄴ MessageFormat
 * 			ㄴ DecimalFormat
 * 			ㄴ ChoiceFormat
 * 
 * 		--------------------------------------------
 * 		ㄴ ★★어노테이션★★
 * 		ㄴ ★★람다식★★
 * 		ㄴ ★★리플렉션★★
 * 		ㄴ ★정규식★
 * 		--------------------------------------------
 * 		★★★Collection (웹에서 핵심임)★★★
 * 		--------------------------------------------
 * 		Thread / 네트워크 / 데이터베이스
 * 
 * 
 * 	Object : 모든 클래스의 상위 클래스	
 * 						--------- 
 * 						라이브러리 / 사용자 정의 => Object로부터 상속을 받는다
 * 
 * 		ㄴ 1) 주요기능
 * 				ㄴ ★★★finalize() : 소멸자 함수
 * 				ㄴ ★★★clone() : 복제할 때
 * 				  ------------------
 * 				git clone repository 주소
 * 				
 * 				ㄴ ★★★equals : 객체비교
 * 				ㄴ getClass() : 클래스의 정보 / 객체생성
 * 				ㄴ ★★★toString() : 문자열 변환
 * 				ㄴ ★★hashcode() :
 * 				-------------------------모든 클래스에 사용이 가능하게 내장
 * 
 * 		ㄴ 2) 모든 클래스의 상위 클래스
 * 			 ---------- 클래스를 리턴하는 메소드가 있는 경우(Object)
 * 			 ---------- 형변환
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
 * 
 * 
 * 
 * 
 * 
 */
//public class 라이브러리_1 /*extends Object 생략되어 있음*/{
//
//	public 라이브러리_1(){
//
//	
//	}
//	
//	public void aaa() {}
//	public void bbb() {}
//	public void ccc() {}
//	public void ddd() {}
//	public void eee() {}
//	
//	
//	public static void main(String[] args) {
//		
//		Object obj = new 라이브러리_1();
//		
//	}
//
//}

class Sawon implements Cloneable{
	String name;
	String sex;
	public Sawon() {
		name = "홍길동";
		sex = "남자";
	}
	
	public void print() {
		System.out.println("이름 :" + name);
		System.out.println("성별 :" + sex);
	}
	
	@Override
	// 메소드 호출시에 예외처리를 한 후에 사용
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
class Member{
	int mno = 10;
}
public class 라이브러리_1 /*extends Object 생략되어 있음*/{

	public static void getMno(Member m) {
		m.mno = 100; //배열 (주소) => 예외 : String (Call By Value)
	}
	
	
	public static void main(String[] args) {
		
		Sawon hong = new Sawon();
		
		hong.print();
		hong.name = "박문수";
		hong.sex = "남자";
		
		try {
			
			Sawon shim = (Sawon)hong.clone(); // 초기값이 같은 메모리 => 복제 => 새로운 메모리 생성0
			
			//prototype
			shim.print();
			shim.name = "심청이";
			shim.name = "여자";
			Sawon kim = shim;	// Call by Reference : 주소 참조
			// 별칭 => 같은 주소 제어
			kim.name ="김두한";
			kim.sex = "남자";
			shim.print();
			kim.print();
		}
		
		catch(Exception e) {
			
		
		}
		Member mm = new Member();
		getMno(mm); // m = mm => 같은 메모리 제어
		System.out.println(mm.mno);
		
	}

}
