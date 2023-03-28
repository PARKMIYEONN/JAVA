package kr.ac.kopo.day16.calendar;

import java.util.Calendar;

public class CalendarUtil {
	
	private Calendar c;	//칼렌더 유틸이 눈에 보이는 달력을 추상화 시키는 게 아니라 
						//그냥 서비스를 목적으로 기능을 지원하는 클래스를 만드는 것
						//기능 클래스에서는 상속 관계에서 꼭 kind of패턴을 만족하지는 않음
	
	public CalendarUtil(){
		
		c = Calendar.getInstance();		//인스턴스를 호출한 시점에 대한 날짜시간정보
	}
	
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year,month);
		}
	}
	
	public void showByMonth(int year, int month) {
		
		System.out.printf("*** %4d년 %02d월 ***\n", year, month);
		
		//year/month/1 로 날짜정보 수정
		c.set(year, month-1, 1);
		
		//요일 추출
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//해당월의 마지말 날
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(week +","+ lastday);
		
		showByDay(week, lastday);
	}
	
	private void showByDay(int week, int lastday) {		//외부에서 호출할 일 없음. 안보이게 숨김!!
		System.out.println("==================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("==================================================");
		int cnt = 0;
		for(int i = 1; i < week-1; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0 /*&& day < lastday */) {		//논리연산자의 순서도 중요하다! 앞에 들어가면 매번 물어봄 아니라면 앞에거 먼저..
				System.out.println();
			}
		}
		if(cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("==================================================");
	}

}
