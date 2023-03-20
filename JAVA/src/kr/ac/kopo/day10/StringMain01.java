package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain01 {
	
	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		char[] chars = {'H', 'E', 'L', 'L', 'O'}; //문자들로 이루어진 배열
		String str3 = new String(chars);
		byte[] bytes = {72, 101, 108, 108, 111}; //아스키 코드
		String str4 = new String(bytes);
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4: " + str4);
		
		System.out.println(str4 + "의 길이 : " + str4.length());
		
		for(int i = 0; i < str4.length(); i++) {
			System.out.println(i + "번째 문자 : " + str4.charAt(i));
		}
		
		chars = new char[10];
		str4.getChars(2, str4.length()-1, chars, 6); //2번지부터 4번지 '전'까지 chars배열에 6번지에서부터 저장
		System.out.println("chars : " + Arrays.toString(chars));
		
		
	}

}
