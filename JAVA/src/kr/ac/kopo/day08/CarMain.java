package kr.ac.kopo.day08;

// 실행클래스
public class CarMain {
	
	public static void main(String[] args) {
		
							// Car 자료형의 위치를 받는 참조변수 c
		Car c = new Car(); //new를 사용했으니까 heap영역에 인스턴트객체 Car가 만들어진 것.
		//c.model : c라는 참조변수 주소에 있는 자동차의 model = 참조변수명.멤버변수
		//인스턴트객체가 여러개였을 때 참조변수로 애들을 구분한다.
		
		c.model = "소나타";
		c.price = 3000;
		
		Car c2 = new Car();
		
		c2.model = "모닝";
		c2.price = 1900;
		
		System.out.println("모델명 : " + c.model + ", 가격 : " + c.price + "만원");
		System.out.println("모델명 : " + c2.model + ", 가격 : " + c2.price + "만원");
		
		new kr.ac.kopo.day08.Car(); //풀네임. 원래는 다 적어야 하지만 같은 패키지 안에 있으면 다 적어줄 필요 없음.
		
		
	}

}
