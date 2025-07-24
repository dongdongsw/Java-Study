
/*
 * (type)
 * 
 * 	(char)65 => A
 * 	(int)10.5 => 10
 * 
 * 	(double) => 10.0
 * 
 * 	큰 데이터형을 작은 데이터형으로 변경
 * 
 * 
 * 	연산자
 * 	(int)(10.5 + 10.5) => 21
 * 
 * 	(int)10.5 + 10.5 => 20.5
 * 
 * 	(int)10.5 + (int)10.5 => 20
 * 
 * 	=> 형변환 : 객체 지향에서 많이 나온다 ( 클래스 )
 * 
 * 
 */
public class 행변환연산자 {

	public static void main(String[] args) {

		char rand = (char)((Math.random()*26)+65); //0.0 ~ 0.99 사이에서 난수 발생
		System.out.println(rand);
	}

}
