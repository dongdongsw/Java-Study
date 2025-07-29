
public class 문제8 {
	public static void main(String[] args) {
		int count = 0;
		int i;
		int b = 0;
		int a = 0;
		for(i = 1; i <= 10; i++ ) {
			count++;
			if(count % 2 ==0 ) {
				a = -i;
				b += a;
			}
			else {
				a = +i;
				b += a;
				if(i==1) {
					
				}
				else
					System.out.print("+");

			}
			
			System.out.printf("%d",a);
			
		}
		System.out.print("까지의 합 :" + b);
		
}
}