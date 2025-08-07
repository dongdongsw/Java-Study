import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 버퍼 {
	
	public static BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
		
	}
	public static BufferedWriter getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}


}
