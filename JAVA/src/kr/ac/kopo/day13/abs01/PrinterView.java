package kr.ac.kopo.day13.abs01;

import java.util.Scanner;

public class PrinterView {
	
	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		System.out.print("출력할 프린터를 선택하세요(1. LG 2. HP) :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		Printer p = null;
		switch(choice) {
		case 1: 
			p = new LGPrinter();	//자식의 인스턴스객체 값을 부모가 받을 수 있다.
			break;
		case 2:
			p = new HPPrinter();
			break;
		default :
			System.out.println("잘못입력하셨습니다");
			}
		if(p != null) {
			
			p.print();
		}
		
		
	}

}
