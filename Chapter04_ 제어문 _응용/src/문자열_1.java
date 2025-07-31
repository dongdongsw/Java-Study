/*
 * 	String => 데이터형 / 클래스형 (기능 => 메소드)
 *  => 사용법
 *  	ㄴ String 변수명= "문자"
 *  					---- 제한이 없다
 *  
 *  메소드
 *  	변환 : 
 *  		ㄴ toUpperCase() : 대문자 변환
 *  		ㄴ toLowerCase() : 소문자 변환
 *  		--------------------------(사용빈도가 없다)
 *  			ㄴ 우리나라는 한글이 대부분이라(외국은 많이 쓸지도..?)
 *  			ㄴ 검색기능에는 많이 씀
 *  		ㄴ valueOf() : 모든 데이터형을 문자열 변환 (가장 많이 쓰는 듯)
 *  			ㄴ 웹 / 윈도우 => 모든 데이터형 String
 *  			valueof(10) => "10" 문자로 됨
 *  	비교 : 
 *  		ㄴ equals() => 실제 문자열 비교(대소문자 구분 O)
 *  			ㄴequalsIgnoreCase => 대소문자 구분 x
 *  		ㄴ contains() => 포함 문자열
 *  		ㄴ startsWith() => 시작 문자열 
 *  		ㄴ endsWith() => 끝 문자열이 같냐
 *  
 *  	검색
 *  		ㄴ indexof() => 앞에서 부터 찾는 것(문자, 문자열 둘중 하나)
 *  		ㄴ lastIndexOf() => 뒤에서 부터 찾는 것
 * 
 * 		제어
 * 			ㄴ substring() => 문자를 자르기 => (1, 5)=> end - 1 와 같다
 * 			ㄴ split() => 문자별 자르기
 *			ㄴ trim() => 공백 문자 제거 
 *
 *----------------------------------------------------------------------
 *		
 *
 *
 *		
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
//import javax.swing.*;
//
//public class 문자열_1 extends JFrame{
//	JTextField tf = new JTextField();
//	
//	public 문자열_1() {
//		setLayout(null);
//		tf.setBounds(10,100,300,30);
////		tf.setText(String.valueOf(10)); String을 넣어야함
//		tf.setText("");
//
//		add(tf);
//		setSize(450, 300);
//		setVisible(true);
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		new 문자열_1();
//		
//		
//		
//	}
//
//}

import java.util.*;
import java.io.*;//파일 입출력할 떄 사용

//substring
public class 문자열_1{
	
	public static void main(String[] args) throws Exception{
		
		String msg = "Hello Java";
		
		// 1. 문자의 갯수 => " " => 문자(공백 포함)
		// => length() => 개수이니 int 형식임
		int leng = msg.length();
		System.out.println("문자 갯수 :" + leng);
		
		// 2. 자르기
		// 문자를 잘라도 문자이니 String 형식임
		String s = msg.substring(6); // 6번째 자리부터 잘라라 => 6번 뒤에 있는 것들을 다 가져와라
		System.out.println("문자 :" + s);
		// 범위 지정
		s = msg.substring(0, 5); //마지막 한글자는 빼고 => 0 ~ 4까지라는 소리
		//substring(beginIndex, endIndex-1) 이런 형식임
		System.out.println("문자 :" + s);

		//java만 출력 하도록
		String name = "문자열_1.java";
//		s = name.substring(6);
		s = name.substring(name.indexOf(".")+1);
		System.out.println("문자 :" + s);
		System.out.println(" ");

//-----------------------------------------------------------------
//		
//		File dir = new File("c:\\javaDev");
//		File[] lists = dir.listFiles();
//		for(File f : lists) {
//			
//			if(f.isFile()) { //isFile은 파일이지 아닌지 (폴더랑 파일은 다른 것임) => true / false
//				//폴더만 가져올려면 f.isDirectory
//				String ss = f.getName();
//				System.out.println("파일 이름 :" + ss);
////				System.out.println(ss.substring(ss.indexOf(".")+1)); 
//				// 파일명에 .이 들어갈 수 있으니 뒤에서 찾는게 더 좋음
//				// 파일 확장자를 찾는 다는 가정하에
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1)); //뒤에서 찾는 것임

//			}
//			
//			
//		}
		
		
		String msg1 = "                    Hello Java!! ";
		System.out.println(msg1.length());
		String ss = msg1.trim();
		System.out.println(ss.length());
		// trim() => 공백문자 제거 좌우 (처음과 끝만 제거 함)
		// trim() => ID/PW, 검색에서 많이 씀
		String msg2 = "Java Oracle HTML CSS JavaScript JSP SpringFramework VueJS "
				+ "SpringBoot Git GitAction Docker Docker-compose Jenkins "
				+ "React Next TypeScript MSA Chatting NodeJS";
		
		String[] dates = msg2.split(" ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 입력 :");
		String d = scan.next();
		
		for(String data:dates) {
			//System.out.println(data); //시작하는 문자열이 같은 것
//			if(data.startsWith(d)) {
//				System.out.println(data);
//			}
			
//			--------------------------------------------------------
			
//			if(data.endsWith(d)) { //끝나는 문자열이 같은 것
//				System.out.println(data);
//			}
			
//			--------------------------------------------------------
			
//			if(data.contains(d)) { //검색할 때
//				System.out.println(data);
//			}	
			
//			--------------------------------------------------------
			
//			if(data.equals(d)) { //문자를 비교하는 것인데 대문자 소문자 구분함
//				System.out.println(data);
//			}	
			
//			--------------------------------------------------------

			if(data.equalsIgnoreCase(d)) { //문자를 비교하는 것인데 대문자 소문자 구분 안함
				System.out.println(data);
			}	
		}
	}

	
	
	
	
}

