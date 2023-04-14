package kr.ac.kopo.ui;

import java.util.Scanner;

public class BoardUI extends BaseUI {
	
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
	public void execute() throws Exception{

		while (true) {
			int type = menu();
			IBoardUI ui = null;
			switch (type) {
			case 1:
				System.out.println("전체게시글 조회");
				break;
			case 2:
				ui = new SearchOneUI();
				
				break;
			case 3:
				ui = new AddUI();
				
				break;
			case 4:
				System.out.println("글수정");
				break;
			case 5:
				System.out.println("글삭제");
				break;
			case 0:
				ui = new ExitUI();
				
				break;

			}
			if(ui != null) {
				ui.execute();
			}else {
				System.out.println("잘못입력했습니다");
			}
		}
	}

}
