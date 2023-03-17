package kr.ac.kopo.day06;

import java.util.Scanner;

public class GwaJe07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작단을 입력 : ");
		int num01 = sc.nextInt();
		
		System.out.print("종료단을 입력 : ");
		int num02 = sc.nextInt();
		
		int start = num01, end = num02;
		if(start > end) {
			start = num02;
			end = num01;
		}
		
		
		for(int i = num01; i <= num02; i++ ) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		/*
		if(num01 < num02) {
			for(int i = num01; i <= num02; i++ ) {
				System.out.printf("*** %d단 ***\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
			}
		} else {
			for(int i = num02; i <= num01; i++ ) {
				System.out.printf("*** %d단 ***\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n",i,j, i*j);
				}
			}
		}
		*/
		}
		}
		

}
