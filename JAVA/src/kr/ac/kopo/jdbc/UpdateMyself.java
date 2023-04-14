package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class UpdateMyself {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("수정 전 이름을 입력하세요 : ");
			String oriName = sc.nextLine();
			System.out.print("수정 후 이름을 입력하세요 : ");
			String newName = sc.nextLine();
			
			String sql = "update t_test set name = ? where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newName);
			pstmt.setString(2, oriName);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 수정되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}

}
