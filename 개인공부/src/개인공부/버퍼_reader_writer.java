package 개인공부;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 버퍼_reader_writer {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int b = Integer.parseInt(br.readLine());
		
		bw.write(a);
		bw.newLine();
		
		b+= 10;
		
		bw.write(String.valueOf(b));
		
		
		
		
		bw.close();
		
	}

}
