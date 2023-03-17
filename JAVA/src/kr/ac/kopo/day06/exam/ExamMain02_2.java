package kr.ac.kopo.day06.exam;

public class ExamMain02_2 {

	public static void main(String[] args) {
		
		int star = 5;								//space = 5-star이므로 변수 필요 없음
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5-star; j++) {
				System.out.print(' ');
			}
			
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			
			if(i < 5) {
	
				star--;
			} else {
				
				star++;
			}
		}
	}
	
}
		
		
	