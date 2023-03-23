package kr.ac.kopo.day13;

public class CastMain01 {
	
	public static void print(Parent p) {	//다른 애들이 부모에게 상속받은 애들이기 때문에 매개변수의 묵시적 형변환 가능.
		p.info();
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		Child01 c01 = new Child01();
		c01.info();
		
		Child02 c02 = new Child02();
		c02.info();
		
		Parent p = new Parent();
		p.info();
		
		
		
		
		
		/*
		Child01 c01 = new Child01();
		c01.info();
		c01.sleep();
		c01.study();
		
		Parent p = new Child01();
		p.info();
//		p.sleep();  //접근불가
//		p.study();  //접근불가 
		 */
	}

}
