/*
 * 10개의 임의의 정수를 10개 받아서 최댓값, 최소값
 * 데이터가 많은 경우 => 반복문 => 배열0
 * 
 */
public class 배열_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int max = 1;
		int num = 0;
		for(int i = 0; i< arr.length; i++) {
			
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");
			//최대 값이 있는 우치의 인덱스를 구하시오
			if(max < arr[i]) {
				max = arr[i];
				num = i;
			}
			

			
		}
		System.out.print("\n가장 큰 값은 :"+max + ", " + num + "번째이다");
		
		//5번째와 6번째의 값을 출력 => 둘의 차를 구하시오
		System.out.print(" 5번은 : "+arr[4] + " 6번은 : " + arr[5] + "\n두개의 차는 " + (arr[4] - arr[5]));
	}

}
