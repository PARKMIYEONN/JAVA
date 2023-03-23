package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class UlMa {
	
	private Scanner sc = new Scanner(System.in);
	
	public void gyesan() {
		
		System.out.println("1. 삼각형 2. 정사각형 3. 직사각형 4. 원");
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		int dh = sc.nextInt();
		sc.nextLine();
		
		Figure f = null;
		switch(dh) {
		case 1:
			f = new Semo();
			break;
		case 2:
			f = new JNemo();
			break;
		case 3:
			f = new Nemo();
			break;
		case 4:
			f = new Won();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		if(f != null) {
			f.input();
			f.area();
		}
	}

}
