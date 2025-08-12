package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.music.MusicVO;

/*
 * 자바 소스 
 * 	package : 클래스가 있는 폴더명 지정 => 한번만 사용이 가능 
 *  import : 다른 패키지 있는 클래스나 라이브러리 클래스 로드
 *  		 여러번 사용이 가능
 *  class ClassName{
 *  
 *  	-------------
 *  	사용할 변수 => 여러개 사용
 *  		ㄴ 기본형, 클래스, 배열, 클래스 배열 
 *  			MusicVO vo;
 *  			MusicVO[] musics = new MusiicVO[50]
 *  			ㄴ 사용자 정의 데이트 형
 *  			ㄴ 일반 데이터형과 동일시 한다.
 *  			ㄴ 배열, 형변환
 *  	-------------
 *  	생성자 => 여러개 사용이 가능 => 오버로딩
 *  		ㄴ 초깃 값을 다르게 저장한다면 매개변수가 있는 생성자 이요
 *  	-------------
 *  	메소드 => 기능별로 메소드 제작
 *  	-------------
 *  
 *  
 *  }
 * 
 * 
 * 메소드
 * 1. 메뉴
 * 2. 목록
 * 3. 검색(곡명)
 * 4. 검색(가수명)
 * 5. 등폭이 가장 많은 곡
 * 		ㄴ 상승
 * 		ㄴ 하강
 * 
 * 1) 기능설정
 * 2) 메소드의 기능
 * 		ㄴ 반복제거
 * 		ㄴ 기능별 코드를 분리 : 가독성
 * 		  --------------에러처리 편리
 * 		ㄴ 다른 클래스에서 사용이 가능 : public
 * 		ㄴ 재사용 / 수정해서 사용이 가능 (오버라이디)
 * 3) 메소드 구조
 * 		ㄴ [접근지정어] 리턴형 메소드명(매개변수...)
 * 		{
 * 			리턴형과 리턴 값이 동일하거나 리턴형이 더 크다
 * 				ㄴ 가급적 동일하게 만든다	
 * 
 * 			return 값;
 * 		}
 * 
 * 		1. 접근지정어 : 메소드는 다른 클래스와 통신 : public
 * 		2. 리턴형
 * 			ㄴ 기본형 : 값이 한개인 경우
 * 				ㄴ int / double / boolean / String
 * 
 * 
 * 
 * 		식별자 (변수, 메소드, 클래스, 인터페이스)
 * 		변수 / 메소드 => 소문자로 시작
 * 		인터페이스 / 클래스 => 대문자로 시작
 * 			ㄴ 두개의 단어가 있는 경우
 * 			ㄴ 헝거리언식 표현법을 사용한다
 * 				ㄴ MusicManager
 * 				ㄴ Music_Manager => 약자 => 대문자사용
 * 				ㄴ MusicVO, MusicDAO, MusicDTO
 * 				ㄴ MusicEntity
 * 
 * 		4. 매개 변수
 * 			ㄴ 사용자의 요청값을 받아서 처리
 * 			ㄴ 매개변수(X , 여러개인 경우도 있다)
 * 						--------------3개 이상 : 배열 / 클래스
 * 			=> 갯수를 알 수 없는 경우도 있다
 * 			   ---------------------
 * 
 * 
 * 		5. 호출 => 메소드를 부를 경우
 * 		   ----
 * 			ㄴ 메소드 시작부터 return이 있는 곳까지 수행
 * 		
 * 			ㄴ 데이터
 * 				ㄴ 정형화 ===> 데이터베이스 (검증)
 * 				ㄴ 반정형화 ===> 구분만 된 데이터
 * 								ㄴ JSON / XML /HTML
 * 				ㄴ 비정형화 ===> 트위터, facebook
 * 								--------------> 정형화
 * 			
 * 
 * 		6. 호출 
 * 			void일 경우
 * 			메소드 명(값...)
 * 
 * 				ㄴ static
 * 					ㄴ 클래스명.메소드()
 * 				ㄴ instance
 *					ㄴ 객체명.메소드()
 *
 * 			class A
 * 			{
 * 				public void display(){
 * 					this.insert() => this.은 생략이 가능
 * 					-----------
 * 					insert()
 * 					temp() => this을 쓰지 않음
 * 				}
 * 
 * 				public static temp(){
 * 					A a = new A(); => 객체를 생성해야함
 * 					display()
 * 					insert()
 * 					=> 오류
 * 				}
 * 				
 * 				public void insert(){
 * 
 * 				}
 * 			}
 * 
 * 			class B{
 * 
 * 				public void display(){
 * 					A a = new A();
 * 					a.display()
 * 					a.insert()
 * 					A.temp()
 * 				}
 * 
 *				public static void temp(){
 *					A a = new A();
 * 					a.display()
 * 					a.insert()
 * 					A.temp() 
 * 				}
 * 
 * 				
 * 			}
 * 
 * 			public int display(){
 * 				return 10;
 * 
 * 			}
 * 			 => int a = display();
 * 
 * 
 * 		메소드 : 어떤 값을 받을지 => 매개변수
 * 				결과값 설정 => 리턴형
 * 
 *  
 * 1. 메뉴
 * 		menu() => 리턴형 / 매개변수
 * 					ㄴ int   ㄴ x
 * 2. 목록 => 리턴형 / 매개변수
 * 						ㄴ x
 * 				ㄴ void / MusicVO[]
 * 3. 검색(곡명) => 리턴형 / 매개변수
 * 							ㄴ String fd(검색어를 넘기기 위해)
 * 					ㄴ MusicVO[]
 * 4. 검색(가수명)
 * 5. 등폭이 가장 많은 곡
 * 		ㄴ 상승
 * 		ㄴ 하강
 * 
 * 
 */
