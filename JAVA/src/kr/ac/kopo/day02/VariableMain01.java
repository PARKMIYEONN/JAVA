package kr.ac.kopo.day02;

public class VariableMain01 {
	public static void main(String[] args) {
		
		char ch;
		
		ch = 'A';
		
		{ 
			int a = 10;
			System.out.println("a : " + a);
			
		}
		// a=20; //문법오류가 발생되는 이유를 알아보기!! {}는 변수의 생애주기, 저 안에서만 선언됨
		
		ch = '!';
		ch = 80;
		ch = '\u0061';
		
		System.out.println("ch : " + ch);
		
		
	}
	

}
