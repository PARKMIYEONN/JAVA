package kr.ac.kopo.day10;

public class HomeworkMAin02 {
	
	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		StringUtil util = new StringUtil();
		
		String str = scan.nextString("문자열을 입력하세요 : ");
		String reStr = util.reverseString(str);
		
	}

}
