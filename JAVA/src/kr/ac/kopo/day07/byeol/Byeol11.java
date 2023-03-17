package kr.ac.kopo.day07.byeol;

import java.util.Scanner;

public class Byeol11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 수 입력 : ");
		int haeng = sc.nextInt();

		if (haeng % 2 == 0) {
			haeng = haeng - 1;
		}

		for (int i = 1; i <= haeng; i++) {
			if (i <= (haeng / 2) + 1) {
				for (int j = 1; j <= haeng - haeng / 2 + 1 - i; j++) {
					System.out.print("*");

				}
				System.out.println();

			} else {
				for (int j = 1; j <= i - haeng / 2; j++) {
					System.out.print("*");

				}
				System.out.println();
			}
		}
	}

}
