package com.sist.lang;

class Student{
	
	int hakbun = 1;
	String name = "홍길동";
	
	public Student() {
		System.out.println("객체 생성 !!");
	}
	
	public void print() {
		System.out.println("학번 :" + hakbun);
		System.out.println("이름 :" + name);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸 !!");
	}
	//자동 호출 => 객체 소멸
}

public class 라이브러리_2 {

	public static void main(String[] args) throws Throwable{

		Student s = new Student();
		s.finalize();
		s.hakbun=2;
		s.name = "박문수";
		s.print();
		
		s=null; // 주소를 없애버림
//		s.hakbun=3;
//		s.name = "박문수2";
//		s.print();
		
		System.gc();
	}

}
