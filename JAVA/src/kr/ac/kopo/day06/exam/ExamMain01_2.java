package kr.ac.kopo.day06.exam;

public class ExamMain01_2 {
	
	public static void main(String[] args) {
		
		int star = 1;  				// 별을 찍는 횟수를 변수화
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			
			if(i < 5) { 			//개수가 감소하는 타이밍. 그 다음 행을 위한 증감
				star++;
			} else {
				star--;
			}
		}
	}

}
