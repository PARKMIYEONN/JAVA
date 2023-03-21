package kr.ac.kopo.day10.ans;

import java.util.Scanner;

/**
 * 다양한 상수를 입력받을 수 있는 기능클래스 
 * @author User
 *
 */
public class ScannerUtil {

	Scanner sc;
	
	ScannerUtil() {
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
		char ch = sc.nextLine().charAt(0);
		return ch;
	}
	
	int nextInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	
	String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
}













