package kr.ac.kopo.day07.gwaje;

import java.util.Scanner;

public class GwaJe03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] ar = new int[5];
		int error = 0;
		int hap = 0;

		for (int i = 0; i < ar.length; i++) {
			System.out.print((i + 1) + "번 학생의 성적 : ");
			ar[i] = sc.nextInt();
		}
		System.out.println();

		System.out.print("< PRINT >\n");
		System.out.print("번호\t성적\t학점\t\n");

		for (int j = 0; j < ar.length; j++) {
			char grade = 'A';
			if (90 <= ar[j] && ar[j] <= 100) {
				grade = 'A';
			} else if (80 <= ar[j] && ar[j] <= 89) {
				grade = 'B';
			} else if (70 <= ar[j] && ar[j] <= 79) {
				grade = 'C';
			} else if (60 <= ar[j] && ar[j] <= 69) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			if (0 <= ar[j] && ar[j] <= 100) {
				System.out.printf("%d\t%d\t%c\t\n", j + 1, ar[j], grade);
				hap = hap + ar[j];
			} else {
				System.out.print(j + 1 + "\tERROR!!\n");
				error++;
			}

		}
		System.out.println();
		System.out.printf("5명 입력 중 [%d]회 에러발생\n", error);
		System.out.printf("총점 : %d점\n", hap);
		System.out.printf("평균 : %.2f점\n", ((double)hap / ar.length));

	}

}
