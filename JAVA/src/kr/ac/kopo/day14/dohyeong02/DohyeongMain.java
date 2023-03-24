package kr.ac.kopo.day14.dohyeong02;

public class DohyeongMain {
	
	public static void main(String[] args) {
		
		Figure f= new Circle(10);	//묵시적 형변환, 모두 묵시적 형변환 해서 다른 클래스의 메소드에 Figure f만 넘기면
									//new로 선언된 것에 따라 그 것이 출력되게 된다. Figure f의 모양이 다양한 것! 이것이 다형성이다!!!!!!
		
		f.printArea();
		
		Triangle t =new Triangle(3,5);
		t.printArea();
		
		Rectangle r = new Rectangle(3,5);
		r.printArea();
		
		Square s = new Square(3);
		s.printArea();
		
	}

}
