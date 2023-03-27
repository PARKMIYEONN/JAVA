package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain04 {
	
	public static void main(String[] args) {
		
		System.out.println("====== start ======");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {									//발생될 수 있는 문제점에 대해서 대처할만한 건 모두 if를 걸어주는 게 맞지만
												//개발자가 모두 알고 대비 할 수 있는 게 아니기 때문에 안전장치를 걸어주는 것
		System.out.println("random : " + random);
		System.out.println(10/random);
		
		String str = "hello";
		System.out.println(str.charAt(5));	//캐치에 다른 종류의 예외가 있으면 처리가 안 됨
		
		} catch(Exception e) {	// 모든 예외클래스는 Exception클래스를 상속받는다 : 묵시적 형변환 가능
								// e 하나로 모든 예외처리 가능
			e.printStackTrace();
		}
		
		System.out.println("======  end  ======");
		
	}

}
