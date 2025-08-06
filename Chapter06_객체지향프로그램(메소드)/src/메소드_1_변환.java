

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_1_변환 {

	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	static int input(String s, BufferedReader br, BufferedWriter bw) throws IOException{
		bw.write(s + "입력 :");
		bw.flush();
		
		return Integer.parseInt(br.readLine());
	}
	
	
	static void process(BufferedReader br,BufferedWriter bw) throws IOException{
		int kor = input("국어",br,bw);
		int eng = input("영어",br,bw);
		int math = input("수학",br,bw);

		
		bw.write("국어 점수 :" + kor);
		bw.newLine();
		bw.flush();
		bw.write("영어 점수 :" + eng);
		bw.newLine();
		bw.flush();
		bw.write("수학 점수 :" + math);
		bw.newLine();
		bw.flush();
		
		int total = total(kor, eng, math);
		double avg = avg(total);
		char score = score(avg);
		
		bw.write("총점 :" + total);
		bw.newLine();
		bw.write("평균 :" + avg);
		bw.newLine();
		bw.write("학점 :" + score);
		bw.newLine();
	}
	
	

	public static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	public static double avg(int total) {
		
		return total / 3.0;
	}
	
	public static char score(double avg) {
		return switch((int)(avg/10)) { // int를 넣은 이유는 정수, 문자, 문자열
		case 10,9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = 메소드_1_변환.getReader();
		BufferedWriter bw = 메소드_1_변환.getWriter();
		
		process(br, bw);
		
		
		br.close();
		bw.close();
		
		
	}

}
