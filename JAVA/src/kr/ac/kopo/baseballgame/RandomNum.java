package kr.ac.kopo.baseballgame;

import java.util.Random;

public class RandomNum {
	
	Random r;
	
	int random1;
	int random2;
	int random3;
	
	RandomNum(){
	
		r = new Random();			
	}
	
	int[] nextInt() {
		
		//중복되는 수가 나오면 안됨
		while(random1 == random2 || random2 == random3 || random3 == random1) {
			
			random1 = r.nextInt(10);
			random2 = r.nextInt(10);
			random3 = r.nextInt(10);
			
		}
		
		
		int[] num = {random1, random2, random3};
		return num;
	}
	
	
	
	
	
	

}
