package kr.ac.kopo.day11.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {						//멤버변수가 모든 객체에 각각 존재할 필요는 없고
																	//모두에게 필요할 경우?
		
		System.out.println("입사한 사원수 : " + Employee.employeeCnt + "명");	//클래스 이름으로 접근하는 static변수.
																			// static변수는 new하기 전에 미리 생김.
		
		//		int totalCnt = 0;	//총 사원수는 Employee 클래스의 사원수와 관련된 것. 다른 클래스인 Main에 있는 건 이상한 일이야.
		
		Employee e = new Employee(1,"홍길동", 3_400, "사원"); //수를 좀 더 빠르게 파악하기 위한 ,로 나눠줄 수 없으니가 _로 표시

		Employee e2 = new Employee(2,"고길동", 3_700, "주임");
	
		Employee e3 = new Employee(3,"임길동", 3_500, "사원");
		
		System.out.println("입사한 사원수 : " + Employee.employeeCnt + "명");	//클래스 이름으로 접근하는 변수.
		
		e.info();
		e2.info();
		e3.info();
		
		e3.employeeCntInfo();
									//static메소드가 실행되는 시점에 객체가 만들어져 있을 것이란 보장이 없기 때문에
									//다른 멤버변수들을 static메소드 안에서 사용할 수 없음. this.도 사용이 불가. 만들어진 객체가 없으니까
		Employee.employeeCntInfo(); //static변수를 받는 메소드라서 클래스.메소드명()으로 구동.
		
									//외부에서 스태틱 변수에 접근 가능하면 바꿀 수도 있어서 위험함. 못 접근하게 막아야 돼
		System.out.println("입사한 총 사원수 : " + e3.employeeCnt + "명");//e3.~ 가능하지만 이렇게 쓰는 건 위험하기 때문에 클래스명으로 접근
	}

}
