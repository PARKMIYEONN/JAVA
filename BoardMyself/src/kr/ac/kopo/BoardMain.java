package kr.ac.kopo;

import kr.ac.kopo.ui.BoardUI;

public class BoardMain {
	
	public static void main(String[] args) {
		
		BoardUI bu = new BoardUI();
		try {
			bu.execute();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
