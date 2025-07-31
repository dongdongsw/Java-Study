/*
 * do~ while : 자바에서는 사용 빈도가 없다.
 * 
 * 		ㄴwhile의 단점을 보완
 * 
 * while : 먼조 조건 처리
 * do ~ while : 나중에 조건 처리
 * 
 * 형식 )
 * 		초기값 
 * 		int a= 10;
 * 		while(조건식) {
 * 			반복 실행문장
 * 			증감식
 * 		}
 * 
 * 		초기값
 * 		do
 * 		{
 * 			반복 실행문장
 * 			증감식
 * 		} while(조건식);
 * 		
 * 
 * 
 * 
 */



public class 제어문_7 {

	public static void main(String[] args) {

		System.out.println("======== for =========");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.print("\n============ while ============= ");
		int i = 1;
		while(i<=10) {
			System.out.println(i + " ");
			i++;
		}
		System.out.print("\n============ do ~ while ============= ");
		i = 1;
		do {
			System.out.println(i + " ");
			i++;
		}while(i <= 10);
		
	}

}
