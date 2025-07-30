/*
 * 2차 for문
 * 
 * 	1111
 * 	1111
 * 	1111
 * 	1111
 * 	1111
 * ---------------------------------------
 *  *
 * 	**
 * 	***
 * 	****
 * ----------------------
 * i = 줄수 j = 별표
 * for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//
//		}
 * 
 * 
 * 
 * 	****
 * 	***
 * 	**
 * 	*
 * -------------------------
 *  i = 줄수 j = 별표
 	for(int i = 1; i <= 4; i++) {
			for(int j = 4; j >= 5-i; j--) {
				System.out.print("*");
			}
				System.out.println("");
	
			}
		
 * 
 * 
 * 
 *
 * 		*
 * 	   **
 * 	  ***
 * 	 ****
 * --------------------------
 * i = 줄수 j = 공백  = 별표 k = i
 * i + j =4 => j = 4-i 별
 *  
 *  
 *  
 for(int i = 4; i <= 1; i--) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");

			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");

			}
		}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	 ****
 * 	  ***
 * 	   **
 * 		*
 * --------------------------------------
 *	i = 줄수 / j = 공백 / k = 별표
 *  1			0		4
 *  2			1		3
 *  3			2		2
 *  4			3		1
 *  
 * i = j+1 => j = 1-i => k =  5 - i
 * 
 *  for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j <= 5-i; j++) {
//				System.out.print("*");
//			}
///			for(int j = 4; j <= 5-i; j++) {
///				System.out.print(" ");
///			}
//			System.out.println("");
//
//		}
 * 
 * 
 * 
 *
 * 		*
 * 	   ***
 * 	  *****
 * 	 *******
 *    *****
 * 	   ***
 * 	    *
 * 
 * ----------------------------------------
 * 
 * 	  *****
 *     ***
 * 	    *
 * 	   ***
 * 	  *****
 * 
 * -------------------------------------------
 * 
 * 	 *   *
 *   ** **
 *   *****
 *   ** **
 * 	 *   *
 */
public class 제어문_4 {

	public static void main(String[] args) {
		int c = 0;
		
		for(int i = 1; i <=6; i++) { 
			for(int j = 1; j <=6; j++) {
				int a = (int)(Math.random()*6)+1;
				System.out.print(a + "와");

				int b = (int)(Math.random()*6)+1;
				System.out.println(b + " ");

				if(a + b ==3) {
					c += 1;
					
				}
	
		
		}
			}
		System.out.println(c);

		
	}

}
