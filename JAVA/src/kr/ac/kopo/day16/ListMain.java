package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
  	LIST
  	특징 : 중복O, 순서O
  	구현클래스
  	 	-ArrayList
  	 	-LinkedList
  	 	
  	메소드
  	 	- add() : 데이터 삽입
  	 	- get() : 특정위치의 데이터 조회
  	 	- remove() : 특정위치 또는 특정값을 가진 데이터를 삭제
  	 	- clear() : 전체 데이터를 삭제
  	 	- size() : 리스트의 전체 원소 개수를 조회
  	 	- isEmpty() : 리스트가 비어있는지 여부 판단
  	 	- contains() : 특정 데이터 존재 여부 판단
  	 	- addAll() : 다른 리스트의 원소들을 전체 추가 
 */

public class ListMain {
	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();	//둘을 바꿔줘도 아무 문제 없이 돌아간다
		
		System.out.println("list : " + list);
		System.out.println("전체원소의 개수 : " + list.size());
		
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println("전체원소의 개수 : " + list.size());
		System.out.println("list : " + list);
		
		System.out.println("0번지 데이터 : " + list.get(0));
		System.out.println("0번지 삭제 데이터 : " + list.remove(0));
		System.out.println("list : " + list);
		System.out.println("remove(0) 후 0번지 데이터 : " + list.get(0));
		
		//three 와 four 사이에 ten을 넣고싶어 == 2번지에 ten을 넣고싶어
		list.add(2, "ten");		// 이렇게 적으면 된단다
		System.out.println("list : " + list);
		
		System.out.println("< 인덱스 통한 전체 데이터 출력 > ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 1.5버전의 for문 전체 데이터 출력 >");
		for(String str : list) {		//(배열같은)list에 들어있는 String 데이터를 출력
			System.out.println(str);
		}
		
		for(String str : list) {
			if(str.equals("three")) {		//문자열이 같은지 보려면 이퀄스를 사용해야 함 참조변수라 다른 공간에 저장되기 때문
				System.out.println(str);
				
			}
		
		}
		
		System.out.println("three 문자열 존재 여부 판단 : " + list.contains("three"));
																	//몇번째 있는지는 몰라서 우리가 직접 검색해봐야 한다
		
		list.remove("three");	//three를 지워버리면
		
		System.out.println("three 문자열 존재 여부 판단 : " + list.contains("three"));
																	//three가 없으니까 false
		
		System.out.println("list : " + list);
		List<String> subList = new ArrayList<String>();
		subList.add("하나");
		subList.add("둘");
		subList.add("셋");
		list.addAll(subList);
		System.out.println("addAll() 후 list : " + list);
		
												//list를 큐처럼 사용하고 싶으면 삽입은 add로 삭제는 0번째부터
												//list를 스택처럼 사용하고 싶으면 삽입은 add 0번지에 로 삭제는 0번지부터
		
	}

}
