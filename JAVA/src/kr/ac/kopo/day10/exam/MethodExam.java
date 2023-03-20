package kr.ac.kopo.day10.exam;

import java.util.Scanner;

/**
 * 연습용 간단한 메소드들을 모아놓은 클래스
 * @author User
 *
 */
public class MethodExam {
	
	//@ : jdk(컴퓨터)가 해석 가능한 주석
	
	//문서화 주석 : 모두와 공유하면서 표준적으로 만들려는 설명에 대한 주석. 클래스 설명을 위해 써주는게 좋다.
	/**
	 * 호출자메소드에서 받아온 두 개의 정수 사이의 총합을 반환하는 메소드
	 * @param num1 총합의 시작값 
	 * @param num2 총합의 종료값
	 * @return num1~num2사이의 총합
	 */
	
	
	/*
	// 메소드를 만든 후 /**를 치면 자동으로 만들어줌	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	
	public int getTotal(int num1, int num2) {
		
		int total = 0;
		
		for(int i= num1; i <= num2; i++) {
			total +=i;
		}
		
		return total;
	}
	/**
	 * 키보드로 단을 입력받아 반환
	 * @return 입력받은 단
	 */
	public int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		return dan;
	}
	/**
	 * 단을 이용하여 구구단을 출력
	 * @param dan 출력할 단
	 */
	public void printGugudan(int dan) {
		
		System.out.println("***" + dan + "단 ***");
		for(int i = 1; i <= 9 ; i++) {
			System.out.println(dan + "*"+ i + "=" + (dan*i));
		}
	}
	
	/**
	 * 2단부터 9단까지 구구단을 출력
	 */
	public void printGugudan() {
		printGugudan(2,9);
		
//		for(int i = 2; i <= 9; i++) {		
//		/*this.*/printGugudan(i);			//같은 클래스 안의 다른 메소드를 실행할 때는 ~.필요없음 (this.이 생략되어 있음)
//		}
		
		
		/*	
		for(int i = 2; i <= 9; i++) {		
			System.out.println("***" + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + (i*j));
			}
		}
		*/
		
	}
	
	/**
	 * 시작단 ~ 종료단 구구단 출력
	 * @param startDan	시작단
	 * @param endDan	종료단
	 */
	public void printGugudan(int startDan, int endDan) {
		
		for(int i = startDan; i <= endDan; i++) {
			printGugudan(i);
		}
		
	}
}
