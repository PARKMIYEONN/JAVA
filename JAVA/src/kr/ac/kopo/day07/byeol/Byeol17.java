package kr.ac.kopo.day07.byeol;

import java.util.Scanner;

public class Byeol17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = 1;
	
		System.out.print("행 수 입력 : ");
		int haeng = sc.nextInt();
		
		if(haeng % 2 == 0) {
			haeng--;
		}
		
		for(int i = 1; i <= haeng; i++) {
			for(int j = 1; j <= haeng; j++) {
				if(j <= k || j >= haeng + 1-k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i < haeng/2+1) {
				k++;
			} else {
				k--;
			}
		}
	}

}
