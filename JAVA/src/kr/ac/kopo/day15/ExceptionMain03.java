package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain03 {
	
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
		
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {	//비트연산자 | 로 묶어서 한꺼번에 표현가능
			e.printStackTrace();
		}
		
		
/*		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!");		//예외가 발생하더라도 소프트웨어가 강제적으로 종료되지 않음
			System.out.println(ae.getMessage());	//예외가 발생한 이유를 알 수 있다
			ae.printStackTrace();					//어디서 예외가 발생했는지 알 수 있다
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBounds 예외발생!!");
			se.printStackTrace();
		}
*/		
		System.out.println("======  end  ======");
		
	}

}
