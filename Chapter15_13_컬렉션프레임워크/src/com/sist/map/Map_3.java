package com.sist.map;
/*
 * 클래스 관리자0
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

import java.util.*;

interface I{
	public void execute() {
		
	}
}

class a implements I{
	@Override
	public void execute() {
		System.out.println("A : execute ... Call");
	}
}

class b implements I{
	@Override
	public void execute() {
		System.out.println("B : execute ... Call");
	}
}

class c implements I{
	
	@Override
	public void execute() {
		System.out.println("C : execute ... Call");
	}
}

class d implements I{
	
	@Override
	public void execute() {
		System.out.println("D : execute ... Call");

	}
}

class Container{
	Map map = new HashMap();
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
		
	}
	
	public Object getBeans(String key) {
		
		return map.get(key);
		
		
	}
}

public class Map_3 {

	public static void main(String[] args) {

		Container c = new Container();
		A a = (A)c.getBeans("a");
		a.execute();
		
	}

}
