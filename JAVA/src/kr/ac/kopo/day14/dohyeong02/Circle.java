package kr.ac.kopo.day14.dohyeong02;

public class Circle extends Figure{
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;			//기본적으로 만드는 것들은 만들어 두는 것이 좋음. 그 후에 쓸지말지 생각해봐
		
		double area = radius * radius * Math.PI;
		setArea(area);
	}

	@Override
	public void printArea() {
		System.out.println("반지름 : " + radius + "인 원의 넓이 : " + getArea());
		
	}
	
	
	

}
