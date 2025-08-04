import java.util.Scanner;

public class 자바_3 {

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		char[] score = new char[3];
		double[] avg = new double[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< 3; i++) {
			System.out.printf("국어 점수 [%d]:", i + 1);
			kor[i] = scan.nextInt();
			System.out.printf("영ㅇ 점수 [%d]:", i + 1);
			eng[i] = scan.nextInt();
			System.out.printf("수학 점수 [%d]:", i + 1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
			
			switch ((int)(avg[i]/10)) {
			
			case 10,9 ->{
				score[i] = 'A';
			}
			
			case 8->{
				score[i] = 'B';

			}
			
			case 7 ->{
				score[i] = 'C';

			}
			
			case 6 ->{
				score[i] = 'D';

			}
			default ->{
				
				score[i] = 'F';

			}
			
			
			
			}
			
			System.out.println("===========결과값===========");
			System.out.printf("%-5d %-5d %-5d %-7d %7.2f %3c \n",kor[i], eng[i], math[i], total[i], avg[i], score[i]);

			
		}
		
	}

}
