package kr.ac.kopo.day12.extend;

public class Manager03 extends Employee{
	
	//부모클래스의 멤버변수 전부 생략
	Employee[] empList;	// 관리하는 사원 목록, has a 패턴. 매니저는 관리사원 목록을 갖고있다. 배열을 멤버변수화 시킴.

	public Manager03() {
		
	}
	
	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);	//부모에 있는 생성자를 호출, 이 멤버변수들은 부모 클래스 내부에서만 제어 가능.
		this.empList = empList;
	}
	
	public void info() {	//상속은 부모클래스와 공유하는게 아니라 그거로 포함한 새로운 공간이 같이 생기는 거야.
		super.info(); 		//임플로이이 클래스 내의 info메소드를 데려와서 출력.
		System.out.println("------------------------------------------");
		System.out.println("\t\t< 관리사원 리스트 >");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
		
	}
}
