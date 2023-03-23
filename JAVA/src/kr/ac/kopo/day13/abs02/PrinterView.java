package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {
	
	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		System.out.print("출력할 프린터를 선택하세요(1. LG 2. SAMSUNG) :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1: 
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2:
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrinter();
			break;
		
		}
		
		
	}

}
