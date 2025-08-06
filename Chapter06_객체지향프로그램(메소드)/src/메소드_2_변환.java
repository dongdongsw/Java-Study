import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_2_변환 {
	
	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	static int input(BufferedReader br, BufferedWriter bw) throws IOException{
		
		bw.write("정수입력 (0~32767) :");
		bw.flush();
		return Integer.parseInt(br.readLine()); 
	}
	
	static int[] binary(int num) {
		
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
		
		return bin;
}
	
	static int[] binary(int num, int[] bin) {
				
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
				
				return bin;
	}
	
	static void output(int bin[], BufferedWriter bw) throws IOException{
		for(int i = 0; i< bin.length; i++) {
			if(i%4 ==0 && i!=0) {
				bw.write(" ");
			}

			
			bw.write(bin[i] + " ");
			
		}
		bw.flush();
	}
	
	
	static void process(BufferedReader br, BufferedWriter bw) throws IOException{
		
		int num = input(br, bw);
		//저장 준비
		int[] bin = new int[16];
		binary(num,bin);
		output(bin,bw);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = 메소드_2_변환.getReader();
		BufferedWriter bw = 메소드_2_변환.getWriter();
		
		process(br,bw);
		
		
		br.close();
		bw.close();
	}

}
