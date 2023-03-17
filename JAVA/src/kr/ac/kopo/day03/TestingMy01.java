package kr.ac.kopo.day03;

public class TestingMy01 {
	
	public static void main(String[] args) {
		
		int num01 = 9, num02 = 7;
		
		boolean bool = (num01 != 0 && num02 != 0 && num01 % num02 == 0);
		
		System.out.printf("%d는 %d의 배수이다 : %b\n", num01, num02, bool);
		
		
		
	}
	
	

}
