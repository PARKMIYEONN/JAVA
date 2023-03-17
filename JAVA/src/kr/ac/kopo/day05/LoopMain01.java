package kr.ac.kopo.day05;

public class LoopMain01 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		while(cnt <= 5) {
		System.out.println("Hello");
		++cnt;
		}
		
		int cnt2 = 1; //위와 같은 변수 사용 불가
		while(cnt2 <= 5) {
			System.out.println("Good-bye");
			++cnt2;
		}
		
		System.out.println("cnt : " + cnt);
	}

}

