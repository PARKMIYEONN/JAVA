package kr.ac.kopo.day13.abs01;

public class SamsungPrinter extends Printer{
	
	public void samPrinter() {
		System.out.println("삼성프린터에서 출력합니다...");
	}

	@Override
	public void print() {
		System.out.println("삼성프린터에서 출력중...");
		
	}

}
