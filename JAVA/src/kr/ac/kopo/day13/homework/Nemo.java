package kr.ac.kopo.day13.homework;

public class Nemo extends Figure {
	
	int height;
	
	Nemo(){
		
	}
	
	Nemo(int line, int height){
		this.line = line;
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.print("가로가 " + line + " 세로가 " + height + "인 직사각형의 넓이는 " + line*height + "입니다");

	}
	
	@Override
	public void input() {
		System.out.print("가로를 입력하세요 : ");
		line = sc.nextInt();
		System.out.print("세로를 입력하세요 : ");
		height = sc.nextInt();
	}

}
