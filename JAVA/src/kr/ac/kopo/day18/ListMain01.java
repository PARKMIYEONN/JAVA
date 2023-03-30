package kr.ac.kopo.day18;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMain01 {
	
	public static void main(String[] args) {
		
		int cntID = 0;
		
		
		List<Member> members = new LinkedList<Member>();
		Member member1 = new Member("aaa", "1111");
		Member member2 = new Member("bbb", "2222");
		Member member3 = new Member("ccc", "3333");
		Member member4 = new Member("ddd", "4444");
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경 서비스 ***");
		System.out.print("아이디를 입력하세요");
		String id = sc.nextLine();
		for(int i = 0; i < members.size() ; i++) {
			if((members.get(i)).getID().equals(id)){
				break;
			} else {
				cntID++;
			}
		}			
		if(cntID == members.size()) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!(members.get(cntID)).getPassword().equals(password)){
			System.out.println("입력한 패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 새로운 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		(members.get(cntID)).setPassword(newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		System.out.println("< 전체 회원 목록 > ");
		System.out.println("------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("------------------");
		
		for(int i = 0; i < members.size(); i++) {
			System.out.println((members.get(i)).getID() + "\t" + (members.get(i)).getPassword());
		}
		
	}

}
