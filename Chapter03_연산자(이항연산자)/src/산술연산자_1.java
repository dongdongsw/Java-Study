
/*
 * 		1. 실행
 * 			ㄴ프로젝트(.class) jar
 * 			ㄴJSP : war / ThymeLeaf : jar
 * 			ㄴA.java  ----(javac)---->A.class ----(java => JVM=> 운영체제 (인터프리터)) ---> 실행
 * 		
 * 		2. 들여쓰기
 * 			자바
 * 			Class A {
 * 			}
 * 			c/c++
 * 			class A
 * 			{
 * 			}
 * 
 * 		3. 가독성(수정,추가) / 최적화(속도)
 * 
 * 		4. 변수
 * 			: 데이터 한개만 저장되는 메모리 주송의 이름
 * 			1) 변수 추출 => 웹사이트
 * 
 * 			2) 어떤 데이터형 => 문자열 / 실수 /정수 ...
 * 				ㄴ기본형 : 자바에서 제공
 * 					ㄴ정수
 * 						ㄴbyte(1byte) => -128 ~ 127
 * 							ㄴ0과 1이 8개 들어감(8bit => 1byte)
 * 						ㄴint (4byte) => -21억 4천 ~ 21억 4천
 * 							ㄴ32비트
 * 							ㄴdefault : 컴퓨터는 모든 정수를 int로 인식
 * 						ㄴlong (8byte) => 64비트(int와 long은 구분하는 방법은 L 이다)
 * 							ㄴ오버플로우 : Max이상이면 Min값을 변경
 * 							ㄴ언더플로우 : Min이하이면 Max값을 변경
 * 					ㄴ실수
 * 						ㄴ평균 / 별점 / 표준 편차/ 확률 / 통계/ 예상
 * 						ㄴdouble : 8byte => 정밀도 => 15자리 =======컴퓨터에서는 default
 * 							ㄴfloat f = 10.5 <-오류  ===> 10.5f하면됨
 * 					ㄴ문자 : 문자 한개 저장
 * 						ㄴchar => 2byte ( 0~ 65535)
 * 									ㄴunicode => UTF-8
 * 							ㄴ ''와 ' ' 차이점
 * 								ㄴ'' => null(값이 없는 상태) => 오류
 * 								ㄴ' ' => 공백 문자 추가
 * 					ㄴ논리 : true / false만 저장
 * 						ㄴboolean => 조건문 / 반복문
 * 
 * 				ㄴ참조형 : 사용자 정의	
 * 					ㄴ배열 : 같은 크기의 데이터형을 여러개 모아서 관리
 * 					ㄴ클래스 : 다른 데이터형 여러개를 모아서 관리
 * 					ㄴ문자열 저장
 * 						ㄴString => 일반 문자열 데이터
 * 									필요시에는 클래스형으로 사용이 가능
 * 							ㄴ문자열과 관련된 기능(메소드)
 * 								ㄴ문자열 비교는 == / != 를 사용하지 않음
 * 
 * 			3) 어떤 초기값 (변수는 초기값이 있어야 사용 가능)(필요시 변경해서 사용)
 * 				ㄴ명시적 초기화 = int a = 10;
 * 				ㄴ사용자 입력값을 받아서 초기값 (Scanner /BufferReadReader)
 * 				ㄴ임의로 지정 : 난수 (Math.random() = > 0.0 ~0.99)
 * 					ㄴRandom r = new Random()
 * 						ㄴr.nextInt(10) => 0~9
 * 
 * 			---------------------------------------------------------
 * 
 * 			1. 변수 활용 => 연산자
 * 				ㄴ연산처리를 위해 => 데이터를 저장 => 다시 사용
 * 			2. 연산자 활용 => 제어문
 * 			3. 제어문 활용 => 메소드
 * 			4. 메소드 활용 => 객체지향
 * 
 * 			---------------------------------------------------------
 * 
 * 			=> 설계 / 기능별 분리 => 조립
 * 			=> 라이브러리 (자료구조 / IO / 네트워크 / 오라클 연동)
 * 			오류방지 => 예외 처리
 * 			
 * 			자바에서 제공하는 연산자
 * 			------------------
 * 			5 + 6
 * 				ㄴ피연산자 = 5, 6
 * 					ㄴ1개인 경우 : 단항 연산자(웹에서는 2진법으로 계산하는 내용이 없다)
 * 								 ㄴ부정 연산자(중요) => ! (반대 효과)
 * 								 ㄴ부호 연산자(중요) => 음수 / 양수
 * 								 ㄴ증감 연산자(중요) => ++ , -- (전치 연산자, 후치 연산자)
 * 								 ㄴ반전 연산자 => 양수 -> 음수, 음수 -> 양수
 * 								 ㄴ형변환 연산자(중요)
 * 									ㄴ형식) (데이터형) => (int) (byte) (double) (char)
 * 									ㄴ데이터형의 크기
 * 										==============================>Upcasting
 * 										byte < short, char  <int < long < float < double
 * 										<==============================DownCasting
 * 										1. 자동형 변환 : 데이터형을 크게 만드는 경우
 * 											1) 값 대입
 * 												ㄴint a = 'A' ==> 65
 * 											
 * 											2) 연산처리 => 같은 데이터형 크기로 변경(큰 데이터형 변경)
 * 												10 + 10.5 ==> 10을 10.0으로 변경
 * 
 * 										2. 강제 형 변환 : 데이터형을 작게 만드는 경우	   
 * 											ㄴ10 + (int)10.5 => int => DownCasting
 * 											ㄴ10 / (double)3	=> 소수점	=> UpCasting
 * 											ㄴ필요시에만 사용
 * 
 * 					ㄴ2개인 경우 : 이항 연산자
 * 								 ㄴ산술 연산자(+, -, *, /, %)
 * 									ㄴ
 * 								 ㄴ비트 이동 연산자( <<, >>)
 * 								 	ㄴ쉐프트 연산자
 * 								 ㄴ비트 연산자(&, |, ^(XOR))
 * 								 ㄴ비교 연산자(==, !=, <, >, <=, >=)
 * 									ㄴ숫자, 문자(문자열은 사용하지 않는다)
 * 										ㄴboolean(==, !=)
 * 									ㄴ모든 결과 값은 boolean (true/false)
 * 									ㄴ조건문 / 반복문에서 주로 사용
 * 								 ㄴ논리 연산자( &&(조건 && 조건 => 둘다 참이어야 참) , ||(조건 || 조건 => 둘 중 하나라도 참이면 참) )
 * 								 ㄴ대입 연산자 : 초기값, 연산 결과값(연산순위가 마지막 => int a = 10이면 a=10 넣고 int라고 지정)
 * 									ㄴ복합 대입 연산자(+=, -=, *=, /=, %=, >>=, <<=, &=, |=, ^=)
 * 
 * 					ㄴ3개인 경우 : 삼항 연산자
 * 				 
 * 				ㄴ연산자 = +
 * 
 * 
 * 			연산 => 출력
 * 				ㄴ입력 값 받기
 * 					ㄴScanner => 키보드 입력값 받기
 * 						ㄴ1. Scanner(데이터형) scan(변수) = new Scanner(System.in);
 * 														 	 ------------------
 * 																메모리 할당
 * 							ㄴnextInt() : 정수값 일기
 * 							ㄴnext() : 문자열 읽기
 * 							ㄴnextLine : Enter할시 전체 문장열
 * 
 * 						ㄴ2. JOptionPane.showInputDialog
 * 							ㄴ단점 : 문자열
 * 									ㄴ문자열 => 정수 변경 : Integer.parseInt()
 * 									ㄴ문자열 => 실수 변경 : Double.parseDouble()
 * 									ㄴ모든 데이터형을 String으로 변경(Valueof())
 * 
 * 			출력 
 * 				ㄴSystem.out.println(); : 가장 줄바꿈
 * 				ㄴSystem.out.print(); 줄바꿈 없이 출력
 * 				ㄴSystem.out.printlf(); : 출력 형식을 만들어서 출력
 * 					ㄴ 정수 출력 : %d
 * 					ㄴ 실수 출력 : %f (원하는 형식 지정 => %.1f (소수점 1자리까지), %.3f(소수점 3자리까지))
 * 					ㄴ 문자 출력 : %c
 * 					ㄴ 문자열 출력 : %s
 * 					ㄴ 명령 프롬프트 => 웹 x , 윈도우 x
 * 				ㄴJOptionPane.showMessageDialog()
 * 			-----------------------------------------------------------------------------------
 * 										
 * 				
 * 
 * 
 */				

import javax.swing.*;

public class 산술연산자_1 {

	public static void main(String[] args) {
			//오버 플로우
//			int max = Integer.MAX_VALUE;
//			System.out.println(max);
//			System.out.println(max + 2);
			
			//언더 플로우
//			int min = Integer.MIN_VALUE;
//			System.out.println(min);
//			System.out.println(min - 2);
			//System.out.println(10000000000000000000); 오류
			//float f = 10.5f;
			
			//정수 두개를 받아서 산술 연산처리 결과 출력
			String num1 = JOptionPane.showInputDialog("첫번째 정수 입력 : ");
			String num2 = JOptionPane.showInputDialog("두번째 정수 입력 : ");
			
			//정수로 변경
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			String result = n1 +  "+" + n2 + "=" + (n1+n2) +"\n"
							+ n1 +  "-" + n2 + "=" + (n1-n2) +"\n"
							+ n1 +  "*" + n2 + "=" + (n1*n2) +"\n"
							+ n1 +  "/" + n2 + "=" + (n1/n2) +"\n"
							+ n1 +  "%" + n2 + "=" + (n1%n2);
			JOptionPane.showMessageDialog(null,result);
	}

}
