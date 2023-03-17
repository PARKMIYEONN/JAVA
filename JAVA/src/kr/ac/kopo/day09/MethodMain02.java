package kr.ac.kopo.day09;

public class MethodMain02 {
	
	public static void main(String[] args) {	//자바에서는 메소드를 구분하는 구분자가 
												//메소드명 + 파라미터(매개변수명) 이다.
		Method m = new Method(); // 다른 클래스에 들어있는 메소드의 인스턴트 객체를 만듦
		m.call(); //실체화 한 객체에 다른 클래스에 정의된 call메소드를 호출하는 방법
		m.call(10); // 메소드 안의 매개변수(파라미터)가 다르기 때문에 둘은 이름이 같지만 다른 메소드이다.
		m.call("바보", 10);
		m.call('a'); // 묵시적 형변환 실행
		m.call(12.34); // 얘를 감싸줘서 묵시적 형변환 시켜줄 게 없음. 새로 만들거임.
		
	}

}
