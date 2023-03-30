package kr.ac.kopo.day10.homework;

import java.util.Random;

public class Dice implements Game{
	
	public int startGame(int you) {
		Random r = new Random();
		int me = r.nextInt(6)+1;
		
		if(me == you) {
			System.out.println("You win");
			return 1;
		} else {
			System.out.println("You lose");
			
		}
		return 0;
	}

}
