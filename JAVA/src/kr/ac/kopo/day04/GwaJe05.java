package kr.ac.kopo.day04;

import java.util.Scanner;

public class GwaJe05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.print("보유하고 있는 책이 없습니다");
		} else if(book == 1) {
			System.out.println(book + " book");
		} else if(book > 1){
			System.out.println(book + " books");
		} else {
			System.out.print("잘못 입력했습니다");
		}		
		
	}	

}
