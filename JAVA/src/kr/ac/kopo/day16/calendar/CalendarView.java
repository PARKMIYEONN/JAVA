package kr.ac.kopo.day16.calendar;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc;
	private CalendarUtil util;
	
	public CalendarView() {
		sc = new Scanner(System.in);
	}
	
	public int scanInt(String msg) {
		
		System.out.print(msg);
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}

	public void process() {
		
		util = new CalendarUtil();		//while문 안에 있으면 Util 인스턴스 객체가 자꾸 만들어져서 안좋음
										//우리는 이 안에서 달력값을 넣는 기능을 하는 것을 만들 것이다
		
		while (true) {
			int type = scanInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) => ");
			int year, month;
			
			switch (type) {
			case 1:
				year = scanInt("년도를 입력 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도를 입력 : ");
				month = scanInt("월을 입력 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("달력서비스를 종료합니다");
				System.exit(0);	//어디서든 얘를 호출하면 소프트웨어가 종료된다
								//0의 의미 : 소프트웨어가 정상적인 이유로 종료되는 것이다 0이 아니면 어떠한 에러가 있어서 종료되었다고 말하는 것
			}
		}

	}

}
