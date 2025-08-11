






class Student{
	int hakbun;
	String name;
	String sex;
	
	//new를 이용할 때마다 따로 생성
	static String schoolName = "SIST";
	//메모리 공간이 1개 생성 => 공유 변수
	// 데이터를 모아서 관리
	
}


public class 클래스_변수종류 {

	public static void main(String[] args) {
		// 첫번째 학생 생성
		Student hong = new Student();
		//hong(메모리 주소)
		//Student@1f021e6c ==> hakbun / name / sex
		
		System.out.println(hong);
		
		hong.hakbun = 1;
		hong.name = "아리가또";
		hong.sex = "남";
		
		System.out.println("학번 : " +hong.hakbun + "\n이름 : " + hong.name + "\n성별 : " + hong.sex+ "\n학교명 : " + hong.schoolName);
		System.out.println();
//		--------------------------------------------------------------------------------------------
		Student sim = new Student();
			
		System.out.println(sim);
		sim.hakbun = 2;
		sim.name = "심청이";
		sim.sex = "여";
		
		hong.name = "홍길동1";
		hong.schoolName = "SIST2";
		sim.schoolName = "SIST3";
		Student.schoolName = "SIST4";
		
		System.out.println("학번 : " +sim.hakbun);
		System.out.println("이름 : " +sim.name);
		System.out.println("성별 : " +sim.sex);
		System.out.println("학교명 : " +sim.schoolName);
		System.out.println("학교명 : " +hong.schoolName);

	}

}
