package kr.ac.kopo.day13.homework;

public class Semo extends Figure {

	int height;
	
	Semo(){
		
	}
	
	Semo(int line, int height){
		this.line = line;
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.print("밑변이 " + line + " 높이가 " + height + "인 삼각형의 넓이는 " + line*height/2 + "입니다");

	}
	
	@Override
	public void input() {
		System.out.print("밑변을 입력하세요 : ");
		line = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		height = sc.nextInt();
	}

}
