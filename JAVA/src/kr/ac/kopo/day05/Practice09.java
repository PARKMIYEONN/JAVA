package kr.ac.kopo.day05;

public class Practice09 {
	
	public static void main(String[] args) {
		
		//방법2
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				if(j < 6-i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		//방법1
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		*/
	}

}
