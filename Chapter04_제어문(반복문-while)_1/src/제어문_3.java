


import java.io.FileReader;
import java.util.*;

public class 제어문_3 {

	public static void main(String[] args) throws Exception

	{
		FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter04_제어문(조건문)_3\\src\\제어문_1.java");
				
		int i = 0;
		while((i= fr.read())!= -1) {
			System.out.print((char)i);
		}
				
				
				
	}

}
