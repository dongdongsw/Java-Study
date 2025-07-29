/*
 * 
 * 
 * 
 */

import java.util.*;

public class 제어문_2 {
	public static void main(String[] args) {
		
		int max = 1;
		int min = 100;
		for(int i = 0; i < 10; i++) {
			int b = (int)((Math.random()*100)+1);
			System.out.print(b + " ");
			if(max < b)
				max = b;
			if(min > b)
				min = b;
		}
		System.out.println();
		System.out.println("==============결과==============");
		System.out.println("최대값 :" + max);
		System.out.println("최솟값 :" + min);

	}
	
}
