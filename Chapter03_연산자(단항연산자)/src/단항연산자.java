
/*
 * 		자바에서 지원하는 연산자
 * 			피연산자(20 + 30)(연산 대상) / 연산자
 * 
 * 		1. 단항연산자
 * 			= 부호 연산자 (+, -) => 음수 / 양수
 * 			= 증감 연산자 (++, --) => 한개 증가 / 하나 감소
 * 			= 반전 연산자 (~) => 양수를 음수로, 음수를 양수로
 * 		2. 이항연산자
 * 			= 산술 연산자 (+, -, *, /, %)
 * 				ㄴ /할 때 0으로 나누면 오류 발생
 * 				ㄴ 5%-2 = 1
 * 				ㄴ -5%-2 = -1
 * 
 * 			= 비트 이동 연산자( <<(왼쪽이동), >>(오른쪽 이동)
 * 			= 비트 연산자(|, &, ^)
 * 			= 비교연산자(==, !=, <, >, <=, >=, equals(문자열 같은지)
 * 			
 * 			= 논리 연산자(&&(직렬 연산자), ||(병렬 연산자), !(부정))
 * 				ㄴ(조건) && (조건) => 둘다 true여야 true
 * 				ㄴ(조건) || (조건) => 둘 중 하나라도 true면 true
 * 			= 대입 연산자(op= => +=, -=, *=, /=...
 * 
 * 		3. 삼항연산자(if~else : 게임 업체 / 웹 개발)
 * 			(조건)? 값1 : 값2
 * 			|true = 값1
 * 			|false = 값2
 *  80page => 부호연산자(+, -) => 음수, 양수
 */



public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -100;
		System.out.println(a);
		a = -a;
		System.out.println(a);
	}

}
