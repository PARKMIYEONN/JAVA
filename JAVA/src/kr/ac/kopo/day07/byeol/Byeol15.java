package kr.ac.kopo.day07.byeol;

import java.util.Scanner;

public class Byeol15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 수 입력 : ");
		int haeng = sc.nextInt();
		
		if(haeng % 2 == 0) {
			haeng = haeng - 1;
		}
		
		for(int i = 1; i <= haeng; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= haeng-2*(i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
