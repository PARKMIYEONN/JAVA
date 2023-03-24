package kr.ac.kopo.day14.dohyeong02;

public class Rectangle extends PlainFigure{
	
	protected String name;
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
		double area = width * height;
		setArea(area);
		name = "직사각형";
	}
	
	public void printArea() {
		System.out.printf("밑변 %d, 높이 %d인 %s의 넓이 : %f\n",getWidth(), height, name, getArea());
	}

}
