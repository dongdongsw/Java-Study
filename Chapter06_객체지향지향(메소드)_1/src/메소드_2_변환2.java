import java.util.Scanner;

public class 메소드_2_변환2 {

	static int year, month, week;
	// 전역 변수는 자동 초기화 => 0
	
	static int[] lastday = {
			31,28,31,30,31,30
			,31,31,30,31,30,31
	};

static int input(String msg) {
		
		Scanner scan = new Scanner(System.in);
		
		// 년 월
		System.out.print(msg);
		int num = scan.nextInt();
		return num;
	}
	
	static void getWeek() {
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// 2. 전달까지 총날수
		
		
		if((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;	
		}
		
		for(int i = 0; i<month-1; i++ ) {
			total += lastday[i];
		}
		
		//+1 => 각달의 1일차 확인
		total++;
		
		//요일 구하기
		week = total%7;
		
	}
	
	static void print() {
		//달력 출력
			
		
		String[] strWeek = {
			"일", "월", "화", "수", "목", "금", "토"	
		};
		System.out.printf("%d년도 %d월\n",year,month);
				
		for(String s : strWeek) {
			System.out.print(s + "\t");
		}
				
		System.out.println();
		for(int i = 1; i <= lastday[month-1]; i++) {
					
			if(i==1) {
						
				for(int j = 0; j < week; j++) {

					System.out.print("\t");
					}
				}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6) {
				week = 0;
				System.out.println();
					}
				}
	}
	
	static void process() {
		year = input("년도 입력 :");
		month = input("월 입력 :");
	
		getWeek();
		print();
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int year = 2025;	//지역변수 <= 가 없으면 전역변수 알아서 찾아옴
//		System.out.println(year); //지역변수의 값
//		
//		System.out.println(메소드_2_변환2.year); //전역변수의 값
		//지역 변수 우선 순위
		//구분 => 클래스명.변수명
		
		process();
	}

}
