package kr.ac.kopo.day04;

/*
  	두개 정수 입력 : 12 5
  	12는 5의 배수판단 : false
  
  	두개 정수 입력 : 12 6
  	12는 6의 배수판단 : true
 */
public class OperationMain04 {
	public static void main(String[] args) {
		
		int num01 = 15, num02 = 3;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0); 
		//num02가 0일 때 false, 조건문이 아니라 연산자로도 가능
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, bool);
		
		
	}

}
