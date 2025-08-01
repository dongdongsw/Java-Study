import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 정리_7 {

	public static void main(String[] args) throws Exception{

		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== Menu =====");
			System.out.println("1. Top50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. Jazz");
			System.out.println("7. CLASSIC");
			System.out.println("8. EXIT");
	
			System.out.println("================");		
			System.out.print("메뉴 선택 :");
	
			int menu  = scan.nextInt();
			
			if(menu == 8) {
				System.out.println("종료됩니다.");

				break;
			}
			String url = "";
				if(menu == 1) {
					url = "https://www.genie.co.kr/chart/top200";
				}
				else if(menu == 2) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0100";
				}
				else if(menu == 3) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0200";
				}
				else if(menu == 4) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0300";
				}
				else if(menu == 5) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0107";
				}
				else if(menu == 6) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0500";
				}
				else if(menu == 6) {
					url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0600";
				}
				
				System.err.print("검색어 입력 :");
				String fd = scan.next();
				
				//웹에서 데이터 읽기 => JSOUP
				Document doc = Jsoup.connect(url).get();
				//HTML을 읽어 온다 => HTML Parser
				//XML => DocumentBuilder
				//XML을 주로 사용하는 곳은 Spring, Mybatis, 라이브러리
				
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.artist");
				
				for(int i = 0; i<=title.size(); i++) {
					String temp = title.get(i).text();
//					if(temp.contains(fd)) {
					if(temp.toUpperCase().contains(fd.toUpperCase())) {
						System.out.println((i+1) + "." + title.get(i).text());
						Thread.sleep(1000);
					}
				}
			
	}
	

}}
