package kr.ac.kopo.day15.hwcalendar;

import java.util.Calendar;
import java.util.Scanner;

public class HWCalendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int yo=1;

		System.out.println("원하는 항목을 선택하세요(1.특정년도 2.특정월 3.종료) => ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("년도를 입력하세요 : ");
			int spYear = sc.nextInt();
			for (int month = 0; month <= 11; month++) {
				System.out.println(spYear + "년 " + (month + 1) + "월");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				c.set(spYear, month, 1);
				yo = c.get(Calendar.DAY_OF_WEEK);
				for (int date = 1; date <= c.getActualMaximum(Calendar.DAY_OF_MONTH) + yo ; date += 7) {
					
					for (int day = date - yo + 1  ; day <= date + 7 - yo && day <= c.getActualMaximum(Calendar.DAY_OF_MONTH) ; day++) {
						c.set(spYear, month, date);
						int clndrDate = c.get(Calendar.DATE);
						if (day > 0 && day <= c.getActualMaximum(Calendar.DAY_OF_MONTH)) {

							System.out.print(day + "\t");
						} else {
							System.out.print(" \t");
						}
					}
					System.out.println();
				}

			}
			break;
		case 2:
			System.out.print("년도를 입력하세요 : ");
			spYear = sc.nextInt();
			System.out.print("월을 입력하세요");
			int spMonth = sc.nextInt();
			
			break;
		case 3:
			System.out.print("달력을 종료합니다");
			break;
		}

	}

}
