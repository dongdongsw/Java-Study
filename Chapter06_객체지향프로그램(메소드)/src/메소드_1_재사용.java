
/*
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class 메소드_1_재사용 {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = 메소드_1_변환.getReader();
		BufferedWriter bw = 메소드_1_변환.getWriter();
		
		
		
		int year = 메소드_1_변환.input("년도",br,bw);
		int month = 메소드_1_변환.input("월",br,bw);
		int day = 메소드_1_변환.input("일",br,bw);
		
		System.out.println(year + "년도 " + month + "월 " + day + "일");
	}
}
