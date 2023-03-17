package kr.ac.kopo.day04;

import java.util.Scanner;

public class GwaJe01 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		int ban = sc.nextInt();
		
		System.out.printf("반지름 : %d\n", ban);
		
		System.out.printf("원넓이 : %.4f\n", ban * 3.141592 * ban);
		
		System.out.printf("원둘레 : %.4f\n", 2 * ban * 3.141592);
		
	}
}

