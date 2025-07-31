/*
 * 
 * 
 * 종료 => break, return, System.exit(0)
 * 
 * 
 */


public class 제어문_1 {

	public static void main(String[] args) {

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j<=3; j++) {
				if(j==2) {
//					break;
					continue;
					
				}
				System.out.println("i =" + i + ", j =" + j);
				break;
			}
		}
//		----------------------------
		for(int i = 1; i<=5; i++) {
			if(i == 3 || i == 4 || i ==5) {
				continue;
			}
			System.out.println(i);

		}
		
		
		
	}

}
