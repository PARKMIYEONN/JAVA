package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		int winCnt = 0;
		int loseCnt = 0;
		int drawCnt = 0;
		String whatGame = null;
		int a = 5;
		
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		ScissorsRockPaper srp = new ScissorsRockPaper();

		do {
			switch (a) {
			case 1:
				winCnt++;
				break;
			case 0:
				loseCnt++;
				break;
			case -1:
				drawCnt++;
				break;
			}
			System.out.println("게임을 선택하세요\nA. 가위바위보\nB. 주사위 값 맞추기\nC. 종료");
			
			whatGame = sc.nextLine();

			switch (whatGame) {
			case "A":
				System.out.println("가위바위보 게임입니다\n가위바위보중 하나를 선택하세요.");
				System.out.print("(1.가위, 2:바위, 3:보)");
				int youSRP = sc.nextInt();
				sc.nextLine();
				a = srp.startGame(youSRP);

				break;

			case "B":
				System.out.print("주사위 값 맞추기 게임입니다.\n주사위를 선택하세요(1~6값 중 하나)");
				int youDice = sc.nextInt();
				sc.nextLine();

				a = dice.startGame(youDice);

				break;

			case "C":
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + winCnt + "승" + loseCnt + "패" + drawCnt + "무 입니다.");
				System.exit(0);
				break;
			}

		} while (true);

	}

}
