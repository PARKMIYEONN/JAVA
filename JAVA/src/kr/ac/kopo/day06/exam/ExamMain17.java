package kr.ac.kopo.day06.exam;

public class ExamMain17 {
	
	public static void main(String[] args) {
		
		int k = 1;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				if(j <= k || j >= 10-k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
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
		int star=1, star02 = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= 9-star-star02; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= star02; j++) {
			System.out.print("*");
			}
			
			System.out.println();
			
			if (i < 5) {
				
				star++;
				star02++;
				
			} else {
				star--;
				star02--;
			}
			
		
		}
		*/
		
		
	}

	
}

