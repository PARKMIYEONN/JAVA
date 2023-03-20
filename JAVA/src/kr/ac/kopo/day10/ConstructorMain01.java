package kr.ac.kopo.day10;

/*
 * 	생성자 특징
 * 	1. 클래스명과 동일
 * 	2. 반환값 존재 안함 (ex : void를 쓰면 메소드로 인식해서 안됨)
 * 	3. default 생성자 지원 : 클래스내에 생성자가 하나도 정의되어 있지 않은 경우
 * 							JVM에서 자동으로 생성
 * 	4. 생성자 오버로딩 지원
 * 	5. 멤버변수값을 초기화
 */
class Dog{
	
	Dog() {
		System.out.println("디폴트 생성자 Dog() 호출......");
	}
				//생성자 오버로딩
	Dog(int i){
		System.out.println("Dog(int) 생성자 호출...");
	}
}

public class ConstructorMain01 {
	
	public static void main(String[] args) {
		
		new Dog();
		new Dog(10); //매개변수가 있는 생성자는 디폴트로 만들 수 없음.
		
							//매개변수가 있는 생성자를 만들고 싶으면 매개변수가 없는 디폴트 생성자를 하나 만들어 놓고 만드는 게 좋음.
	}

}
