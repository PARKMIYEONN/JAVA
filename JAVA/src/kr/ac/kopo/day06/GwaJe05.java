package kr.ac.kopo.day06;

import java.util.Scanner;

public class GwaJe05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9사이의 단을 입력 : ");
		int num01 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("*** %d단 ***\n",num01);
		
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num01, i, num01*i);
		}
		
	}

}
