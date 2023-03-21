package kr.ac.kopo.day11.stat;

public class Employee {
	
	int no;
	String name;
	int salary;
	String grade;
	static int employeeCnt; //클래스당 하나면 됨
	
	Employee(){
		++employeeCnt;
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;	//non static이면 new로 만들어진 순간 독립적인 공간에 따로 생기게 됨 +1만 됨.
	}
	
	void info() {
		System.out.println("사번 : " + no + ", 이름 : " + name + ", 연봉 : " + salary + "만원 , 직급 : " + grade);
	}
	
	static void employeeCntInfo() {		//static변수를 출력하는 기능의 메소드도 객체를 생성하지 않고 사용할 수 있어야 됨
										//static을 붙여줌.
		// this.name = "고길동";	멤버변수 사용불가. static메소드가 실행되는 시점에 인스턴스 객체가 만들어져 있을 것이란 보장이 없기 때문에
		System.out.println("입사한 사원수 : " + Employee.employeeCnt + "명");
	}

}
