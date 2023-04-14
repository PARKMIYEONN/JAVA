package kr.ac.kopo.ui;

import java.util.Scanner;

public class BoardUI implements IBoardUI{
	
	private int menu() {
		System.out.println("*** 게시판 관리 프로그램 ***");
		System.out.println("1. 전체게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.print("원하는 항목을 선택하세요 : ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();

		return type;
	}

	@Override
	public void execute() throws Exception {
		while (true) {
			int type = menu();
			switch (type) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				ExitUI eu = new ExitUI();
				eu.execute();
				break;
			}
		}
	}

}
