package kr.ac.kopo.day14.baseballgame;

import kr.ac.kopo.day10.ScannerUtil;

public class Input {
	
	public int input() {
		
		ScannerUtil scan = new ScannerUtil();
		
		int seJari = scan.nextInt("중복되지 않는3자리 수를 입력하세요 : ");
		
		return seJari;
		
	}

}
