package kr.ac.kopo.day02;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		double num = 12.34;
		
		num = /*(double)*/34; //double 안에 정수 34들어감(생략 가능)=묵시적 형변환
		
		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)45.67; //강제적(명시적) 형변환
		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4;
		num3 = 10.4f;//float형 실수, 23L=long형 정수
		
		
		System.out.println("num3 : " + num3);

		System.out.println(/*(double)*/12 + 12.34); //묵시적 형변환 자동으로 발생
		
	}

}
