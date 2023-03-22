package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day10.ScannerUtil;

public class Figure {
	
	ScannerUtil scan = new ScannerUtil();
	int line;
	
	Figure(){
	
	}	
	
	Figure(int line){
		this.line = line;
	}
	
	public void setLine(int line){
		this.line = line;
		
	}
	
	public int getLine() {
		return line;
	}
	
}
