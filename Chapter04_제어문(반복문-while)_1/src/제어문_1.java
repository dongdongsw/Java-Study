/*
 * 	1. while => 형식
 * 		ㄴ 사용처
 * 		ㄴ 파일 읽기 (출력) => 한글자씩 읽는다
 * 		ㄴ 데이터베이스 => 개수는 확인 => 갯수를 확인할 수 없는 곳에서 주로 사용
 * 		ㄴ for : FrontEnd (화면 출력)
 * 		ㄴ While : Back-End(요청에 따른 갯수가 확인 없는 경우)
 * 
 * 	2. for => 지정(반복) , while => true 일 동안
 * 
 * 	3. 형식 => 반복 횟수를 지정 => for과 동일하게 사용이 가능
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 제어문_1 {

	public static void main(String[] args) {

		int i = 0;
		
		while(i<=10) {
			i++;
			System.out.print(i + "\t");
			
		}
		
		System.out.println(" ");

		
		int j = 1;
		while(true) {
			
			System.out.print(j + " ");
			if(j>=10) break;
			j++;
			
		}
		
		
		
	}

}
