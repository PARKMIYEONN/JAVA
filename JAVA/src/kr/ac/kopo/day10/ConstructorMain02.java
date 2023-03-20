package kr.ac.kopo.day10;

public class ConstructorMain02 {
	
	public static void main(String[] args) {
		/*
		Member m = new Member();
		m.name = "홍길동";
		m.age = 25;
		m.bloodType = "A";
		*/
		
		Member m = new Member("홍길동", 25, "A");  //이런 사람을 하나 만들 때 특징을 정의하며 멤버변수값을 초기화 할 때 사용하는 게 생성자.
													// 사람이 하는 행동을 만드는 것들이 메소드.
		Member m2 = new Member();
		Member m3 = new Member("홍길순");
		Member m4 = new Member("강길동", 30);
		
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
		
		}

}
