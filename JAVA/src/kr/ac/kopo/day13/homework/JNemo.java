package kr.ac.kopo.day13.homework;

public class JNemo extends Nemo {
	
	
	JNemo(){
		
	}
	
	JNemo(int line){
		super.line = line;
	}
	
	@Override
	public void area() {
		System.out.print("한변이 " + line + "인 삼각형의 넓이는 " + line*line + "입니다");
	}
	
	@Override
	public void input() {
		System.out.print("한변을 입력하세요 : ");
		line = sc.nextInt();
	}

}
