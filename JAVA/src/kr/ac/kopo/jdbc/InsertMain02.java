package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

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

			String sql = "insert into t_test(id,name) ";
			sql += " values(\'" + id + "\', \'" + name + "\')";

			stmt = conn.createStatement();

			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 5. 종료
			JDBCClose.close(stmt, conn);
		}

	}

}
