package kr.ac.kopo.day14.dohyeong;

public class Triangle extends PlainFigure{
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		super(width, height);
		double area = width * height /(double)2;	//(2.)해도 실수로 나옴
		setArea(area);
	}
	
	public void printArea() {
		System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 : %f\n",getWidth(), height, getArea());
	}

}
