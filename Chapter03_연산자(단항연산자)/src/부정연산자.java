
/*
 * name 검색
 * 
 * SELECT * FROM member WHERE name='홍길동'
 * 	=> 오라클로 전송
 * 	=> 결과값을 가지고 온다
 * 
 * findByName(String name)
 * 
 * 		! => 부정
 * 		-- 결과값 : boolean
 * 
 * 		!true => false
 * 		!false => true
 * 		--사용처--> 조건문
 * 		--게임--> 턴제 게임
 * 		--여러명--> %
 * 
 */


public class 부정연산자 {

	public static void main(String[] args) {

		boolean bCheck = false;
//		bCheck = ! bCheck;
		System.out.println(bCheck);
		
		int i = 1;
		while(true) {
			if(i >= 10) {
				break;
			}
			bCheck = !bCheck;
			if(bCheck == true)
				System.out.println("사용자 ");
			else
			System.out.println("컴퓨터 ");
			
			i++;
		}
	}

}
