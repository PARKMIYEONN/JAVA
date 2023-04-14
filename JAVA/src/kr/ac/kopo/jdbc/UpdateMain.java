package kr.ac.kopo.jdbc;

class Employee implements AutoCloseable{
	
	@Override
	public void close() throws Exception {		// 인터페이스를 상속받았으니까 무조건 오버라이딩 해줘야 함
		System.out.print("close...");
	}
	
}

public class UpdateMain {
	
	public static void main(String[] args) {
		
		try (								//try문의 ()안에서는 인스턴스 객체를 생성하는 목적으로만 사용할 수 있다
			Employee e = new Employee();	//()안에 객체를 만들어주면 그 객체는 이 구문이 끝나면 무조건 close메소드를 호출하도록 되어있다
			){								//따라서 오토클로저블 인터페이스를 상속받은 객체들만 이 괄호 안에 사용할 수 있다
			
		} catch (Exception e) {
			
		}
		
	}

}
