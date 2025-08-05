/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		System.out.println("====== 일반 for ======");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.println("======== for-each ========");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======== To String ========");
		System.out.print(Arrays.toString(arr));
		
	}

}
