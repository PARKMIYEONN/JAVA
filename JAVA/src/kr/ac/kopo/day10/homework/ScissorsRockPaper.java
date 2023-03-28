package kr.ac.kopo.day10.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game{
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	@Override
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(2) + 1;
		
		if(you > me) {
			System.out.println("You win");
			return 1;
		} else if(you < me){
			System.out.println("You lose");
		} else {
			System.out.println("비겼습니다");
		}
		return 0;
	}

}
