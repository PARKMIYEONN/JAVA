package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 	MAP : key, value의 쌍으로 이루어진 데이터 집합
 * 		: 순서x, key에 대한 중복x
 * 	구현 클래스
 *  	-HashMap
 *  	-TreeMap
 *  메소드
 *  	-put(k, v)		:데이터 입력
 *  	-get(k)			:key쌍에 해당 value 반환
 *  	-containskey(k)	:해당 key 존재여부 판단
 *  	-remove(k)		:key에 해당되는 value 삭제
 */
public class MapMain01 {
	/*
	 * 	비밀번호 변경서비스 구현
	 * 	- 특정 아이디에 대한 패스워드 변경
	 *  - 중복 아이디가 존재x
	 *  - 아이디 : key, 패스워드 : value
	 */
	
	public static void main(String[] args) {
		
		Map<String, String> members = new HashMap<String, String>();	//여기에 있는 데이터타입이 엔트리에 동일하게 들어가야 함
		members.put("aaa", "1111");
		members.put("bbb", "2222");
		members.put("ccc", "3333");
		members.put("ddd", "4444");
		
//		System.out.println("전체 회원수 : " + members.size());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		if(!members.containsKey(id)) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);	//종료했다면 if를 만족한 것이기 때문에 if를 만족하지 않으면 종료 안됨. else를 쓰지 않아도 됨
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!members.get(id).equals(password)) {	//만약 id가 null이라면 이퀄스를 호출할 수 없음. 우린 위에서 존재한다고 아니까 괜츈
												//만약 그게 아니라면 오류가 발생할 수 있기 때문에 null이 있는지 확인해줘야함.
			System.out.println("입력한 패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 새로운 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		members.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다.");
		
		System.out.println("< 전체 회원 목록 >");
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("--------------------");
		
		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + members.get(key));
		}
		
//		Set<Map.Entry<String, String>> entrySet = members.entrySet();	//Entry만 쓰고싶으면 import를 Map.Entry까지 해줘
//		for(Map.Entry<String, String> e : entrySet) {	//private인 키와 밸류를 뽑아내려면 getter 사용 필요 
//			System.out.println(e.getKey() + "\t" + e.getValue());
//		}
		
		System.out.println("--------------------");
	}

}
