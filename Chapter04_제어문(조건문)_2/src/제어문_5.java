
/*
 * 
 * 반복문 들어가기 전
 * 
 */

public class 제어문_5 {

	public static void main(String[] args) {

		int count_1 = 0;
		int count_2 = 0;
		
		int change = (int)(Math.random()*2);
		char c = ' ';
		
		if(change == 0) {
			 c = (char)((Math.random()*26) + 65);
		}
		else {
			c = (char)((Math.random()*26) + 97);
		}
		
//		----------------------------------------------------- 
		if(c >= 'A' && c <= 'Z') {
			count_1++;
		}
		else {
			count_2++;
		}
		
		
		change = (int)(Math.random()*2);
		c = ' ';
		if(change == 0) {
			 c = (char)((Math.random()*26) + 65);
		}
		else {
			c = (char)((Math.random()*26) + 97);
		}
		
//		-----------------------------------------------------
		if(c >= 'A' && c <= 'Z') {
			count_1++;
		}
		else {
			count_2++;
		}
		
		
		change = (int)(Math.random()*2);
		c = ' ';
		if(change == 0) {
			 c = (char)((Math.random()*26) + 65);
		}
		else {
			c = (char)((Math.random()*26) + 97);
		}
		
//		-----------------------------------------------------
		if(c >= 'A' && c <= 'Z') {
			count_1++;
		}
		else {
			count_2++;
		}
		
		
		change = (int)(Math.random()*2);
		c = ' ';
		if(change == 0) {
			 c = (char)((Math.random()*26) + 65);
		}
		else {
			c = (char)((Math.random()*26) + 97);
		}
		
//		-----------------------------------------------------
		if(c >= 'A' && c <= 'Z') {
			count_1++;
		}
		else {
			count_2++;
		}
		
		
		change = (int)(Math.random()*2);
		c = ' ';
		if(change == 0) {
			 c = (char)((Math.random()*26) + 65);
		}
		else {
			c = (char)((Math.random()*26) + 97);
		}
		System.out.println("대문자 : " + count_1);
		System.out.println("소문자 : " + count_2);
		
	}

}
