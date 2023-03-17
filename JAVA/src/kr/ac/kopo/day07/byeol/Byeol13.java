package kr.ac.kopo.day07.byeol;

import java.util.Scanner;

public class Byeol13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 수 입력 : ");
		int haeng = sc.nextInt();
		
		for(int i = 0; i <= haeng; i++) {
			if(i < haeng/2) {
				for(int j = 0; j <= haeng/2+1-i; j++) {
					System.out.print(" ");
					
				}
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
		}
		
	}

}
