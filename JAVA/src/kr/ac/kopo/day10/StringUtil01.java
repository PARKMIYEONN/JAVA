package kr.ac.kopo.day10;

public class StringUtil01 {
	
	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		char c = scan.nextChar("문자를 입력 : ");
		StringUtil util = new StringUtil();
		
		String num1= scan.nextLine("첫번째 정수를 입력 : ");
		String num2= scan.nextLine("두번째 정수를 입력 : ");
		int maxNum = util.indexOf(num1, num2);
		System.out.println(num1 + "," + num2 + "중 큰 수 : " + maxNum);
	}
	

}
