import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 메소드_3 {
	
	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	
	static void gugudan(BufferedWriter bw) throws IOException{
		
		for(int i = 1; i< 10; i++) {
			
			for(int j = 1; j < 10; j ++) {
				bw.write(j + "*"+ i + " = " + (j*i) + " ");
				
			}
			bw.newLine();
		}
		
		
	}
	
	
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = 메소드_3.getReader();
		BufferedWriter bw = 메소드_3.getWriter();
		
		
		gugudan(bw);
		
		br.close();
		bw.close();
	}

}
