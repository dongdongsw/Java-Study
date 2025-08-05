/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.*;
import java.util.*;

public class 배열응용_1 {

	public static void main(String[] args) throws Exception{
		 String movie = "";
		 File file = new File("C:\\javaDev\\movie.txt");
		 int i = 0; // 파일 읽어서 저장하는 변수
		 //한글자 읽기 => 정수로 읽는다 'A' => 65
		 FileReader fr = new FileReader(file);
		 StringBuffer sb = new StringBuffer();
		 while((i = fr.read()) != -1) {
//			 movie += (char)i;
			 sb.append((char)i); // + 보다 더 효율이 좋음
		 }
		 fr.close();

		 movie = sb.toString();
		 System.out.print(movie);
			 
		 String[] mnos = new String[1938];
		 String[] titles = new String[1938];
		 String[] genres= new String[1938];
		 String[] posters = new String[1938];
		 String[] actor = new String[1938];
		 String[] regdates = new String[1938];
		 String[] grades = new String[1938];
		 String[] directors = new String[1938];
			
		 /*
		  * class Movie{
		  * String Movie, title, genre, poster, actor, regdate, grades, directors}
		  * 
		  * Movie m = new Movie();
		  * 
		  * 
		  * 
		  */
		 
		 i = 0;
		 
		 String[] movies = movie.split("\n");
		 for(String m : movies) {
			 
			 String[] info = m.split("\\|");
			 //정규식 => | => | 출력 ==> \\
			 mnos[i] = info[0];
			 titles[i] = info[1];
			 genres[i] = info[2];
			 posters[i] = info[3];
			 actor[i] = info[4];
			 grades[i] = info[6];
			 i++;
		 }
//		 //1. 영화명 
//		 for(String s : titles) {
//			 System.out.println(s);
//		 }
//		 
//		 //2. 장르
//		 for(String s : genres) {
//			 System.out.println(s);
//		 }
		 
		 //1. 출연진을 입력 받아서 => 출연한 영화
		 Scanner scan = new Scanner(System.in);
		 System.out.println("출연진 이름을 입력하세요 >>");

		 String name = scan.next();
		 System.out.println("=====" + name + "님의 출연작 ====");

		int count=0;
		 for(i = 0; i < actor.length; i++) {
			 if(actor[i].contains(name)) {
				 
				 System.out.println(titles[i]);
				 count++;
			 }
		 }
		 System.out.println("총 출연 작품은 " + count + "편 입니다"); //총 몇 편 출연
		 
		 //=> 12세 관람 영화
		 for(i = 0; i<grades.length; i++) {
			 if(grades[i].contains("12")) {
				 System.out.println(titles[i]);
			 }
		 }
	}

}
