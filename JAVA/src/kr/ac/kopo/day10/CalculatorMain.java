package kr.ac.kopo.day10;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수 : ");
		int num01 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		
		Calculator calcul = new Calculator(num01, num02);
		
		calcul.calcul();
		calcul.primeCheck();
		
	}
	

}
