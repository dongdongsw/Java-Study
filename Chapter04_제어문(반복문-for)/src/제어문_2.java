
/*
 * for(초기값; 조건식; 증감식)
 * {
 * 		반복수행문장 
 * }
 * 		front-End : for문
 * 		Back-End : while문
 * 
 */

public class 제어문_2 {
	public static void main(String[] args) {
		int sum = 0, even = 0, odd = 0, hol=0, cop = 0,sev = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i%2 == 0) {
				even += i;
			}
			else if(i % 3 ==0) {
				hol += i;
			}
			else if(i % 5 ==0) {
				cop += i;
			}
			else if(i % 7 ==0) {
				sev += i;
			}
			else {
				odd+=1;
			}
			
		}
		System.out.println("1에서부터 100까지의 총합 : " + sum);
		System.out.println("1에서부터 100까지의 짝수합 : " + even);
		System.out.println("1에서부터 100까지의 홀수합 : " + odd);
		System.out.println("1에서부터 100까지의 3의 배수합 : " + hol);
		System.out.println("1에서부터 100까지의 5의 배수합 : " + cop);

		
	}
}
