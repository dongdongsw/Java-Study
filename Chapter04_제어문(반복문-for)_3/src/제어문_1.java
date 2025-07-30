/*
 * 이차 for 문
 * 
 * 
 */
public class 제어문_1 {

	public static void main(String[] args) {
	
		System.out.println("===========구구단==========");
		
		for(int i = 1; i <=9; i++) {
			for(int a = 1; a <=9; a++) {
				
				System.out.printf("\t%d * %d = %d ",i,a,i*a);
				if(a==9) {
					System.out.println(" ");

				}
			}
				
		}
		
	}

}
