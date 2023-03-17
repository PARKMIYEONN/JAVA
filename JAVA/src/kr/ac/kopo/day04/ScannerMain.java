package kr.ac.kopo.day04;

import java.util.Scanner; //다른 패키지에 있는 Scanner클래스의 사용법을 알기 위한 키워드(import)

public class ScannerMain {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); //Scanner는 String 클래스(java.lang)와 다른 패키지에 들어있음
											//바로 불러와지지 않음
		System.out.print("문자를 입력 : ");
		//nextChar 없음 char ch = sc.nextChar();
		char ch = sc.nextLine().charAt(0); //문자는 이렇게 쓴단다. 알아두렴
		
		System.out.println("char : "+ ch);
		
		System.out.print("문자열을 입력 : ");
		
		//String str = sc.next();//단어단위 키보드 입력
		String str = sc.nextLine();//문장단위 키보드 입력
		
		System.out.println("str : " + str); //sysout + ctrl + space println 자동생성
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		
		System.out.print("실수를 입력 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("num2 : " + num2);
		
		
		
	}
}
