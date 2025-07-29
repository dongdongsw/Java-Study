/*
 * for문 => 향상된 for - each문
 * 		=> 배열 / 컬렉션
 * 
 * 
 * 
 */



public class 제어문_1 {

	public static void main(String[] args) {

		String[] names = {"홍길동","심청이","김두한","박문수","강감찬"};
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
		}
		System.out.println("================");
		for(String name : names) {
			System.out.println(name);
			
			
		}
		
		
		
	}

}
