package kr.ac.kopo.day10;

public class Member {
	
	/** 이름 */
	String name;		
	/** 나이 */
	int age;			
	/** 혈액형 */
	String bloodType;
						//this생성자는 생성자 내부 문장 중 맨 첫줄에만 올 수 있다.
	Member(){		//매개변수 갖고있는 생성자를 만들 때 먼저 디폴트 생성자를 만들어 줘라	
		this("알 수 없음"); // = Member("알 수 없음", -1, "알 수 없음");
	}	//매개변수가 없는 생성자를 호출할 때 내부적으로 오버로딩된 다른 생성자를 호출하고 싶을 때 this생성자를 사용한다. 
		//this생성자는 생성자 내부에만 존재 가능.
	
	Member(String name){	
		this(name, -1);
//		this.name = name;  //멤버변수와 지역변수 이름을 같게 쓰고 싶으면 멤버변수 앞에 this.을 붙여주면 됨.
//		this.age = -1;// 보다 직관적인 코드 분석을 위해.
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age){
		this(name, age, "알 수 없음");
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age, String bloodType){	
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : "+ name + " ,나이 : " + age + " ,혈액형 : " + bloodType);
	}

}
