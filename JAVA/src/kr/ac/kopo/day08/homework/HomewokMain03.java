package kr.ac.kopo.day08.homework;

import java.util.Calendar;

public class HomewokMain03 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
		int date = 1;
		for(int i = 1; i <= 30; i += 7) {
			
			for(date = i; date <= i+6; date++) {
				
					c.set(2023, 06, date);
						int clndrDate = c.get(Calendar.DATE);
						System.out.print(date + "\t");
						
			}
			System.out.println();
		}
		System.out.println();
	}
}
