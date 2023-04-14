package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMainMyself {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			//conn = new ConnectionFactory().getConnection();
			
			String sql = "select TO_CHAR(HIRE_DATE,'YYYY-MM-DD')as hire_date from employees "
					+ "group by TO_CHAR(HIRE_DATE,'YYYY-MM-DD') order by hire_date";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			System.out.println("hire_date");
			System.out.println("----------");
			while(rs.next()) {
				String naljja = rs.getString("hire_date");
				System.out.println(naljja);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}
