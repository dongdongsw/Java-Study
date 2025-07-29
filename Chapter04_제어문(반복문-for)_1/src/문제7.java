import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		int a = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 2; i <= 30; i+=2) {
			a = i;
			count += 1;
			System.out.print(a + " ");
			
			if(count % 3 == 0) {
				
				System.out.println(" ");
				
			}
		}
		
	}

}
