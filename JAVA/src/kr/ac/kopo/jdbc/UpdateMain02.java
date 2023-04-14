package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class UpdateMain02 {
	
	public static void main(String[] args) {		//1.7버전의 try문을 쓰려면 쿼리가 미리 만들어져 있어야 한다!
		
		String sql  = "update t_test ";
			   sql += "   set name = ? ";
			   sql += "where id = ? ";
		try (
			//String sql = "uadate t_test ";	String은 오토클로저블을 상속받고 있지 않기 때문에 에러가 남
			Scanner sc = new Scanner(System.in);
			Connection conn = new ConnectionFactory().getConnection();
				
			PreparedStatement pstmt = conn.prepareStatement(sql);	//여기서 쿼리를 받아와야됨.. 이전에 쿼리가 만들어져있어야 함
			){
				System.out.print("아이디를 입력 : ");
				String id = sc.nextLine();
				System.out.print("변경할 이름을 입력 : ");
				String name = sc.nextLine();
				
				pstmt.setString(1, name);
				pstmt.setString(2, id);
				
				int cnt = pstmt.executeUpdate();
				if(cnt == 0) {
					System.out.println("해당 아이디가 존재하지 않습니다");
				} else {
					System.out.println("이름 변경이 완료되었습니다.");
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
