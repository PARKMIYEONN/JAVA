package kr.ac.kopo.day03;

public class OperationMain01 {
	
	public static void main(String[] args) {
		
		int num = 123;
		
		//num = num + 1;
		
		//num = num + 50;
		
		num += 50; // 복합 대입 연산자, 배정 연산자   : +=  -=  *=  /=  %=
		
		num += 1;
		
		++num;// 증가연산자 : "="없이도 변수의 값이 변함 ";"앞에 혼자 쓰이면 ++num과 num++이 같음
		
		
		
		--num;// 감소연산자
		
		System.out.println("num : " + num);
		
		
	}

}
