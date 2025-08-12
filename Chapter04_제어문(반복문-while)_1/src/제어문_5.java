/*
 * 
 * searchMainDailyBoxOffice.do
 * searchMainRealTicket.do
 * searchMainDailySeatTicket.do
 * 
 * https://www.kobis.or.kr/kobis/business/main/
 */

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 제어문_5 {

	public static void main(String[] args) 
	throws Exception
	{
		String url = "https://www.kobis.or.kr/kobis/business/main/";
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		while(true) {
			
			System.out.println("===============메뉴================");
			System.out.println("1. 박수 오피스 순위");
			System.out.println("2. 실시간 예매율 순위");
			System.out.println("3. 좌석 점유율 순위");
			System.out.println("4. 종료");
			
			System.out.print("메뉴 선택 :");
			int menu = scan.nextInt();
			
			if(menu < 1 || menu > 4) {
				System.out.print("🚫");
				continue;
				
			}
			
			if(menu == 4) {
				System.out.println("프로그램 종료");
				
				break;
			}
			else if(menu == 1) {
				url += "searchMainDailyBoxOffice.do";
				Document doc = Jsoup.connect(url).get();
//				System.out.println(doc.toString());
				String movie = doc.toString();
				// substring(start, end) 
//							 -----   --
//							 포함     미포함
				
				movie = movie.substring(movie.indexOf("["), movie.lastIndexOf("]") + 1);
//				System.out.println(movie);
				JSONParser jp = new JSONParser();
//				[{}, {}] => json => javascript object nontation
//				자바 스크립트 객체 표현법
//				ajax
				JSONArray arr = (JSONArray) jp.parse(movie);
//				System.out.println(arr);
				for(int i = 0; i < arr.size(); i++) {
					JSONObject obj = (JSONObject) arr.get(i);
					System.out.println((i+1) + ". " + obj.get("movieNm"));

				}
				System.out.println("");

			}
			else if(menu == 2) {
				url += "searchMainDailySeatTicket.do";
				
				Document doc = Jsoup.connect(url).get();
//				System.out.println(doc.toString());
				String movie = doc.toString();
				// substring(start, end) 
//							 -----   --
//							 포함     미포함
				
				movie = movie.substring(movie.indexOf("["), movie.lastIndexOf("]") + 1);
//				System.out.println(movie);
				JSONParser jp = new JSONParser();
//				[{}, {}] => json => javascript object nontation
//				자바 스크립트 객체 표현법
//				ajax
				JSONArray arr = (JSONArray) jp.parse(movie);
//				System.out.println(arr);
				for(int i = 0; i < arr.size(); i++) {
					JSONObject obj = (JSONObject) arr.get(i);
					System.out.println((i+1) + ". " + obj.get("movieNm"));

				}
				System.out.println("");
				
			}
			else if(menu == 3) {
				url += "searchMainRealTicket.do";
				
				
			}
			
		}
		
		
		
	}

}
