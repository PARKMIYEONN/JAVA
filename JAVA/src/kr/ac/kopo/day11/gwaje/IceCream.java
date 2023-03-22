package kr.ac.kopo.day11.gwaje;

import java.util.Scanner;

public class IceCream {
	
	void dalcom(int iC) {
		
		int total = 0;
		String[] iceName = new String[iC];
		int[] icePrice = new int[iC];
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		for(int i = 0; i < iC; i++) {
			System.out.println("***" + (i+1) + "번째 아이스크림 구매 정보 입력***");
			System.out.print("아이스크림명 : ");
			iceName[i] = sc.nextLine();
			System.out.print("아이스크림가격 : ");
			icePrice[i] = sc2.nextInt();
		}
		
		System.out.println("< 총 " + iC + "개의 아이스크림 구매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i = 0; i < iC; i++) {
			total = total + icePrice[i];
			System.out.printf("%d\t%s\t\t%d\n", i+1, iceName[i], icePrice[i]);
		}
		System.out.printf("총합 : %d원", total);
	}

}
