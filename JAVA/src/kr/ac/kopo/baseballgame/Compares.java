package kr.ac.kopo.baseballgame;

import java.util.Scanner;

public class Compares {

	public void comparenum(int[] ran) {
		int lose = 0;
		int strike, ball, out;

		for (int k = 0; k < 6; k++) {
			//새로운 수를 입력하기 전 0으로 초기화
			
			strike = 0;
			ball = 0;
			out = 0;		
			
			//세자리 수 입력
			Scanner input = new Scanner(System.in);
			System.out.print("중복되지 않는 세자리 수를 입력하세요 : ");
			int person = input.nextInt();			
			
			//입력받은 수 배열에 넣기
			int frst = person / 100;
			int scnd = person % 100 / 10;
			int thrd = person % 100 % 10;
			int[] prsn = { frst, scnd, thrd };

			for (int i = 0; i < ran.length; i++) {
				
				//같은 자리 같은 수 strike
				if (ran[i] == prsn[i]) {
					strike++;
				}
				//다른 자리 같은 수 ball
				for (int j = 0; j < prsn.length; j++) {
					if (ran[i] != prsn[i] && ran[i] == prsn[j]) {
						ball++;
					}

				}
				
				//없는 수라면 out
				if (strike == 0 && ball == 0) {
					out++;

				}
				
				//세 개 전부 없는 수를 입력한 횟수 세기
				if (out == 3) {
					lose++;
				}
			}
			System.out.println(strike + " strike " + ball + " ball");
			if (strike == 0 && ball == 0) {
				System.out.println(lose + "OUT");
			}
			if (k == 5) {
				System.out.println("기회를 모두 소진하셨습니다");
				System.out.printf("정답은 %d%d%d입니다", ran[0], ran[1], ran[2]);
			} else if (strike == 3) {
				System.out.println("Home Run!!!!! 정답입니다");
				break;
			} else if (lose == 3) {
				System.out.println("삼진아웃! 게임에서 졌습니다");
				System.out.printf("정답은 %d%d%d입니다", ran[0], ran[1], ran[2]);
				break;
			} else {
				System.out.printf("기회는 총 %d회 남았습니다  \n\n", 5 - k);
			}
		}
	}

}
