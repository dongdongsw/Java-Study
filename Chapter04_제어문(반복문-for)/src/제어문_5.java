/*
 * 
 * 
 * 
 * 
 */

import java.util.*;

public class 제어문_5 {

	public static void main(String[] args) 
	throws Exception
	{
		
		for(int i = 1; i<=6; i++) {
			int a = (int)((Math.random()*45)+1);
			Thread.sleep(1000);
			System.err.printf("로또 번호 %d번째 : %d\n",i,a);
		}
		
		
	}

}
