package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("홀수를 입력 : ");
		int num = sc.nextInt();
		try {

			if (num % 2 != 1) {
				throw new OddMismatchException("입력하신 정수 [" + num + "] 는 홀수가 아닙니다");
				
			//	throw new Exception("입력한 정수가 홀수가 아닙니다"); // 예외가 발생했으니 얘를 던지겠다!!
			}
			System.out.println("num : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}											//실제로는 예외가 아니지만 이 코드 내에선 예외로 처리할 수 있다
													//내장 예외가 아니라서 오류의 이유를 모를 수 있기 때문에 
													//나만의 예외 클래스를 만들고 싶다
													//---> Exception을 상속받은 클래스를 구성하면 된다

		/*
		 * if (num % 2 != 0) {
		 * 
		 * System.out.println("num : " + num); } else { System.out.println("잘못입력했습니다");
		 * }
		 */
	}

}
