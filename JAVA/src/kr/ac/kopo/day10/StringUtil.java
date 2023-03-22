package kr.ac.kopo.day10;




public class StringUtil {


//1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 
		// isUpperChar( char c ) 메소드를 작성하시오
	
	
	boolean isUpperChar(char c) {		//얘는 그저 판단하는 녀석이기 때문에 안에 입력받는 게 있으면 안됨.
		
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
		
	}

	
//	2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메 소드
//	를 작성하시오
	
	
	boolean isLowerChar(char c) {

		int num = (int) c; // c를 수로 바꿔줌

		if (num >= 'a' && num <= 'z') {
			return true;
		}
		return false;
	}


//3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오	
	
	
	int max(int i, int j) {

		if (i > j) {
			return i;
		} else {
			return j;
		}

	}

//	4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오	
	
	
	int min(int i, int j) {


		if (i < j) {
			return i;
		} else {
			return j;
		}
	}
	
	
//	5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
	
	String reverseString(String str) {
		
		String revStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
	}
	

//	6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오	
	
	String toUpperString(String str) {
		
		String upperstr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) {
				c = (char)(c-32);
			}
			upperstr = upperstr + c;
		}
		
		return upperstr;
				
	}
	
	
//	7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
	
	String toLowerString(String str) {
		String lowerstr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isUpperChar(c)) {
				c = (char)(c + 32);
			}
			lowerstr = lowerstr + c;
		}
		return lowerstr;
	}
	
	
//	8. 두개의 문자열을 입력받아 문자열 크기를 비교하는 compareTo(String str, String str2) 메소드를 작성하시오.
	
	int compareTo(String str, String str2) {
		
		int length = str.length() < str2.length() ? str.length() : str2.length();
		for(int i = 0; i < length; i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i)-str2.charAt(i);
			}
		}
		if(str.length() == str2.length()) {
			return 0;
		} else if(str.length() == length) {
			return -str2.length();
		}
		return str.length();
	}

		
	
//	9. 문자열 입력받고, 검색할 문자열을 입력받아 검색할 문자열로 끝나는 endsWith(String str, String sub) 메소드 작성
//    문자열 입력 : hello world
//    검색할 문자열 입력 : ld
//    ld로 끝나는지 여부 판단 : true		
	
	boolean endsWith(String str, String sub) {

		String revStr = reverseString(str);
		String revSub = reverseString(sub);
		
		for(int i = 0; i < revSub.length(); i++) {
			char c1 = revStr.charAt(i);
			char c2 = revSub.charAt(i);
			
			if(c1 == c2) {
				return true;
			}
		}
		return false;
	}
	
	
//	10. 문자열 입력받고, 검색할 문자열을 입력받아 검색할 문자열이 어느 위치에 있는지 검색하는 indexOf(String str, String sub) 메소드 작성

	int indexOf(String str, String sub) {
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		}
		for(int i = 0; i < sub.length(); i++) {
			char c2 = sub.charAt(i);
		}
		
		for()
	}
	
// 230321 //1. 문자열의 내용을 비교하여 입력받는 char c값과 동일한 char개수를 리턴
	
	public static int checkChar(String strData, char ch) {
		
		int a = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch) {
				a = a+1;
			}
		}
		return a;
	}
	
	
//	2. 특정 문자 제거
	
	public static String removeChar(String oriStr, char delChar) {
		
		String str = "";
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				 str = str + oriStr.charAt(i); 
			}
		
		}
		return str;
	}
	


}
