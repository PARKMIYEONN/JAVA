package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 3단계
			Scanner sc = new Scanner(System.in);

			System.out.print("삽입할 ID를 입력 : ");
			String id = sc.nextLine();

			System.out.print("삽입할 이름을 입력 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name) values(?, ?) ";
			pstmt = conn.prepareStatement(sql); //sql을 여기서 넣어준다
			pstmt.setString(1, id); //데이터베이스는 메모리에 대한 개념이 아니기 때문에 1부터 시작한다 1번 ?. 2번 ?.
			pstmt.setString(2, name); //들어가는 데이터가 문자열이면 작은 따옴표가 자동으로 들어감
			
			// 4단계
			int cnt = pstmt.executeUpdate(); //이미 pstmt객체 만들 때 sql을 넣어줬기 때문에 여기는 들어가지 않는다
			System.out.println("총 " + cnt + "개 행 삽입...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 5. 종료
			JDBCClose.close(pstmt, conn);
		}

	}

}
