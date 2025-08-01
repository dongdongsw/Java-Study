/*
 * 제어문 정리 /String 정리
 * 배열 / 메소드
 * 
 * 	제어문 
 * 		ㄴ 조건문 / 선택문
 * 			ㄴ단일 조건문 : 상세보기, 아이디 중복, 유효성 검사
 * 				ㄴ독립적 = 속도가 느려진다
 * 			ㄴ 선택 조건문 : 로그인, 검색, 장바구니 확인
 * 			ㄴ 다중 조건문 :여러가지 경우의 수 
 * 					ㄴ 한번만 수행
 * 					ㄴ 메뉴, 버튼
 * 
 * 		ㄴ 반복문
 * 		ㄴ 반복 제어문
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class 정리_3 {

	public static void main(String[] args) {
	
		String[] arr= {
        		"사과:apple",
        		"배:pear",
        		"밤:chestnut",
        		"잣:pine nut",
        		"호두:walnut",
        		"도토리:acorn",
        		"귤:tangerine",
        		"딸기:strawberry",
        		"파인애플:pineapple",
        		"포도:grape",
        		"복숭아:peach",
        		"살구:apricot",
        		"매실:Japanese apricot",
        		"자두:plum",
        		"키위:kiwi",
        		"토마토:tomato",
        		"블루베리:blueberry",
        		"앵두:cherry",
        		"바나나:banana",
        		"오렌지:orange",
        		"수박:watermelon",
        		"멜론:melon",
        		"참외:oriental melon",
        		"망고:mango",
        		"레몬:lemon",
        		"석류:pomegranate",
        		"자몽:grapefruit",
        		"대추:jujub",
        		"감:persimmon",
        		"곶감:dried persimmon",
        		"리치:litchi",
        		"모과:quince",
        		"오디:mulberry",
        		"유자:citron",
        		"무화과:fig",
        		"호박:pumpkin",
        		"오이:cucumber",
        		"양파:onion",
        		"마늘:garlic",
        		"생강:ginger",
        		"무:radish",
        		"쑥:mugwort",
        		"당근:carrot",
        		"인삼:ginseng",
        		"산삼:wild ginseng",
        		"더덕:deodeok",
        		"죽순:bamboo shoot",
        		"파프리카:paprika",
        		"피망:pimiento",
        		"부추:chives",
        		"파:green onion",
        		"감자:potato",
        		"고구마:sweet-potato",
        		"가지:eggplant",
        		"옥수수:corn",
        		"후추:pepper",
        		"고추:chili, hot pepper",
        		"배추:Chinese cabbage",
        		"양배추:cabbage",
        		"상추:lettuce",
        		"양상추:lettuce",
        		"시금치:spinach",
        		"콩:bean",
        		"땅콩:peanut",
        		"깨:sesame",
        		"깻잎:sesame leaf",
        		"콩나물:bean sprouts",
        		"버섯:mushroom",
        		"미역:seaweed"
        };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = scan.next();
		boolean bCheck = true;
		for(String a : arr) {
			if(a.contains(fd)) {
//				System.out.println(a);
//				System.out.println(a.replaceAll("^A-Za-z", ""));
//				[가-힣] 한글전체
//				[0-9] 숫자 전체
//				[A-Za-z] 알파벳 전체
				
//				[^가-힣] !한글전체
//				[^0-9] !숫자 전체
//				[^A-Za-z] !알파벳 전체
//				
//				^[가-힣] 한글 전체
//				^[0-9] 숫자시작
//				^[A-Za-z] 알파벳 전체
				
//				^[가-힣]{3} 한글로 시작 가나다aaaaaa 가나aaaa(x)
//				^[0-9]{1,3} 숫자 시작 1A 12A 123A
//				^[A-Za-z] 알파벳 시작
				
				
				
				String s = a.substring(a.indexOf(":" )+1);
				System.out.println(s);

			}
			else {
				bCheck = false;
			}
		}
		if(bCheck == false) {
			System.out.println("검색 결과가 없습니다");
		}
	}

}
