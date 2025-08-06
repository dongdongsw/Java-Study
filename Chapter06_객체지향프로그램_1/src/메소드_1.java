/*
 * 사용자로부터 정수(2~9)를 받아서 해당 구구단 출력
 * -------------------------------------
 * 		1) void => 메소드 안에서 처리
 * 		2) String으로 전송
 * 		3) 배열
 *  
 *  =========> 리턴형 (X) 매개변수 (O)
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_1 {

	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	static void gugudan(int dan, BufferedWriter bw) throws IOException{
		
//		System.out.println("사용자로부터 받은 값 : ");
		bw.write("사용자로부터 받은 값 : " + dan);
		bw.newLine();

//		System.out.println("gugudan() : 진입");
		bw.write("gugudan() : 진입");
		bw.newLine();

		for(int i = 1; i < 10; i++) {
			
//			System.out.println(dan + " * " + i + " = " + (i*dan));
			bw.write(dan + " * " + i + " = " + (i*dan));
			bw.newLine();

			
		}
//		System.out.println("gugudan() : 종료");
		bw.write("gugudan() : 종료");
		bw.newLine();

	}
	static void process(BufferedReader br, BufferedWriter bw) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		bw.write("process() : 진입");
		bw.newLine();
		
//		System.out.print( "2 ~ 9 사이의 정수 입력 :");
		bw.write("2 ~ 9 사이의 정수 입력 :");
		bw.newLine(); //줄 바꿈

		bw.flush(); // 강제로 메시지 출력하는 기능
		
		int dan = Integer.parseInt(br.readLine());
		
		gugudan(dan, bw); 
		bw.write("process() : 종료");
		
		

	}
	
		public static void main(String[] args) throws IOException{
			BufferedReader br = 메소드_1.getReader();
			BufferedWriter bw = 메소드_1.getWriter();
			
//			System.out.print( "main() : 진입");
			bw.write("main() : 진입");
			bw.newLine();

			process(br, bw);
//			System.out.print( "main() : 종료");
			bw.write("main() : 종료");
			bw.newLine();
			br.close();
			bw.close();

		}
	}

