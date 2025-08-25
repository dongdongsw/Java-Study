package com.sist.gn;

/*
 * 재네릭
 * 	1) 정의
 * 		클래스나 메소드를 정의 할때 사용할 데이터형을 표준화 해서 사용
 * 		ㄴ 재사용성 / 데이터형의 안전성
 * 		ㄴ 데이터형을 통일화 시키는 방법
 * 		ㄴ 형 변환 x
 * 		ㄴ 소스가 간결하고 가독성이 뛰어나다
 * 
 * 	2) 사용법
 * 		클래스<반드시 클래스형만 사용>
 * 			--------------------------int => Integer
 * 
 * 	3) 전체 데이터형이 변경
 * 		class Box<T>{		=> TYPE : 실제 존재
 * 			T t;
 * 			public void set(T t){
 * 				this.t = t;0
 * 			}
 * 
 * 			public void getT(){
 * 				return t;
 * 			}
 * 		}
 * 
 * 	Box box = new Box() => T (Object)
 * 	Box<String> box = new Box<String>()
 * 		T => String 변환
 * 		-- qusrud : 매개 변수 / 리턴형이 변경
 * 
 * 
 */
//class Box<T>{
//	
//	private T t;
//	public void setT(T t) {
//		this.t = t;
//	}
//	
//	public T getT(){
//		return t;
//	}
//	
//}

import java.util.*;

class Sawon{
	public Sawon getSawon() {
		return new Sawon();
	}
	
	public void setSawon(Sawon s) {
		
		
	}
}

public class 제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<String> box = new Box<String>();
//		ArrayList<Sawon> list = new ArrayList<Sawon>();
		ArrayList<?> list = new ArrayList<>();
		
//		list.
		
	}

}
