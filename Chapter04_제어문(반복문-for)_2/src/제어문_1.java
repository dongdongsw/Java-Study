/*
 * 
 * 		1. 변수
 * 			하나의 값을 메모리 저장해서 재사용
 * 			-------변경해서 사용이 가능
 * 
 * 		2. 상수
 * 		 	히나의 값을 메모리 저장헤서 사용
 * 			-------변경할 수 없다
 * 			final => 값을 고정
 * 
 * 		3. 초기화
 * 			변수를 선언한 경우에 처음 저장하는 값
 * 
 * 		4. 자료형(데이터형)
 * 			컴퓨터에 자체 처리 => 메모리 크기
 * 			=> 정수 / 실수 / 문자 / 논리
 * 			=> 자동처리가 안되는 경우 (사용자 정의 데이터형 : 참조형)
 * 								 -----------------
 * 								class / interface / enum	
 * 		5. 연산자 : 연산을 사용하기 위한 기호(+, - ...)
 * 
 * 		6. 피연산자 : 연산에 필요한 데이터
 * 
 * 		7. 제어문 : 실행시에 흐름을 개발자가 원하는 방향으로 바꿀 수 있게 만드는 것
 * 				  상황에 따라 변경 : 조건문, 선택문
 * 				  프로그램 실행중에 계속 반복 : 반복문 (for, while)
 * 				=> 프로그램 종료 : break, continue => 프로그램을 제어		
 * 
 * 			=> for : 반복 횟수가 지정
 * 
 * 			=> while : 무한 루프 => 반복 횟수가 없는 경우
 * 					선조건 : 한번도 수행을 못할 수 있다.
 * 				=> 데이터베이스 / 네트워크
 * 				=> 무조건 => 종료 조건을 설정
 * 	
 * 			=> do ~ while : 무조건 한번이상 수행
 * 			=> break, continue => 바로 밑에 소스 코딩이 불가능
 * 
 * 		8. 반복문(for)
 * 			for(초기값; 조건; 증감 혹은 감소){
 * 				실행 문장
 * 				
 * 			}
 * 			=> 알파벳 => 연산처리 => 자동으로 정수 변수
 * 				char c = 'A'
 * 				c <= 'Z'
 * 				=> 실수는 사용x
 * 
 * 	
 * 
 */


public class 제어문_1 {

	public static void main(String[] args) {

		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		for(int i = 10; i>=1; i--) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		for(char i = 'Z'; i<='A'; i--) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		String s = "Hello Java";
		for(int i = 0; i< s.length(); i++) {
			System.out.print(s.charAt(i) + " ");

		}
		System.out.println();
		
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");

		}
		System.out.println();
		
		String html = "<li class=\"common_sp_list_li LgGoodsItem slick-slide slick-current slick-active\" data-id=\"1000032658\" data-name=\"[공동구매] 롤팬 NEW오리지널 5종 (블랙 에디션/그레이/케요네즈/민트/밀크)\" data-price=\"94,000\" data-thumbnail=\"https://recipe1.ezmember.co.kr/cache/data/goods/22/12/51/1000032658/1000032658_list_054.jpg\" data-position=\"0\" style=\"width: 206px;\" data-slick-index=\"0\" aria-hidden=\"false\" tabindex=\"-1\" role=\"option\" aria-describedby=\"slick-slide10\">\r\n"
				+ "                    <a href=\"https://shop.10000recipe.com/goods/goods_view.php?goodsNo=1000032658&amp;utm_source=10k_web&amp;utm_medium=main_home_best&amp;utm_campaign=g1000032658\" class=\"common_sp_link\" tabindex=\"0\" target=\"_blank\">\r\n"
				+ "                        <div class=\"common_sp_thumb\">\r\n"
				+ "                                                    <img src=\"https://recipe1.ezmember.co.kr/cache/data/goods/22/12/51/1000032658/1000032658_list_054.jpg\">\r\n"
				+ "                        </div>\r\n"
				+ "                        <div class=\"common_sp_caption\">\r\n"
				+ "                            <div class=\"common_sp_caption_tit line2\">[공동구매] 롤팬 NEW오리지널 5종 (블랙 에디션/그레이/케요네즈/민트/밀크)</div>\r\n"
				+ "                            <div class=\"common_sp_caption_price_box\">\r\n"
				+ "                                <strong class=\"common_sp_caption_price\">94,000<small>원</small></strong>\r\n"
				+ "                                                            </div>\r\n"
				+ "                            <div class=\"common_sp_caption_rv\" style=\"display: inline-block;\">\r\n"
				+ "                                                            <span class=\"common_sp_caption_rv_star\">\r\n"
				+ "                                <img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\">                                </span>\r\n"
				+ "                                <span class=\"common_sp_caption_rv_ea\">(526)</span>\r\n"
				+ "                                                        </div>\r\n"
				+ "                        </div>\r\n"
				+ "                    </a>\r\n"
				+ "                </li>";
		for(int i = 0; i< 10; i++) {
			
			System.out.println(html);
		
		}
		
		
		
		
	}

}
