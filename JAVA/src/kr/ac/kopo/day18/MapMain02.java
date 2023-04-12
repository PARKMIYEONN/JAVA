package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private String name;
	private String phone;
	
	Employee(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	
	@Override						//객체와 객체가 같다고 판단하게 하기 위한 메소드를 이클립스가 만들어준다								
	public int hashCode() {			//해시코드가 같게 만들어줌
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {			//이퀄스메소드로 문자열 비교
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;	//명시적 형변환
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}


/*
	@Override
	public boolean equals(Object obj) {				//이거 시험에 나온다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Employee e2 = (Employee)obj;
		if(this.name.equals(e2.name) && this.phone.equals(e2.phone)) {
			return true;
		}
		return false;
		
		//
		if(this.name.equals(((Employee)obj).name)) {	//각각의 스트링을 비교한다면 이퀄스로 비교
														//obj는 오브젝트형이라서 묵시적 형변환으로 
														//임플로이클래스의 네임에 접근 못해
														//명시적 형변환 필요
			return true;
		}
		return false;
		//
	}*/
	
	
}

class Car{
	String model;
	String no;
	
	Car(String model, String no){
		this.model = model;
		this.no = no;
	}
}

public class MapMain02 {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		String s2 = new String("Hello");
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());	//문자열이 같다라는 뜻은 이퀄스값이 트루이면서 해시코드가 같다는 것임
		
		Employee e = new Employee("홍길동", "010-1111-2222");
		Employee e2 = new Employee("홍길동", "010-1111-2222");	//두개가 같니 다르니
		if(e.equals(e2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(e.toString());
		System.out.println(e2.toString());	//같은 데이터를 갖고있는데도 해시태그가 달라.
											//힙영역의 주소값을 기억하는 가상의 주소
		
		Map<Employee, Car> carList = new HashMap<>();	//앞쪽 <>에 타입이 적혀있으면 뒤는 채우지 않아도 된다.
		carList.put(new Employee("홍길동", "010-1111-2222"), new Car("소나타", "123나4567"));
		carList.put(new Employee("고길동", "010-3333-4444"), new Car("산타페", "234라3416"));
		carList.put(new Employee("한길동", "010-7777-8888"), new Car("K5", "567무2478"));
		
		carList.put(new Employee("홍길동", "010-1111-2222"), new Car("벤츠", "345구7367"));
		
														//객체와 객체가 같은지 아닌지를 판단할 때 주소비교가 아니라 이퀄스를 쓴다
														//오브젝트 클래스 안의 이퀄스 메소드를 쓴다
														//오브젝트 클래스의 이퀄스 메소드는 뭐가 올지 몰라서 주소비교야
														//객체비교에서 이퀄스를 쓰려면 클래스 내에서 오버라이딩 해줘야돼
														//객체와 객체가 같다고 하는 의미는
														//이퀄스메소드가 같으면서 해시코드가 같아야 함. 
														//둘 다 만족해야 같은 것!!!!!
		
		System.out.println("등록된 차량대수 : " + carList.size());
		
	}

}

