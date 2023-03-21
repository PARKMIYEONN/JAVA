package kr.ac.kopo.day10.ans;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		StringUtil util = new StringUtil();
		
		String str = scan.nextString("첫번째 문자열을 입력 : ");
		String str2 = scan.nextString("두번째 문자열을 입력 : ");
		int cmp = util.compareTo(str, str2);
		if(cmp == 0) {
			System.out.println(str + " == " + str2);
		} else if(cmp > 0) {
			System.out.println(str2 + " < " + str);
		} else {
			System.out.println(str + " < " + str2);
		}
		
	}
}





