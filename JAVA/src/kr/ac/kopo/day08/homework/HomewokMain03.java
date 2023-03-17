package kr.ac.kopo.day08.homework;

public class HomewokMain03 {

	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
	}
}
