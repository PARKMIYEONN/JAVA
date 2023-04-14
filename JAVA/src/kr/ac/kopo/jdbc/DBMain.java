package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBMain {
	
	public static void main(String[] args) {
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			
			//2. DB접속								//이 메소드의 리턴타입이 Connection 객체라서 이렇게 쓸 수 있는 것임
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("DB연결 성공...");
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
	}

}
