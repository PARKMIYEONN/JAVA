package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 입력 : ");
		int book =sc.nextInt();
		
		switch(book) {
		case 0 :
			System.out.println("보유하고 있는 책이 없습니다");
			break;
		case 1 :
			System.out.println(book + " book");
			break;
		default : 
			switch(book & 0x80000000) { //=16진수 1000 0000 0000 0000 0000 0000, 비트앤드& 하면 첫번째 수 제외 모두 0, 0 양수 1 음수
			case 0 :
				System.out.println(book + " books");
				break;
			default : 
				System.out.println("잘못입력했습니다");
			}
		}
	}

}
