package kr.ac.kopo.day04;

import java.util.Scanner;

public class GwaJe03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int third = sc.nextInt();
		
		
	if(first >= second && second >= third) {
			System.out.printf("%d\t %d\t %d", third, second, first);
		} else if(second >= first && first >= third) {
			System.out.printf("%d\t %d\t %d", third, first, second);
		} else if(third >= first && first >= second) {
			System.out.printf("%d\t %d\t %d", second, first, third);
		} else if(first >= third && third >=second) {
			System.out.printf("%d\t %d\t %d", second, third, first);
		} else if(second >= third && third >= first) {
			System.out.printf("%d\t %d\t %d", first, third, second);
		} else if(third >= second && second >= first) {
			System.out.printf("%d\t %d\t %d", first, second, third);
		}
	}
	
	
	

}
