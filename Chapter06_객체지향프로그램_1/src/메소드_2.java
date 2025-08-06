
/*
 * 변수 / 데이터형 / 연산자 / 제어문 ==> 프로그램의 기본
 * ---------------------------
 * 관련된 데이터를 묶는다
 * 	ㄴ 같은 데이터형 (배열)
 * 	ㄴ 다른 데이터형 (클래스)
 * 관련된 명령문을 묶는다 (메소드)
 * 	ㄴ 만들지 못하는 부분이 존재
 * 	ㄴ 제공 : API 
 * ------------------------------묶어서 처리 => 객체
 * 
 * ㄴ react/ vue / next
 * ㄴ oracle / mysql
 * 
 *  리턴형 받기 => 기본형 / 배열 / 클래스 ( 상세보기 )
 *  사칙 연산
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_2 {

	public static BufferedReader getReader(){
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public static BufferedWriter getWriter(){
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	static int input(String msg, BufferedReader br, BufferedWriter bw) throws IOException{
		
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		return Integer.parseInt(br.readLine());
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	static int plus(int a, int b) {
		return a + b;
	}
	static int gop(int a, int b) {
		return a * b;
	}
	static String div(int a, int b){ //void는 값을 전달할 수 없기때문에 String 사용
		if(b == 0 ) {
			return "0으로 나눌 수 없습니다.";
			
		}
		else {
			return String.valueOf(a/(double)b);
//			bw.write(a +" / " +  b + " = " + (a / (double)b));
//			return; // 없어도 됨
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = 메소드_2.getReader();
		BufferedWriter bw = 메소드_2.getWriter();
		
		
		int a = input("첫 번째 정수 입력:", br , bw);
		int b = input("두 번째 정수 입력:", br , bw);
		
		bw.write("첫 번째 입력 정수 = " + a + "  /  ");
		
		bw.write("두 번째 입력 정수 = " + b);
		bw.newLine();
		
		bw.write("연산자 입력(+, -, *, /) : ");
		bw.flush();
		
		String c = br.readLine();
		switch(c) {
		case "+" -> {
			bw.write(a +" + " +  b + " = " + plus(a,b));

		}
		case "-" -> {
			bw.write(a +" - " +  b + " = " + minus(a,b));

		}
		case "*" -> {
			bw.write(a +" * " +  b + " = " + gop(a,b));

		}
		case "/" -> {
			bw.write(a +" / " +  b + " = " +  div(a,b));

		}
		}
		
		
		br.close();
		bw.close();
		
	}

}
