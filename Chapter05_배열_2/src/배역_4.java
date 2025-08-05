import java.util.Arrays;

public class 배역_4 {

	public static void main(String[] args) {
		
		int[] com = new int[5];
		
		for(int i = 0; i<com.length; i++) {
			
			com[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("정렬전");
//		for(int i : com) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n======정렬후");
//		for(int i = 0; i< com.length-1; i++) {
//			for(int j = i; j < com.length; j++) {
//				if(com[i] > com[j]) {
//				int temp = com[i];
//				com[i] = com[j];
//				com[j] = temp;
//				}
//			}
//		}
		Arrays.sort(com); // 오름차순

		for(int i = com.length; i >= 0; i++) { //내림차순으로 바꿈
			for(int k : com) {
				System.out.print(k + " ");
			}
		}
	}

}
