package kr.ac.kopo.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  	Set : 순서x, 중복x
  	구현클래스
  		-HashSet
  		-TreeSet
  	메소드
  		-add()		:데이터 삽입
  		-contains()	:데이터 존재여부 판단
  		-remove()	:특정데이터 삭제
  		-clear()	:전체데이터 삭제
  		-size()		:크기
  		-isEmpty()	:비어있는지 체크
 */

public class SetMain {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();	
											//1.7버전부터 <>사이엔 어차피 같은 것이 오기 때문에 생략 가능(set이 기억)
		set.add("one");
		System.out.println("add(two : " + set.add("two"));	//true 
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("add(two) : " + set.add("two"));	//false : 아예 set에 이 값이 입력되지 않음. 덮어쓰기 아님. 
		System.out.println("set값 : " + set); //입력 순서가 아닌 다른 방식으로 출력이 된다.(해시셋의 정렬에 따라 출력)
		
//		System.out.println("remove(two) : " + set.remove("two")); //true 리무브는 boolean형이다
//		System.out.println("remove(two) : " + set.remove("two")); //false 삭제불가 이미 삭제되었음
		
		System.out.println(set.remove("two") ? "삭제성공" : "존재하지 않음");
		System.out.println(set.remove("two") ? "삭제성공" : "존재하지 않음");	//이미 삭제되었음
		
		
		
		
		/*
		// "two"가 존재하면 삭제하고 "삭제성공", 존재하지 않으면 "존재하지 않음" 출력
		if(set.contains("two")) {
			set.remove("two");
			System.out.println("two 데이터 삭제성공");
		} else {
			System.out.println("\"two\"데이터 존재하지 않음");
		}
		*/
		
		
		/*
		  Set 전체데이터 접근방식
		  1. 1.5버전의 for문 이용
		  2. toArray() 메소드 이용
		  3. Iterator객체 이용 : 데이터가 몇개인지는 모르지만 데이터의 처음부터 마지막까지 접근할 수 있게 하는 순환자 객체
		 */
		System.out.println("< 1.5버전의 for문 이용 >");
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println("< toArray()메소드 이용 >");
		Object[] dataArr = set.toArray();	//set의 데이터들을 고정된 개수만큼의 배열로 반환
											//배열의 출력방식과 동일
		for(int i = 0; i < dataArr.length; i++) {
			System.out.println(dataArr[i] + " \tlength : " + ((String)dataArr[i]).length());
																	//dataArr는 오브젝트형이라서 렝쓰 바로 적용 안됨. 
																	//스트링으로 명시적 형변환 필요
		}
		
		/*
		 *  Iterator 주요 메소드
		 *  hasNext()	: 다음데이터 존재여부 판단
		 *  next()		: 다음으로 데이터를 이동
		 *  	
		 */
		
		
		System.out.println("< Iterator 객체 이용 >");
		set.iterator(); 	//이터레이터 객체를 리턴
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());	//이터레이터로 처음부터 끝 데이터까지 접근. 다음 데이터가 있으면 출력 후 그 다음 데이터로 이동
		}
		
		
		
	}

}