//public class MusicManager {
//
////	public static void main(String[] args) {
////		MusicVO vo = new MusicVO();
////		
////		//변수 => 저장, 읽기, 수정
////		
////		
////		
////		
////	}
//	
//	public static void main(String[] args) {
//		MusicManager m = new MusicManager();
//		
//		m.sum(10,20);
//		m.sum(10,20,30,40,50);
//		m.sum(10,20,30,40,50,60,70);
//		
//		
//	}
//	
//	public void sum(int...arg) { // ...은 갯수를 알 수 없을 떄
//		int s= 0;
//		for(int i:arg) {
//			s += i;
//		}
//		System.out.println("sum=" + s);
//	}
//	
//	public void display(int a) {
//		
//		if(a==10) {
//			return; //유효성 검사
//		}
//		System.out.println("메소드 종료");
//
//	}
	
	
//}


public class MusicManager {
	private static MusicVO[] musics = new MusicVO[50];
	static {
		//데이터 수집 => 초기화 블록
		try {
			
			//1. HTML을 저장
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); 
			Elements title = doc.select("table.list-wrap a.title"); 
			Elements singer = doc.select("table.list-wrap a.artist"); 
			Elements album = doc.select("table.list-wrap a.albumtitle"); 
			Elements etc = doc.select("table.list-wrap tr.list span.rank"); 
			// 태그 => 구분 class = "" (중복이 된 상태) id="" (중복없이)
			//<a class = title>제목 </a>
			
			for(int i = 0; i< title.size(); i++) {
				musics[i] = new MusicVO();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				String s = etc.get(i).text();
				String state = "";
				int id = 0;
				if(s.equals("유지")) {
					state = "유지";
					id=0;
				}
				else {
					//1상승
					state = s.replaceAll("[^가-힣]", "");
					id = Integer.parseInt(s.replaceAll("[^0-9]",""));
					
				}
				musics[i].setState(state);
				musics[i].setIdcremeent(id);
				
				
//				System.out.println(title.get(i).text());
//				System.out.println(singer.get(i).text());
//				System.out.println(album.get(i).text());
//				System.out.println(etc.get(i).text());
//				System.out.println("==================");


			}
		}catch(Exception ex) {}
		
	}

	
public static void main(String[] args) {

	MusicManager m = new MusicManager();
		for(MusicVO vo : musics) {
			
			System.out.println("순위:" + vo.getMno());
			System.out.println("곡명:" + vo.getTitle());
			System.out.println("가수:" + vo.getSinger());
			System.out.println("앨범:" + vo.getAlbum());
			String state = vo.getState();
			String temp = "";
			if(state.equals("유지")) {
				temp = "- ";
				
			}
			else if(state.equals("상승")) {
				temp = "▲" + vo.getIdcremeent();
			}
			else if(state.equals("하승")) {
				temp = "▽" + vo.getIdcremeent();
			}
			System.out.println("등폭 :" + temp);
		}
	}
}










