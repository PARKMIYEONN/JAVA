package kr.ac.kopo.day10;

public class Calculator {
	
	int num01, num02;
	
	/**
	 * 디폴트 생성자
	 */
	Calculator(){
		
	}
	/**
	 * 입력받은 수의 사칙연산을 출력하는 메소드
	 * @param num01 입력받는 첫번째 수
	 * @param num02 입력받는 두번째 수
	 */
	Calculator(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	
	void calcul() {
		
		System.out.printf("**** %d and %d의 사칙연산**** \n", num01, num02);
		System.out.printf("%d + %d = %d\n", num01, num02, num01+num02);
		System.out.printf("%d - %d = %d\n", num01, num02, num01-num02);
		System.out.printf("%d * %d = %d\n", num01, num02, num01*num02);
		System.out.printf("%d / %d = %.2f\n", num01, num02, (double)num01/num02);
	}
	
	/**
	 * 입력받은 수가 소수인지 판별하는 메소드
	 */
	void primeCheck() {
		boolean primenum01 = true;
		for(int i = 2; i < num01; i++) {
			if(num01 % i == 0) {
				primenum01 = false;
			}
		}
		System.out.printf("%d의 소수체크 : %b\n", num01, primenum01);
		
		boolean primenum02 = true;
		for(int i = 2; i < num02; i++) {
			if(num02 % i == 0) {
				primenum02 = false;
			}
		}
		
		System.out.printf("%d의 소수체크 : %b\n", num02, primenum02);
	}
	
	

}
