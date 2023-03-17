package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain03 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(book == 1) { //else와 if를 합쳐버림, {} 없이, 들여쓰기 없이, 대등적인 관계로 보임. 다중if문
			System.out.println(book + " book");
			} else {	
			System.out.println(book + " books");
			}
		
		
				
	}

}
