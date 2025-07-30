import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class 뮤직프로그램 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			
			
			System.out.println("================== 메뉴 ===================");
			System.out.println("1. 목록 (TOP 200)");
			System.out.println("2. 검색(곡명)");
			System.out.println("3. 검색(가수명)");
			System.out.println("4. 상승 곡");
			System.out.println("5. 하강이 많은 곳");
			System.out.println("6. 종료");
			System.out.println("=========================================");
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu> 1 || menu  > 6) {
				System.out.println("존재하지 않는 메뉴 입니다");

				
				
			}
			if(menu ==6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			else if(menu==1) {
				System.out.println("***** 뮤직 Top 200  *****");
				int k = 1;
				for(int i = 1; i<=4; i++) {
					
					Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250730&hh=17&rtm=Y&pg="+i).get();
					Elements title = doc.select("table.list-wrap td.info a.title");
					
					for(int j = 0; j <= title.size(); j++) {
						System.out.println(j + "." + title.get(j).text());

						
					}
				}

			}
			else if(menu==2) {
				System.out.println("***** 곡명  *****");

							
						}
			else if(menu==3) {
				System.out.println("***** 가수명  *****");

				
			}
			else if(menu==4) {
				System.out.println("***** 상승 곡  *****");

				
			}
			else if(menu==5) {
				System.out.println("***** 하강이 많은 곳  *****");

}
			
			
		}
		
	}

}
