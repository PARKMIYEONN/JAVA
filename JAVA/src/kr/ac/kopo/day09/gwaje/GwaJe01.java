package kr.ac.kopo.day09.gwaje;

import java.util.Random;
import java.util.Scanner;

public class GwaJe01 {

	public static void main(String[] args) {

		Random r = new Random();

		int random = r.nextInt(100) + 1; //랜덤 수 설정. 필요한 범위가 1~100이므로 +1

		Scanner sc = new Scanner(System.in);

		System.out.println("컴퓨터가 생각하는 1-100사이의 정수를 맞혀보세요");
		int min = 1;
		int max = 100; //최솟값 최댓값 초기화


		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d-%d사이의 정수 입력 : ", min, max);

			int num = sc.nextInt();
			System.out.println();
			if (num < min || num > max) { // 범위 밖의 수를 입력했을 때 다시 입력하게 됨
				i--;
			} else if (1 <= num && num < random) { //정답보다 작은 수 일 때
				min = num+1; //입력값이 정답보다 작으니까 최솟값 다시 설정
				System.out.printf("%d보다 큰 수 입니다.\n", num, num);
				System.out.printf("기회는 총 %d번 남았습니다\n\n", 5 - i);
			} else if (num > random && num <= 100) { //정답보다 큰 수 일 때
				max = num-1; //입력값이 정답보다 크니까 최댓값 다시 설정
				System.out.printf("%d보다 작은 수 입니다.\n", num, num);
				System.out.printf("기회는 총 %d번 남았습니다\n\n", 5 - i);
			} else { //정답
				System.out.print("축하합니다! 정답입니다^^\n");
				break;
			}
			if (5 - i == 0) { //기회 소진
				System.out.printf("아쉽습니다. 기회를 소진하셨습니다.\n정답은 %d입니다", random);
				break;
			}

		}
	}
}
