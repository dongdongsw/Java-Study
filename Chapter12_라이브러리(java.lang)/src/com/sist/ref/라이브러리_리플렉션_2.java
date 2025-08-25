package com.sist.ref;

import java.lang.reflect.*;

class Sawon{
	private String name;
	public Sawon() {
		
	}
	public Sawon(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Sawon:sayHello Call... : " + name);
	}
}

public class 라이브러리_리플렉션_2 {

	public static void main(String[] args){
		
		try {
			Class cls = Class.forName("com.sist.ref.Sawon");
			
//			Constructor con = cls.getConstructor(String.class);
//			Object obj = con.newInstance("홍길동");
			
			Constructor con = cls.getConstructor();
			Object obj = con.newInstance();
			
			Method m = cls.getMethod("sayHello");
			//호출
			m.invoke(obj);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
