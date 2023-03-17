package kr.ac.kopo.day07.gwaje;

import java.util.Scanner;

public class GwaJe01 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("num%d : ", i + 1);
			ar[i] = sc.nextInt();
		}
		System.out.print("< 짝수 >\n");
		for (int j = 0; j < ar.length; j++) {
			switch (ar[j] % 2) {
			case 0:
				System.out.print(ar[j] + " ");
			}
		}

		System.out.println();

		System.out.print("< 홀수 >\n");
		for (int k = 0; k < ar.length; k++) {
			switch (ar[k] % 2) {
			case 1:
				System.out.print(ar[k] + " ");
			}
		}

		System.out.println();

	}

}
