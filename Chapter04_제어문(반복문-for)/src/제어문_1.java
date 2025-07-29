/*
 * 
 * for : 반복횟수가 지정된 경우
 * while : 반복 횟수가 없는 경우
 * 
 * do while : 
 * 
 */


public class 제어문_1 {

	public static void main(String[] args) {

		char a = 'A';
		
		for(int i = a; i < a+26; i++) {
			
			System.out.print((char)i);
			
		}
		System.out.print( "\n");

//한글은 안됨
//1부터 10 출력		
		for(int i = 1; i <=10; i++) {
			System.out.print(i);

		}
		System.out.print( "\n");
//홀수 출력
		for(int i = 1; i <=10; i+=2) {
			System.out.print(i);

		}
		
		System.out.print( "\n");
//짝수 출력
		for(int i = 2; i <=10; i+=2) {
			System.out.print(i);

		}
		
			
		
	}

}
