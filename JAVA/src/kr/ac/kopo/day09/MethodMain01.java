//객체 말고 일반 메소드일 때 활용법!!!!

package kr.ac.kopo.day09;

public class MethodMain01 {
										// void 전달하고 싶은 값 없다.
										// 전달할 값이 있다면 그 값을 타입을 써주면 돼.
										// 리턴타입, 반환형, 리턴형 등으로 불러.
	static int prnStar(int b, String data) {  // void가 적힌 부분 : 피호출자 메소드가 호출자 메소드에게 값을 전달하고 싶을 때 사용.
								//int b : 호출자 메소드가 피호출자 메소드에게 정수를 보내면 b에게 그 값을 저장시켜야지.
								// 정수 하나와 문자열 하나를 받는다.
								// 이때 변수의 이름은 호출자 메소드의 것과 달라도 상관없음.
		// int a; // 메소드들 사이에선 변수가 독립적, 공유불가. 서로 무슨 변수가 있는지 알 수 없음.
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 :" + b);
		//return; //얘를 만나면 곧바로 뒷 문장을 수행하지 않고 호출자 메소드로 돌아감.
		System.out.println("호출자가 넘겨준 문자열 :" + data);
		int sum = b%10 + b/10; //넘겨주기 전까지 호출자는 이 변수를 몰라.
		
		return sum;
		//return 1; //return을 사용해서 이 값을 가지고 피호출자 메소드에서 호출자 메소드로 돌아가자
	}
	
	public static void main(String[] args) {
		
		int a = 10; // 메소드들 사이에선 변수가 독립적. 서로 무슨 변수가 있는지 알 수 없음.
		
									//int c : return값이 있다.
									//여러개의 값을 전달하고 싶을때 , 로 묶어서 보냄.
									//???파라미터???
		int c = prnStar(a, "abc"); // 여기에 있는 ()는 호출자 메소드가 피호출자 메소드에게 자신읭 변수를 전달하고 싶을 때 사용.
		System.out.println("자리수 합 : " + c);
		System.out.println("Hello");
		c = prnStar(5, "hi"); // 5라는 정수를 피호출자 메소드에 넘길 것이다.
		System.out.println("자리수 합 : " + c);
		System.out.println("HI");
		c= prnStar(22, "good");
		System.out.println("자리수 합 : " + c);
		System.out.println("Good-bye");
		c= prnStar(9, "bye");
		System.out.println("자리수 합 : " + c);
		
	}

}
