/*
 * 정수를 입력 받아서 2진법 출력
 * => 10 => 0000 0000 0000 1010
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_2 {
	
		public static BufferedReader getReader() {
			return new BufferedReader(new InputStreamReader(System.in));
		}
		
		public static BufferedWriter getWriter() {
			
			return new BufferedWriter(new OutputStreamWriter(System.out));
		}
		
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = 메소드_2.getReader();
		BufferedWriter bw = 메소드_2.getWriter();
		
		bw.write("정수를 입력하시오(0~32767) :");
		bw.newLine();
		bw.flush();
		
		int num = Integer.parseInt(br.readLine());

		/////////////////처리 =====2
		//저장 준비
		int[] bin = new int[16];
		//배열 => 뒤
		int index = bin.length-1;
	
		
		//반복 횟수가 지정이 안되서
		while(true) {
			bin[index] = num % 2;
			
			num /= 2;
			
			if(num == 0) {
				break;
			}
			index--;
		}
		
		////////처리
		///출력
		bw.write("===== 결과값 =====");
		bw.newLine();
		bw.flush();
		for(int i = 0; i< bin.length; i++) {
			if(i%4 ==0 && i!=0) {
				bw.write(" ");
			}

			
			bw.write(bin[i] + " ");
			bw.flush();
		}
	
	}

}
