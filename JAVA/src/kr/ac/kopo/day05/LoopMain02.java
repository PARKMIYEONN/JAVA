package kr.ac.kopo.day05;

public class LoopMain02 {

	public static void main(String[] args) {
		
		for(int cnt = 1; cnt <= 5 ; ++cnt ) {
			System.out.println("Hello");
		}
		
		for(int cnt = 1; cnt <=5 ; ++cnt) { // 같은 변수 사용가능
			System.out.println("Good-bye");
		}
		// System.out.println("cnt : " + cnt); 불가
	}
}
