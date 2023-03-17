package kr.ac.kopo.day05;

public class BreakMain01 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				break; //for문의 false/true와 상관없이 if조건에 맞춰 for문을 빠져나오게 됨
			}
			
			System.out.println("HI");
		}
		System.out.println("cnt : " + cnt); // cnt 값은 3인 채로 빠져나옴
	}

}
