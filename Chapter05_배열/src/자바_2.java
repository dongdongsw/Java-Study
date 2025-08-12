/*
 * 1. 데이터가 많은 경우 => 효율적 사용 => 배열
 * 	----------------같은 종류의 데이터 3개 이상
 * 
 * 2. 인덱스를 이용한 빠른 접근
 * 	연속적인 메모리 구조 => 캐시효율이 좋음
 * 	고정적이다(저장 갯수가 지정 => 추가/ 삭제가 어렵다
 * => 추가/ 삭제 => 배열의 크기를 변경
 * 				  새로운 배열을 만든다
 * 
 * 3. 용어
 * 	인덱스 : 배열에 저장된 데이터의 위치 => 0
 * 			----------배열에 저장된 갯수 : 배열명.length
 * 	요소 : 실제 배열에 저장된 한개의 값
 *  길이 : 배열의 갯수
 *  
 * 4. 배열선언
 * 	데이터형[] 배열명
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class 자바_2 {

	public static void main(String[] args) {

		int kor1 = 0, kor2 = 0, kor3 = 0;
		int eng1 = 0, eng2 = 0, eng3 = 0;
		int math1 = 0, math2 = 0, math3 = 0;
		int total1 = 0, total2 = 0,total3 = 0;
	
		double avg1 = 0.0, avg2 = 0.0, avg3 = 0.0;
		char score1 = 'A', score2 = 'A', score3 = 'A';
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ' 국어 점수 :");
		kor1 = scan.nextInt();
		
		System.out.print("1 ' 영어 점수 :");
		eng1 = scan.nextInt();
		
		System.out.print("3 ' 수학 점수 :");
		math1 = scan.nextInt();
		
		total1 = kor1 + eng1 + math1;
		avg1 = total1 / 3.0;
		
		switch((int)(avg1/10)){
		
		case 10,0->{
		
			score1 = 'A';
		}
		
		case 8->{
			score1 = 'B';
		}
		
		case 7->{
			score1 = 'C';
		}
		
		case 6->{
			score1 = 'D';
		}
		
		default ->{
			score1 = 'F';
		}
		
	}
		System.out.print("1 ' 국어 점수 :");
		kor2 = scan.nextInt();
		
		System.out.print("1 ' 영어 점수 :");
		eng2 = scan.nextInt();
		
		System.out.print("3 ' 수학 점수 :");
		math2 = scan.nextInt();
		
		total2 = kor2 + eng2 + math2;
		avg2 = total2 / 3.0;
		
		switch((int)(avg2/10)){
				
				case 10,0->{
				
					score1 = 'A';
				}
				
				case 8->{
					score1 = 'B';
				}
				
				case 7->{
					score1 = 'C';
				}
				
				case 6->{
					score1 = 'D';
				}
				
				default ->{
					score1 = 'F';
				}
				
			}
		
		System.out.print("1 ' 국어 점수 :");
		kor3 = scan.nextInt();
		
		System.out.print("1 ' 영어 점수 :");
		eng3 = scan.nextInt();
		
		System.out.print("3 ' 수학 점수 :");
		math3 = scan.nextInt();
		
		total3 = kor3 + eng3 + math3;
		avg3 = total3 / 3.0;
		
		switch((int)(avg3/10)){
		
		case 10,0->{
		
			score1 = 'A';
		}
		
		case 8->{
			score1 = 'B';
		}
		
		case 7->{
			score1 = 'C';
		}
		
		case 6->{
			score1 = 'D';
		}
		
		default ->{
			score1 = 'F';
		}
		
		}
		
		
		System.out.println("======결과======");
		System.out.printf("%-5d %-5d %-5d %-7d %7.2f %3c \n",kor1, eng1, math1, total1, avg1,score1);
		System.out.printf("%-5d %-5d %-5d %-7d %7.2f %3c \n",kor2, eng2, math2, total2, avg2,score2);
		System.out.printf("%-5d %-5d %-5d %-7d %7.2f %3c \n",kor3, eng3, math3, total3, avg3,score3);
	

	}
}
