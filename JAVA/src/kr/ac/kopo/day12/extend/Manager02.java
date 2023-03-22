package kr.ac.kopo.day12.extend;

public class Manager02 extends Employee{
	
	//부모클래스의 멤버변수 전부 생략
	Employee[] empList;	// 관리하는 사원 목록, has a 패턴. 매니저는 관리사원 목록을 갖고있다. 배열을 멤버변수화 시킴.

	public Manager02() {
		
	}
	
	public Manager02(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no; //변수값이 부모클래스와 달라서 this로 데려와도 된다.
		super.name = name; //super로 써도 됨
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	@Override						//부모와 같은 이름의 메소드를 다른 내용으로 재정의 : 오버라이딩
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
