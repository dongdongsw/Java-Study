
public class 제어문_7 {

	public static void main(String[] args) {
		int com = (int)((Math.random()*100)+1);
		int  count = 0;
		for(;;) {
			int user = (int)((Math.random()*100)+1);
			
			count += 1;
		if(com > user) {
			System.out.println("입력값 UP");
		}
		else if(com < user) {
			System.out.println("입력값 DOWN");

		}
		else{
			System.err.println("GAME OVER");
			System.out.printf("시도 횟수 : %d", count);
			break;
		}
		}
		
	}

}
