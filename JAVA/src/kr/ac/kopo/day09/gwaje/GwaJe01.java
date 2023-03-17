package kr.ac.kopo.day09.gwaje;

import java.util.Random;
import java.util.Scanner;

public class GwaJe01 {

	public static void main(String[] args) {

		Random r = new Random();

		int random = r.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("컴퓨터가 생각하는 1-100사이의 정수를 맞혀보세요");
		int min = 1;
		int max = 100;

		System.out.printf("%d-%d사이의 정수 입력 : ", min, max);

		for (int i = 0; i <= 5; i++) {

			int num = sc.nextInt();
			System.out.println();
			if (num < 1 || num > 100) { // 범위 밖의 수를 입력했을 때 다시 입력하게 됨
				i--;
				System.out.printf("%d-%d사이의 정수 입력 : ", min, max);
			} else if (1 <= num && num < random) {
				System.out.printf("%d - %d : ", min, max);
				min = num+1;
				System.out.printf("%d\n%d보다 큰 수 입니다.\n", num, num);
				System.out.printf("기회는 총 %d번 남았습니다\n\n", 5 - i);
			} else if (num > random && num <= 100) {
				System.out.printf("%d - %d : ", min, max);
				max = num-1;
				System.out.printf("%d\n%d보다 작은 수 입니다.\n", num, num);
				System.out.printf("기회는 총 %d번 남았습니다\n\n", 5 - i);
			} else {
				System.out.print("축하합니다. 정답입니다.\n");
				break;
			}
			if (5 - i == 0) {
				System.out.printf("아쉽습니다. 기회를 소진하셨습니다.\n정답은 %d입니다", random);
				break;
			}

		}
	}
}
