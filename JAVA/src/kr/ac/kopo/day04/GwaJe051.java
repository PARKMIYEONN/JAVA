package kr.ac.kopo.day04;

import java.util.Scanner;

public class GwaJe051 {
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		switch(book) {
		case 0 :
			System.out.println("보유하고 있는 책이 없습니다");
			break;
		case 1 :
			System.out.println(book + " book");
			break;
		default : 
			switch(book & 0x80000000) {
			case 0 : 
				System.out.println(book + " books");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다");}
			}
		
	}
	

}
