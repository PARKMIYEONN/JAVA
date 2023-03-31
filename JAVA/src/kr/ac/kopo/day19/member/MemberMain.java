package kr.ac.kopo.day19.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		List<Member> members = new ArrayList<>();
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "2222"));
		members.add(new Member("ccc", "3333"));
		members.add(new Member("ddd", "4444"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 비밀번호 변경 서비스 ***");
		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine();
		
		Member mem = null;
		for(int i = 0; i < members.size(); i++) {
			if(members.get(i).getId().equals(id)) {
				mem = members.get(i);
				break;
			}
		}
		if(mem == null) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		System.out.print("패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!mem.getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		System.out.print("변경할 패스워드를 입력하세요 : ");
		password = sc.nextLine();
		
		mem.setPassword(password);
		System.out.println("패스워드 변경을 완료하였습니다");
		System.out.println(mem);
		
		System.out.println("--------------------");
		System.out.println("\t전체회원 정보 출력");
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("--------------------");
		for(Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPassword());
		}
		System.out.println("--------------------");
		
	}
}
