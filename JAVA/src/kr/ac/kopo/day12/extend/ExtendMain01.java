package kr.ac.kopo.day12.extend;

class One{
	One(){
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One{
	Two(){
		super();	//부모에 있는 생성자 호출. 안써도 호출됨.
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two{	//Three는 Two위에 One이 있는지 알 수 없음. 쓰리의 수퍼는 투일 뿐이얌...
	Three(){
		System.out.println("Three() 생성자 호출...");
	}
}

public class ExtendMain01 {
	
	public static void main(String[] args) {
//		new One();
//		new Two();	//부모의 생성자 먼저 생성 후 자식 생성. 그래서 같이 출력됨.
		new Three();
	}

}
