
/*
 * 	증감 연산자 => 제어문(반복문)
 * 		=> ++ 1중가
 * 		=> -- 1감소
 * 		1) 전치 연산자 (++a) 먼저 1증가
 * 		2) 후치 연산자 (a++) 나중에 1증가
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class 증감연산자 {

	public static void main(String[] args) {

		int a= 10;
		int b =++a;
		System.out.println("a="+ a + " ,b=" + b);
		
		a = 10;
		b = a++;
		System.out.println("a="+ a + " ,b=" + b);
		
		a=10;
		b=++a + ++a;
		System.out.println("a="+ a + " ,b=" + b);

		a=10;
		b=a++ + a++;
		System.out.println("a="+ a + " ,b=" + b);
		
		a=10;
		b=--a;
		System.out.println("a="+ a + " ,b=" + b);
		
		a=10;
		b=a--;
		System.out.println("a="+ a + " ,b=" + b);
		
		a=10;
		a++;
		a--;
		--a;
		++a;
		a++;
		System.out.println("a="+ a);
		
		a++;
		a++;
		a--;
		System.out.println("a="+ a);
		
		/*
		 * double d = 123456.78;
		 * int i = 123456;
		 * int a1 =(int)((d-i)*100);
		 */
		
		double d = 123456.78;
		int i = 123456;
		int a1 =(int)((d-i)*100);
		System.out.println("a1="+ a1);
		//ㄴ비트를 맞추지 않았기 때문에 소수점은 잘라서 인용
		
		double d1 = 123456.78f;
		int i1 = 123456;
		int a2 =(int)((d1-i1)*100);
		System.out.println("a2="+ a2);
		
		char c = 'A';
		char c1 = c++;
		System.out.println(c);
		System.out.println(c1);
		
	}

}
