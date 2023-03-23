package kr.ac.kopo.day13.homework;

public class Won extends Figure{
	
	Won(){
		
	}
	
	Won(int line){
		this.line = line;
	}
	
	@Override
	public void area() {
		System.out.printf("반지름이 %d인 원의 넓이는 %.4f입니다", line, line*line*Math.PI);
	}
	
	@Override
	public void input() {
		System.out.print("반지름을 입력하세요 : ");
		line = sc.nextInt();
	}

}
