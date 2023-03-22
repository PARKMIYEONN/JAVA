package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day10.ScannerUtil;

public class Calculator {
	
	public void calculator() {
		
		ScannerUtil scan = new ScannerUtil();
		
		System.out.print("1. 삼각형 2. 정사각형 3. 직사각형 4. 원\n");
		int shape = scan.nextInt("면적을 구할 도형을 선택하세요");
		
		switch(shape) {
		case 1:
			Triangle t = new Triangle();
			t.input();
			System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이는 %d입니다", t.getLine(), t.getWidth(),t.getWidth()*t.getLine()/2);
			
			break;
		case 2:
			Square s = new Square();
			s.input();
			System.out.printf("한변이 %d인 정사각형의 넓이는 %d입니다", s.getLine(), s.getLine()*s.getLine());
			
			break;
		case 3:
			Rectangle r = new Rectangle();
			r.input();
			System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이는 %d입니다", r.getLine(), r.getHeight(), r.getLine()*r.getHeight());
			
			break;
		case 4:
			Circle c = new Circle();
			c.input();
			System.out.printf("지름 %d인 원의 넓이는 %.2f입니다", c.getLine(), c.getLine()*c.getLine()*3.14/4);
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			
		}
		
	}

}
