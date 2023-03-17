package kr.ac.kopo.day03;

/*
  	두개 정수 입력 : 12 5
  	12는 5의 배수판단 : 배수가 아닙니다
  
  	두개 정수 입력 : 12 6
  	12는 6의 배수판단 : 배수입니다
 */
public class OperationMain03 {
	
	public static void main(String[] args) {
		
		//String msg = true ? "배수" : "배수아님";
		//System.out.println(10 > 4 ? "배수이다" : "배수가 아니다");
		//조건문의 주어진 선택지는 반드시 두 개!!!!!!!!!!!!
		int num01 = 15, num02 = 4;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0); 
		//num02가 0일 때 false, 조건문이 아니라 연산자로도 가능
		
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
		
		
	}

}
