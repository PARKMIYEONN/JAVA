package kr.ac.kopo.day15.hwcalendar;

import java.util.Calendar;
import java.util.Scanner;

public class HWCalendar {

	public static void main(String[] args) {
		

		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int yo=1;
		int num = 0;
		
		//최초 한번은 실행
		do {
		System.out.println("원하는 항목을 선택하세요(1.특정년도 2.특정월 3.종료) => ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			//필요한 년도 입력
			System.out.print("년도를 입력하세요 : ");
			int spYear = sc.nextInt();
			
			//0~11 총 12월
			for (int month = 0; month <= 11; month++) {
				System.out.println(spYear + "년 " + (month + 1) + "월");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				
				//각 월별 첫째날의 요일값
				c.set(spYear, month, 1);
				yo = c.get(Calendar.DAY_OF_WEEK);
				
				//달력의 세로줄.. 7씩 증가 첫칸에서 첫째날의 요일값-1 을 빼준만큼 더한다
				for (int date = 1; date <= c.getActualMaximum(Calendar.DAY_OF_MONTH)+yo-1 ; date += 7) {
					
					//달력의 가로줄.. 1씩증가 달력의 첫칸에서 매달 첫째날의 요일값-1 을 빼준 뒤 매 주 +6일, 달의 마지막날까지 반복
					for (int day = date - (yo-1)  ; day <= date + 6-(yo-1) && day <= c.getActualMaximum(Calendar.DAY_OF_MONTH) ; day++) {
						
						
						if (day > 0) {
							//양수라면 날짜 출력
							System.out.print(day + "\t");
						} else {
							//음수 또는 0이라면 공백 출력
							System.out.print(" \t");
						}
					}
					System.out.println();
				}
				System.out.println();

			}
			break;
		case 2:
			System.out.print("년도를 입력하세요 : ");
			spYear = sc.nextInt();
			System.out.print("월을 입력하세요 : ");
			int spMonth = sc.nextInt();
			System.out.println(spYear + "년 " + (spMonth) + "월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			//입력받은 월 값에서 1 빼줌 (0~11월이니까)
			c.set(spYear, spMonth-1, 1);
			yo = c.get(Calendar.DAY_OF_WEEK);
			for (int date = 1; date <= c.getActualMaximum(Calendar.DAY_OF_MONTH)+yo-1 ; date += 7) {
				
				for (int day = date - (yo-1)  ; day <= date + 6-(yo-1) && day <= c.getActualMaximum(Calendar.DAY_OF_MONTH) ; day++) {
					c.set(spYear, spMonth-1, date);
					
					if (day > 0) {

						System.out.print(day + "\t");
					} else {
						System.out.print(" \t");
					}
				}
				System.out.println();
			}
			System.out.println();

			
			break;
		case 3:
			System.out.print("달력을 종료합니다");
			break;
		}
		//처음 입력받는 값이 3이 나올때까지 반복
		}while(num != 3);

	}

}
