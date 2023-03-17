package kr.ac.kopo.day04;

public class OperationMain05 {
	
	public static void main(String[] args) {
		
		int num = 0xE55ff00; //0x 16진수
		
		System.out.printf("%8X\n", num); //x소문자로 출력 X대문자로 출력
		
		System.out.printf("%8X\n", ~num); //~비트낫
		
		System.out.printf("%08X\n", num & 0xffff0000); 
		System.out.printf("%08X\n", num | 0x0000ffff); 
		
		
		
	}
	

}
