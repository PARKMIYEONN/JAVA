package kr.ac.kopo.day10;

import java.util.Scanner;

public class HomeworkMainnana {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 ");
		String strIn = sc.nextLine();
		System.out.print("검색할 문자열 입력: ");
		char strSrch = sc.nextLine().charAt(0);
		
		
		//StringUtil bool = new StringUtil();
		//System.out.println(bool.endsWith(strIn, strSrch));
		//StringUtil num = new StringUtil();
		//System.out.println(num.endsWith(strIn, strSrch));
		StringUtil num = new StringUtil();
		System.out.println(num.removeChar(strIn, strSrch));
	
	}

}
