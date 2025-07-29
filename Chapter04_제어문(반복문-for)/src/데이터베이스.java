import java.util.*;
import java.sql.*;


public class 데이터베이스 {

	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@211.238.142.124:1521:xe";
		Connection conn = DriverManager.getConnection(url, "hr", "happy");
//		String sql = "SELECT empno, ename, job, sal FROM emp";		
		String sql = "SELECT title, singer  FROM genie_music";	
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
//			-------------------------------------------------------------------------
//			int empno = rs.getInt(1);
//			String ename = rs.getString(2);
//			String job = rs.getString(3);
//			int sal = rs.getInt(4);
//			
//					
			//급여가 1000이상 4000이하
//			if(empno % 2 ==0) {
//
//			if(sal >= 1000 && sal <= 4000) {
//				
//				System.out.println(empno + " : " + ename +" : "  + sal);
//				
//			}
//-------------------------------------------------------------------------
			String title = rs.getString(1);

			String singer = rs.getString(2);
		
			if(singer.contains("임영웅"))
			System.out.println(title + " "+ singer);
			
			
		}
	}

}
