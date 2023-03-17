package kr.ac.kopo.day09;

public class Method {
	
	int data = 10; //멤버변수 : 클래스의 객체가 가지고 있는 특징
					//같은 클래스 내의 메소드들은 멤버변수를 공유할 수 있다.
					//but 지역변수는 공유불가
	
	void call()	{
		System.out.println("call() 메소드 호출...");
	}
	
	// int call() {} : 리턴타입은 상관이 없음. 위와 같은 메소드임.
		
	
	
		//메소드 오버로딩(Overloading) : 
		//		같은 클래스 내에 동명의 메소드가 존재하지만 매개변수가 달라 다른 메소드가 되는 것.
		//		같은 동작의 메소드들이 매개변수만 다를 때 주로 사용

	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	} 
	
		//선언된 변수 중 자신의 값에 가장 가까운(범위가 좁은) 놈으로 골라잡음.
	
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(String s, int i) {
		System.out.println("call(String, int) 메소드 호출...");
	}
	
	

}
