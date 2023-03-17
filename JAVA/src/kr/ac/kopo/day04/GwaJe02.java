package kr.ac.kopo.day04;

import java.util.Scanner;

public class GwaJe02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력 : ");
		int obj = sc.nextInt();
		
		System.out.print("지불한 돈 입력 : ");
		int mon = sc.nextInt();
		
		if(mon - obj >0) {
		System.out.printf("거스름 돈 : %d원\n", mon - obj);
		
		System.out.printf("1000원 : %d개\n", ( mon - obj) / 1000);
		
		System.out.printf("500원 : %d개\n", (mon - obj) % 1000 / 500);
		
		System.out.printf("100원 : %d개\n", (mon - obj) % 1000 % 500 / 100);
		
		System.out.printf("50원 : %d개\n", (mon - obj) % 1000 % 500 % 100 / 50);
		
		System.out.printf("10원 : %d개\n", (mon - obj) % 1000 % 500 % 100 % 50 / 10);
		
		}else {
			System.out.printf("%d원이 부족합니다",obj - mon);
		}
		
	}
	
}
