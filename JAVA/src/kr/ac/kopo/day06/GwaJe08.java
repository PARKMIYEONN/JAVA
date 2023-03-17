package kr.ac.kopo.day06;

public class GwaJe08 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {				//n단의 행
			for(int j = 1; j <= 9; j++) {			//n단 안의 행
				for(int k = 1; k <= 3; k++) {		//n단 안의 열
					if((3 * i + k - 2) == 10) {
						break;
					}
					System.out.printf("%d * %d = %d\t", 3 * i + k - 2, j, (3 * i + k - 2)*j);  
					
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}

}
