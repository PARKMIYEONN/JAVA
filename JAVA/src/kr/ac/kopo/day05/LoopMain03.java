package kr.ac.kopo.day05;

public class LoopMain03 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		do{ 								//최소 한 번은 실행을 하기 위해 do while 문을 쓴다
			System.out.println("Hello");	//보통 에러 체크하기 위해 사용
			++cnt;							//스텝 수가 그냥 while문 보다 하나 적다.
		}while(cnt <= 5);//위의 {}와 관련있는 것이라고 알려주기 위해 ;를 붙인다.
		
		
		
		/*
		 {
			System.out.println("Hello");
		}for(int cnt = 1; cnt <= 5; ++cnt)
		*/ //불가 int초기화 오류
		
		
		
		
		/*
		int cnt = 1;
		for(; cnt >= 5; cnt--) { //조건식 때문에 0회 실행
			System.out.println("Hello");
		}
		
		while(cnt >= 5) { //조건식 때문에 0회 실행
			System.out.println("Hello");
			++cnt;
		}
		*/
		
	}

}
