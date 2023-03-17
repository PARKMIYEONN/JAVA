package kr.ac.kopo.day03;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		int a = 0, b= 0;
		
		//boolean result = ++a > 1 && ++b >= 0; //1. a값이 false이므로 b값까진 보지않음. 
		boolean result = ++b >= 0 && ++a > 1; //2. b값이 true이므로 a값을 봄. 
		
		System.out.printf("a = %d b = %d\n", a, b);// 1. b의 값은 증가하지 않음 2. a,b 둘 다 증가
				
	}

}
