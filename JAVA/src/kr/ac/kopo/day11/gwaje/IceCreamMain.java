package kr.ac.kopo.day11.gwaje;

import java.util.Scanner;

public class IceCreamMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림을 몇 개 구입하시겠습니까? ");
		int iC = sc.nextInt();
		
		IceCream mani = new IceCream();
		mani.dalcom(iC);
	}

}
