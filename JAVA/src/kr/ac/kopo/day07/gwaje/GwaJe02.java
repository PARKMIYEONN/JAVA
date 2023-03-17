package kr.ac.kopo.day07.gwaje;

import java.util.Scanner;

public class GwaJe02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {		//출력할 땐 1.5for문 쓰는데 입력할 땐 안 써 왜일까?
			System.out.printf("num%d : ", i + 1);
			ar[i] = sc.nextInt();
			if (ar[i] < 0 || 99 < ar[i]) {
				i--;
			}
		}
		System.out.println();

		System.out.println("< PRINT >");
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
		System.out.println();

		System.out.println("< REVERSE >");
		for (int k = ar.length - 1; k >= 0; --k) {
			System.out.print(ar[k] % 10 * 10 + ar[k] / 10 + " ");
		}

	}

}
