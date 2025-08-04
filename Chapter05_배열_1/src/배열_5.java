/*
 * 10개의 임의의 정수 저장 ==> 총합 / 평균
 * 
 * 
 * 
 */
public class 배열_5 {

	public static void main(String[] args) {

		int sum = 0;
		
		//배열 선언
		int[] arr = new int[10];
		//배열 초기화
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");
//			sum += arr[i];
		}
		//배열의 총합/ 평균
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("\n총합 : " + sum);
		System.out.printf("평균 : %.2f", sum/10.0);
		
	}

}
