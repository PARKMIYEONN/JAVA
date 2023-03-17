package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 4개를 입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		//방법2
		int max = num > num2 ? num : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		
		System.out.println("가장 큰 수 : " + max);
	
		
		/*
		//방법1
		int max01 = num > num2 ? num : num2;
		int max02;
		if(num3 > num4) {
			max02 = num3;
		} else {
			max02 = num4;
		}
		
		System.out.println("가장 큰 수 : " + (max01 > max02 ? max01 : max02));
		*/
		
	}

}
