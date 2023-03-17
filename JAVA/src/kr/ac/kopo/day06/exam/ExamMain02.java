package kr.ac.kopo.day06.exam;

public class ExamMain02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				
				for(int j = 1; j <= 5; j++) {       //5개의 열 중에 *이 몇번째 열부터 시작해?
					System.out.printf("%c", j >= i ? '*' : ' '); // i번째 열에서부터 *을 찍는다
				}
				
			} else {
				for(int j = 1; j <= 5; j++) {
					if(j < 10-i) {  				//10-i번재 열 앞에 ' ' 찍고 그 뒤일때 *을 찍는다
						System.out.print(' ');
					} else {
						System.out.print('*');
					}
					
					}
				}
			
			
			System.out.println();
		}
	}
		
		
		//방법1
		/*
		for(int i = 1; i <= 9; i++) {
			
			if(i <= 5 ) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 6-i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = 1; j <= 9-i; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i-4; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		*/
		
	}

