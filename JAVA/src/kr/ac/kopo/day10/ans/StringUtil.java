package kr.ac.kopo.day10.ans;

public class StringUtil {

	boolean isUpperChar(char c) {
		if(c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}
	
	boolean isLowerChar(char c) {
		if(c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}

	int max(int i, int j) {
		return i > j ? i : j;
	}
	
	String reverseString(String str) {
		
		char[] chars = new char[str.length()];
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		String revStr = new String(chars);
		return revStr;
		/*
		String revStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
		*/
	}
	
	String toUpperString(String str) {
		
		String upperStr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) {
				c = (char)(c + ('A' - 'a'));
			}
			upperStr = upperStr + c;
		}
		return upperStr;
	}
	
	int compareTo(String str, String str2) {

		int length = str.length() < str2.length() ? str.length() : str2.length();
		for(int i = 0; i < length; i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		if(str.length() == str2.length()) {
			return 0;
		} else if(str.length() == length) {
			return -str2.charAt(length);
		}
		return str.charAt(length);
		
	}
}













