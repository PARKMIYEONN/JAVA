package kr.ac.kopo.day05;

public class Practice04 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= i+4; j++) {  //i와 종료값의 규칙성 찾아보기 
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		
		
		//방법1
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j+i-1);
				
			}
			System.out.println();
		}
		*/
	}
	

}
