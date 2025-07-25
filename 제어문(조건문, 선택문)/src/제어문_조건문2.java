
/*
 * 
 * 
 * 
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		//알파벳 => 대문자 / 소문자
		
		int a = (int)(Math.random()*2);
		//a = 0과 1을 발생
		
		char c = ' ';
		
		if(a == 0) {
			
			c = (char)((Math.random()*26)+65);
//			System.out.println("대문자 : " + c);
		}
		if(a == 1) {
			
			c = (char)((Math.random()*26)+97);
//			System.out.println("소문자 : " + c);

		}
		System.out.println("======결과값======");
		if(c >= 'A' &&c <= 'Z')
			System.out.println("대문자 : " + c);
		if(c >= 'a' &&c <= 'z')
			System.out.println("소문자 : " + c);
		
	}

}
