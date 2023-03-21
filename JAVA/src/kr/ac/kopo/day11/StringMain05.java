package kr.ac.kopo.day11;

import java.util.Arrays;

public class StringMain05 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";	//원본값은 변하지 않음!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//부분 문자열 반환		
		System.out.println("str : [" + str + "]");
		String sub = str.substring(3,8);
		System.out.println("sub : [" + sub + "]");
		
//끝에 있는 단어 검색		
		int idx = str.indexOf("World");
		sub = str.substring(idx);
		System.out.println("sub : [" + sub + "]");
		
//중간에 있는 단어 검색		
		str = "Hello World!!";
		idx = str.indexOf("World");
		sub = str.substring(idx, idx + "World".length());
		System.out.println("sub : [" + sub + "]");
		
//문자열 합침		
		String a = "Hello";
		String b = "good-bye";
//		String c = a + b;
		String c = a.concat(b);
		System.out.println("c : " + c);
		
//문자열 바꿈		
		//String str2 = str.replace('l', 'r');
		String str2 = str.replace("l", "rr"); //문자열로 반환하고 싶으면 둘 다 문자열로 말해줘야 함.
		System.out.println("str : [" + str2 + "]");
		
//맨 앞과 맨 뒤 공백제거		
		str = "           Hello             ";
		System.out.println("[" + str + "]의 길이 : " + str.length());
		str = str.trim();
		System.out.println("[" + str + "]의 길이 : " + str.length());

//대문자 소문자 변환
		str = "Hello World";
		System.out.println("toUpperCase() : " + str.toUpperCase());
		System.out.println("toLowerCase() : " + str.toLowerCase());
	
//split()안의 값을 기준으로 문자열을 나눠서 배열로 나타냄
		str = "경기도 성남시 수정로 398";
		String[] strArr = str.split(" ");
		System.out.println("str : [" + str + "]");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "172.31.9.164";
		String[] ipArr = ip.split("\\.");
		System.out.println("ip : [" + ip + "]");
		System.out.println(Arrays.toString(ipArr));
		
		int no = 123;
		double no2 = 10.23;

//정수값을 문자열로 변환(형변환)		
		System.out.println(no + 100);	// 223
		System.out.println(no2 + 100);	// 110.23
		System.out.println(String.valueOf(no) + 100);
		System.out.println(String.valueOf(no2)+ 100);
	}

}
