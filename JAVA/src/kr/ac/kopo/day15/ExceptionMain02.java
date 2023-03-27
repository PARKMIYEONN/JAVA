package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain02 {
	
	public static void main(String[] args) {
		
		System.out.println("====== start ======");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {
		System.out.println("random : " + random);
		System.out.println(10/random);
		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!");		//예외가 발생하더라도 소프트웨어가 강제적으로 종료되지 않음
			System.out.println(ae.getMessage());	//예외가 발생한 이유를 알 수 있다
			ae.printStackTrace();					//어디서 예외가 발생했는지 알 수 있다
		}
		
		System.out.println("====== end ======");
		
	}

}
