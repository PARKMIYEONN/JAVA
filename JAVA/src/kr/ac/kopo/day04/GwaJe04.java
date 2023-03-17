package kr.ac.kopo.day04;

import java.util.Scanner;
public class GwaJe04 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 :");
		int second = sc.nextInt();
		
		System.out.print("세번째 정수 :");
		int third = sc.nextInt();
		
		System.out.print("네번째 정수 :");
		int fourth = sc.nextInt();
		
		
		
		if(first >= second && first >= third && first >= fourth ) {
			System.out.println("가장 큰 수 : " + first);
		} else if(second >= first && second >= third && second >= fourth) {
			System.out.println("가장 큰 수 : " + second);
		} else if(third >= first && third >= second && third >= fourth) {
			System.out.println("가장 큰 수 : " + third);
		} else if(fourth >= first && fourth >= second && fourth >= third) {
			System.out.println("가장 큰 수 : " + fourth);
		}		
		
		
		
	}

}
