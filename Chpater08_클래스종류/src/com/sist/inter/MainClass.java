package com.sist.inter;
/*
 * 인터페이스 : 추상클래스의 일종 => 클래스와 동일 
 *   --------  --------
 *   : 단일 / 다중 상속 => 클래스(단일) , 인터페이스(다중)
 *   1) 인터페이스
 *      인터페이스로 상속 
 *      interface A
 *      interface B extends A
 *      클래스로 상속 
 *      --------------
 *      interface A
 *      class B implements A
 *      
 *      interface A
 *      interface B extends A
 *      interface C extends B   => C (A,B)
 *      
 *      interface A
 *      interface B
 *      interface C extends A,B
 *      -------------------------
 *      
 *      interface A
 *      interface B
 *      class C
 *      class D extends C implements A,B
 *                        ----------------- 다중 상속 
 *      ----------------- 단일 상속 
 *      
 *      
 * 		인터페이스 장점 (면접 88%)
 * 		-----------
 * 		1. 기능 설계 => 선언만 된 메소드
 * 			ㄴ 개발시간이 단축
 * 			ㄴ 6개월 (개발)
 * 				ㄴ 요구사항 분석 / 데이터베이스 설계 => 3.5
 * 				ㄴ 개발 => 1.5
 * 				ㄴ 테스트 / 배포 => 1.5
 * 
 * 		2. 표준화가 가능 : 모든 개발자 같은 메소드 사용
 * 			ㄴ 스프링 => 결합성이 낮은 프로그램 
 * 						-------------------------에러가 발생 => 다른 클래스에 영향이 없다
 * 			
 * 		3. 소스의 통일화 (형식) => 분석하기 쉽다.
 * 			ㄴ 1) 회사 소스 => 분석
 * 			ㄴ 2) 메뉴얼
 * 
 * 		4. 서로 다른 클래스를 연결해서 사용이 가능
 * 
 * 		5. 유지보수가 뛰어나다
 * 		
 * 		6. 독립적으로 사용이 가능(리모콘)
 * 			ㄴ Green Project
 * 				ㄴ 모든 기계를 한개의 리모콘으로 제어
 * 
 * 		7. 관련된 클래스를 모아서 관리
 * 				ㄴ List => 인터페이스
 * 					ㄴ ArrayList 
 * 					ㄴ Vector 
 * 					ㄴ LinkedList 
 * 					ㄴ Stack 
 * 					ㄴ Queue
 * 				ㄴ 구현된 클래스 => 컬렉션
 * 				ㄴ 웹 3대 클래스 
 * 					ㄴ String
 * 					ㄴ Integer
 * 					ㄴ ArrayList
 * 
 * 				ㄴ 상속 
 * 					ㄴ 인터페이스 => 인터페이스
 * 								ㄴ extends
 * 					ㄴ 인터페이스 => 클래스
 * 								ㄴ implements
 * 					ㄴ 클래스 => 인터페이스 (x)
 * 
 * 					ㄴ 다중상속 : ,로 구분
 * 					  ------- 인터페이스만 존재
 * 					  클래스 , 인터페이스
 * 						class A extends B implements C,D,E
 * 
 * 				=> 오버라이딩
 * 					ㄴ 상속 => 클래스 / 인터페이스
 * 								extends implements
 * 						메소드명이 동일
 * 						매개변수 동일
 * 						리턴형 동일
 * 						접근 지정어는 확장만 가능 => public
 * 						오버라이딩이 된 경우에는 메소드 호출은 생성자 타입
 * 
 * 						A a = new B()
 * 							a => B가 가지고 있는 메소드 호출
 * 							-------------------------
 * 							
 * 						형식) only public 
 * 						public interface A{
 * 							-------변수(상수형 변수)-------
 * 
 * 							(public static final) int a = 10;
 * 
 * 							----------------------------생략시에는 자동 추가
 * 
 * 							(public static) final int b = 100;
 * 							(public final) static int c = 1000;
 * 							// 나머지 접근 지정어는 사용금지
 * 
 * 							--------선언만된 메소드-----------
 * 
 * 							(public abstract) void aaa();
 * 							=> 오버라이딩 => 
 * 
 * 							----------구현된 메소드--------
 * 							jdk 1.5 => 개발자의 요청 => 추상 클래스가 사용빈도가 낮아짐
 * 
 * 							(public)default void bbb(){
 * 
 * 
 * 							}
 * 
 * 
 * 							----------------------------
 * 
 * 							(public) static void ccc(){
 * 
 * 
 * 							}
 * 
 * 							----------------------------
 * 							}
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass extends JFrame 
implements ActionListener,MouseListener,KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
