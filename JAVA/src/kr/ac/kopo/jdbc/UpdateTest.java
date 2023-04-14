package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oralce.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("수정 전 이름 : ");
			String beforeName = sc.nextLine();
			System.out.print("수정 후 이름 : ");
			String newName = sc.nextLine();
			
			String sql = "update t_test set name = ? where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newName);
			pstmt.setString(2, beforeName);
			
			int cnt = pstmt.executeUpdate();
			System.out.print(cnt + "개의 변화 발생");
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
