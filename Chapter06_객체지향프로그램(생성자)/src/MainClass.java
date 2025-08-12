/*
 * 사원 = Emp
 * 		 empno, ename, job, mgr, hiredate, sal, comm, deptno
 * 
 *  14명 저장
 * 
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


public class MainClass {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@211.238.142.124:1521:XE";
		Connection conn = DriverManager.getConnection(url,"hr", "happy");
		String sql = "SELECT empno,ename, job, sal, deptno FROM emp";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int empno = 0, sal = 0, deptno=0;
		String ename = "", job = "";
		
		while(rs.next()) {
			empno = rs.getInt(1);
			ename = rs.getString(2);
			job = rs.getString(3);
			sal = rs.getInt(4);
			deptno = rs.getInt(5);
		}
		
	}

}
