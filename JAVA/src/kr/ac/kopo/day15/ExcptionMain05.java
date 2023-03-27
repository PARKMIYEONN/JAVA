package kr.ac.kopo.day15;

public class ExcptionMain05 {
	
	public static void main(String[] args) {

		System.out.println("===== start =====");
		try {
			String str = "hello";
//			String str = null;

			System.out.println("length : " + str.length());

			return;				// 부른 곳으로 돌아가며 소프트웨어가 종료된다 
								// try catch finally는 한 몸이기 때문에 중간에 return이 있어도 finally가 실행된다 
		} catch (Exception e) {
			System.out.println("예외발생!");
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행됩니다");
		}
		System.out.println("=====  end  =====");
	}

}
