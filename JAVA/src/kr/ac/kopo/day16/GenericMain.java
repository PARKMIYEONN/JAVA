package kr.ac.kopo.day16;

import kr.ac.kopo.day15.inter.LGTV;

class A {
	
	private Object member;
	
	A(Object member){
		this.member = member;
	}
	
	Object getMember(){
		return member;
	}
}

class B<T> {				// T 알파벳은 변수처럼 타입이 들어오는 것임.. 맘대로 쓰면 됨
	
	private T member;		// <>에 들어오는 데이터에 따라 타입을 다르게 바꾸고 싶다
	
	B(T member){
		this.member = member;
	}
	
	T getMember() {
		return member;
	}
}

class List<T> {		//모든 타입을 다루기 위해서 리스트를 제너릭 형으로 만들어 놓았단다
	
}

public class GenericMain {
	
	public static void main(String[] args) {	
		
		B<String> b1 = new B<String>("hello");			//제너릭
		B<LGTV> b2 = new B<LGTV>(new LGTV());			//제너릭		컴파일 시점에 데이터타입이 맞는지 틀린지 알 수 있음
		String data = b1.getMember(); //리턴값 String
		System.out.println("문자열의 길이 : " + data);		//명시적 형변환 필요 없음
		b2.getMember(); //리턴값 LGTV
		
		
		
		A a1 = new A("hello");
		
		String str = (String)a1.getMember();		//getMember의 리턴타입은 Object형이다 문자열로 받으려면 명시적 형변환 필요
		System.out.println("문자열의 길이 : " + str.length());
		
		A a2 = new A(new LGTV());					
		LGTV tv = (LGTV)a2.getMember();				//명시적 형변환 필요	불편하잖아?? 이걸 해결하기 위해 Generic이 나왔어
		tv.powerOn();
		
		// List list
				
		
		
		/*
		ArrayList list = new ArrayList();		//같은 타입의 데이터만 모아놓은 배열을 만들고 싶어 사용하는 것이 Genric
		
		list.add("Hello");	 	//문자열
		list.add(new Car()); 	//카형				묵시적 형변환 Object형으로 되어있음
		list.add(new LGTV());	//엘지티비형	
		
		(Car)list.get(1);
		*/
		
	}

}
