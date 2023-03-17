package kr.ac.kopo.day06.exam;

public class ExamMain16_ans {
	
	public static void main(String[] args) {
		
		int k = 0;
		for(int i = 1; i <= 9; i++) {		//몇 열부터 스페이스를 찍는지 규칙성을 찾는다 나머지는 별
			
			for(int j = 1; j <= 9; j++) {
				if(j <= k || j >= 10-k) {
					System.out.print(' ');
				} else {
					System.out.print("*");
				}				
			}
			System.out.println();
			if(i < 5){
				k++;
			} else {
				k--;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int k = 5;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5-k; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*k-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i < 5) {
				k--;
			}else {
			
				k++;
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 for(int i = 1; i <= 9; i++) {
			
			if(i <= 5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2*(6-i)-1; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 1; j <= 9-i; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2*(i-4)-1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();

		

		}
		*/
	}

}
