import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class 메소드_1_변환 {

	static int[] rand() {
			
			//재사용이 어렵다
			int[] com = new int[3];
			for(int i = 0; i< com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
				for(int j = 0; j < i; j++) {
					if(com[j] == com[i]) {
						i--;
						break;
					}
				
				}
			}
			return com;
		}

	//사용자 입력
	static int[] userInput(){
		
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		while(true) {
			//사용자 입력
			System.out.println("세자리 정수 입력 :");
//			int input = Integer.parseInt(br.readLine());
			int input = scan.nextInt();
			
			//오류 처리 => 입력이 잘못된 경우
			// 1. 세자리 정수가 아닌 경우
			// 2. 중복된 수 입력이 된경우
			// 3. 0을 입력하는 경우
			if(100 > input && 999 < input) {
				System.out.println("잘못된 입력입니다");
//				bw.write("잘못된 입력입니다");
				continue;
			}
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0] == user[1] || user[1] == user[2] ||user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없다");
				continue;
				
			}
			break;
		}
		return user;

	}

	//비교
	static int compare(int[] com, int[] user) {
		//비교 => 힌트 => s: 같은 위치의 같은 값 b : 다른 자리에 같은 값
		int s = 0, b = 0;
		for(int i=0; i<3; i++) {
			
			for(int j = 0; j<3; j++) {
				
				if( com[i] == user[j]) {
					if(i == j ) {
						s++;
					}
					else {
						b++;
					}
				}
			}
		}
		System.out.printf("Input Number: %d%d%d, Result : %dS-%dB\n",user[0],user[1],user[2], s,b);
		
		return s;
	}
	
	//종료 여부
	static boolean isEnd(int s) {
		boolean bCheck = false;
		if(s ==3) {
			bCheck = true;
		}
		return bCheck;
	}
	
	//조립 시작
	static void process() {
		//난수 값 
		int[] com = rand();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int[] user = userInput();
			int s = compare(com,user);
			if(isEnd(s)) {
				System.out.println("축하합니다 ! Game Over");
				System.out.println("게임을 다시할까요? (x/y)");
				char c = scan.next().charAt(0);
				if(c == 'y') {
					System.out.println("새 게임을 시작합니다!!");
					process();
				}
				else {
					System.out.println("Game Over!!");
//					break;
					System.exit(0);
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = 버퍼.getReader();
		BufferedWriter bw = 버퍼.getWriter();
		
		process();
		
		
		br.close();
		bw.close();
	}

}
