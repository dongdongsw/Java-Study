package com.sist.anno;
import java.lang.reflect.Method;
/*
 * 	1. 특별한 형태의 인터페이스
 * 
 * 	2. 어노테이션의 종류 (어노테이션 : 정보를 언제까지 간직하고 있을지를 정함)
 * 		표준 어노테이션 : 자바에서 제공
 * 		라이브러리 어노테이션 : lombok , spring
 * 		메타 어노테이션 : 어노테이션을 만드는 경우
 * 		------------ @Retention
 * 						ㄴ 사용 범위
 * 						ㄴ 컴파일시에만 사용
 * 							@Retention(CLASS) : 주석같이 작성되다가 컴파일되면 주석같이 사라짐
 * 							@Retention(SOURCE) : 메모지 같은 건데 컴파일하면 메모지가 사라짐
 * 						ㄴ 런타임까지 사용
 * 							@Retention(RUNTIME) ==> 프로그램 종료시해도 남아있는 스티커 개념
 * 
 * 					 @Target
 * 						ㄴ @Target(ElementType.TYPE) : 클래스 구분 
 * 						ㄴ @Target(ElementType.FIELD) :  변수 구분 
 * 						ㄴ @Target(ElementType.METHOD) : 메소드 구분 
 * 
 * 			사용자 정의 : 개발자가  만든다
 * 						------------
 * 	
 * 
 * 
 */
import java.util.*;

class Service{
	
	@MyAnno("login")
	public void aaa() {
		System.out.println("로그인 요청");
	}
	
	@MyAnno("join")
	public void bbb() {
		System.out.println("회원가입 요청");
	}
	
	@MyAnno("logout")
	public void ccc() {
		System.out.println("로그아웃 요청");
	}
	public void list() {
		System.out.println("리스트");
	}
	public void detail() {
		System.out.println("상세보기 출력");
	}
}

public class 라이브러리_어노테이션_2 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("입력(login, join, logout):");
		String cmd = scan.next();
		
		Class cls = Class.forName("com.sist.anno.Service");
		//클래스의 모든 정보 수집
		Object obj = cls.getDeclaredConstructor().newInstance();
		//동적 객체 생성 => Service s = new Service
		//메소드 제어
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods) {
			
			String name = m.getName();
//			System.out.println(name);
			
			if(name.equals(cmd)) {
				m.invoke(obj, null);
				break;
			}
			
			
//			System.out.println(m.getName());
//			MyAnno my = m.getAnnotation(MyAnno.class);
//			if(my.value().equals(cmd)) {
//				m.invoke(obj, null);
//				break;
//			}
		}
		
	}

}














