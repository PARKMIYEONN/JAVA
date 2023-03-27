package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("====== start ======");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		System.out.println("random : " + random);
		System.out.println(10/random);
		
		System.out.println("====== end ======");
		
	}

}
