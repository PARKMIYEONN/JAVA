package kr.ac.kopo.day07.byeol;

import java.util.Scanner;

public class Byeol07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 수 입력 : ");
		int haeng = sc.nextInt();
		
		System.out.println();
		
		
		for(int i = 1; i <= haeng; i++) {
			for(int j = 1; j <= haeng+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
