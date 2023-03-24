package kr.ac.kopo.day14.baseballgame;

import java.util.Random;

public class NumberOfCom {
	
	Random r;
	
	int random1;
	int random2;
	int random3;
	
	NumberOfCom(){
	
		r = new Random();			
	}
	
	int[] nextInt() {
		
		while(random1 == random2 || random2 == random3 || random3==random1) {
			
			random1 = r.nextInt(10);
			random2 = r.nextInt(10);
			random3 = r.nextInt(10);
			
		}
		
		int[] num = {random1, random2, random3};
		return num;
	}
	
	
	
	
	
	

}
