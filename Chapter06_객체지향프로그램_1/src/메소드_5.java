/*
 * 암호화 => encoding => decoding
 * 시저스암호화 => 3칸 이동 ABC => DEF => ed4559(짧고 강력한 보안 기능), Rsa
 * 
 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDIGCAEQRRg7MgwIAhAjGCcYgAQYigUyBggDECMYJzIGCAQQRRg9MgYIBRBFGD0yBggGEEUYPDIGCAcQRRhB0gEHNzg4ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8
 * 자바 = q=%EC%9E%90%EB%B0%94 
 *
 *
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

public class 메소드_5 {

	static String encoder(String s) throws Exception{
		return URLEncoder.encode(s, "UTF-8");
		
	}
	
	static String decoder(String s) throws Exception{
		return URLDecoder.decode(s, "UTF-8");
	}
	
	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	
	public static void main(String[] args) throws Exception{  
		BufferedReader br = 메소드_5.getReader();
		BufferedWriter bw = 메소드_5.getWriter();
	
		String s = "자바";
//		String en = URLEncoder.encode(s, "UTF-8");
//		bw.write(en);
//		bw.newLine();
//		String ko = URLDecoder.decode(s, "UTF-8");
//		bw.write(ko);
//		bw.newLine();

		bw.write(encoder(s));
		bw.newLine();

		bw.write(decoder(s));
		bw.newLine();

		int a = 10;
		int b = 0;
		try { //에러가 났을 때 통과 시키기 위해 (에러 복구)
			bw.write(a/b);				
		}catch(Exception e) {// 에러를 피할려고
			
		}
			
			bw.newLine();

		bw.write("프로그램 종료 ");		
		bw.newLine();

		br.close();
		bw.close();
		
	}

}
