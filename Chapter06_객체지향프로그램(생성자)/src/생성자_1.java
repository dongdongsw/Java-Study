/*
 * 변수 : 메모리에 값을 저장
 * -----초기값 (시작과 동시에 사용하는 값)
 * 		ㄴ 1) 명시적인 초기화(고민)
 * 			ㄴ int a =100;
 * 		ㄴ 2) 외부에서 데이터 읽기 => 명시적인 초기화가 불가능
 * 				ㄴ 인스턴스 블록
 * 					{
 * 
 * 					}
 * 				
 * 				ㄴ 정적 블록
 * 					static{  //Mybatis
 * 			
 * 					}
 * 
 * 				ㄴ 생성자 
 * 					ㄴ 1. 변수의 종류
 * 						ㄴ 메소드 안에서 선언 : 지역변수, 매개변수
 * 						ㄴ 클래스 영역에 선언 : 인스터스, 정적변수
 * 													 | 메모리 공간 1개 => 공유 변수
 * 											|new를 사용할 떄 따라 생성되는 메모리
 * 						ㄴ 지역 변수, 매개변수 => 기본값이 없다
 * 										  => 초기화 후에 사용
 * 						ㄴ 인스턴스, 정적변수 => 기본 값이 존재
 * 											int => 0
 * 											double => 0.0
 * 											boolean => false
 * 											String => null (모든 클래스 null)
 *						ㄴ 변수
 *							ㄴ 기본형(int, long, double ...)
 *							ㄴ 배열
 *							ㄴ 클래스
 *							--------변수 
 *
 *					 ㄴ 2. 특징
 *						ㄴ 클래스명과 동일
 *							Scanner scan = new Scanner(System.in)
 *						ㄴ 리턴형이 없다 (void는 리턴형)
 *						ㄴ 호출 시기 => 객체 생성시
 *						ㄴ 여러개 사용이 가능 : 오버로딩
 *						ㄴ 생성자를 사용하지 않는 경우 : 자동으로 생성자 추가 => 디폴트 생성자 : 매개변수 없는 생성자(네트워크 / 데이터베이스 / 윈도우)
 *						ㄴ 역할 
 *							ㄴ 변수에 대한 초기화
 *								ㄴ 클래스에 선언되는 변수
 *							ㄴ 초기화 메소드
 *						ㄴ 생성자 종류
 *							ㄴ 매개변수가 없는 생성자
 *								ㄴ 기본 생성자
 *							ㄴ 매개변수가 있는 생성자
 *						ㄴ this() / super()
 *									 ㄴ 상위 클래스의 생성자 호출
 *							ㄴ 자신의 생성자 호출
 *						ㄴ 없는 경우는 자동 추가
 *
 *---------------------------------------------------------------------------------
 *					초기화
 *						ㄴ 1) 기본값 int a;
 *						ㄴ 2) 명시적 초기화
 *						ㄴ 3) static{} ===> static 변수
 *						ㄴ 4) {}
 *						ㄴ 5) 생성자 =====> 인스턴스
 *								ㄴ 초기값을 다르게 생성 
 *		오버로딩
 *		------- 한개의 메소드로 여러개의 기능을 처리
 *		1) 메소드명이 동일
 *		2) 매개변수의 객수나 데이터형이 다르다
 *		3) 리턴형은 관계없다
 *		4) 접근지정어도 관계없다
 *		-------------------------------------
 *
 *		=> 일반 기본형을 설정된 변수는 생성자를 사용하지 않는다		
 *		=> 생성자
 *			ㄴ 윈도우 = 화면 UI
 *			ㄴ 데이터베이스의 드라이버 등록
 *			ㄴ 네트워크 => 서버 가동
 *			ㄴ 파일에서 데이터를 읽어서 초기화
 *			ㄴ 생성자는 반드시 new 생성자();
 *							ㄴ 반드시 있어야함
 *			ㄴ 객체 생성시에 new
 *							ㄴ new를 이용하지 않고 객체 생성
 *								ㄴ 추상클래스 / 인터페이스
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
 *
 *
 *
 *
 */		
class Member{
	int mno;
	String name;
	String address;
	String phone;
	String sex;
	
	//초기화 => 객체 저장시에 주로 사용
//	Member(){
//		mno = 1;
//		name = "홍길동";
//		address = "서울";
//		phone = "010)1111-1111";
//		sex ="남자";
//		
//	}
	
	Member(int m, String n, String a, String p, String s){
		mno = m;
		name = n;
		address = a;
		phone = p;
		sex = s;
	}
	
}

public class 생성자_1 {

	public static void main(String[] args) {

		Member m = new Member(1, "홍길동", "서울", "1111-1111", "남자");
		System.out.println("회원 번호 :" + m.mno);
		System.out.println("이름 :" + m.name);
		System.out.println("주소 :" + m.address);
		System.out.println("전화 :" + m.phone);
		System.out.println("성별 :" + m.sex);
		
		Member m1 = new Member(2, "심청이", "경기", "2222-2222", "여자");
		System.out.println("회원 번호 :" + m1.mno);
		System.out.println("이름 :" + m1.name);
		System.out.println("주소 :" + m1.address);
		System.out.println("전화 :" + m1.phone);
		System.out.println("성별 :" + m1.sex);
	}

}
