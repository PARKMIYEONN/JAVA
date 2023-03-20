package kr.ac.kopo.day10;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {


//1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 
		// isUpperChar( char c ) 메소드를 작성하시오
	
	
	boolean isUpperChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		char c = sc.nextLine().charAt(0);

		int num = (int) c;

		if (num >= 65 && num <= 90) {
			return true;
		}
		return false;
		
	}

	
//	2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메 소드
//	를 작성하시오
	
	
	boolean isLowerChar() {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		char c = sc.nextLine().charAt(0);

		int num = (int) c; // c를 수로 바꿔줌

		if (num >= 97 && num <= 122) {
			return true;
		}
		return false;
	}


//3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오	
	
	
	int max() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num02 = sc.nextInt();

		if (num01 > num02) {
			return num01;
		} else {
			return num02;
		}

	}

//	4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오	
	
	
	int min() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num02 = sc.nextInt();

		if (num01 > num02) {
			return num02;
		} else {
			return num01;
		}
	}
	
	
//	5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
	
	String reverseString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] ar = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			ar[i] = str.charAt(str.length()-1-i);
		}
	
		return Arrays.toString(ar);
			
	}
	

//	6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오	
	
	String toUpperString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] ar = new char[str.length()];
		int[] num = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			ar[i] = str.charAt(i);
			num[i] = (int)ar[i];
			if(num[i] >= 97 && num[i] <= 122) {
				num[i] = num[i]-32;
			}
			ar[i] = (char)num[i];			
		}
		
		return Arrays.toString(ar);
				
	}
	
	
//	7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
	
	String toLowerString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] ar = new char[str.length()];
		int[] num = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			ar[i] = str.charAt(i);
			num[i] = (int)ar[i];
			if(num[i] >= 65 && num[i] <= 90) {
				num[i] = num[i] + 32;
			}
			ar[i] = (char)num[i];
		}
		return Arrays.toString(ar);
	}
	
	
//	8. 두개의 문자열을 입력받아 문자열 크기를 비교하는 compareTo(String str, String str2) 메소드를 작성하시오.
	
	int compareTo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열 입력 : ");
		String str01 = sc.nextLine();
		System.out.print("두번째 문자열 입력 : ");
		String str02 = sc.nextLine();
		
		for(int i = 0; i <= str01.length(); i++) {
			if(str01.charAt(i) != str02.charAt(i)) {	
				return str01.charAt(i)-str02.charAt(i);
			} 
			
		}
		return 0;
		
	}

		
	
//	9. 문자열 입력받고, 검색할 문자열을 입력받아 검색할 문자열로 끝나는 endsWith(String str, String sub) 메소드 작성
//    문자열 입력 : hello world
//    검색할 문자열 입력 : ld
//    ld로 끝나는지 여부 판단 : true		
	
	
	
	

}
