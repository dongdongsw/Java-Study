package com.sist.exception;
/*
 * finally 없이 자동 닫기 => 파일에서만 가능
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
// import java.net java.io java.sql => CHeckException

public class 예외처리_4 {

	public static void main(String[] args) {

		//자동 리소스 
		try(FileReader fr = new FileReader("C:\\Users\\sist\\git\\Java-Study\\Chapter11_예외처리_1_\\src\\com\\sist\\exception\\예외처리_4.java");) 
		{
			int i = 0;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
