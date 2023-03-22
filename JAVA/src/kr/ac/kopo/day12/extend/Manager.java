package kr.ac.kopo.day12.extend;

public class Manager extends Employee {

	Employee[] empList;

	public Manager() {		//Source - Generate Constructors from superclass
		super();
	}

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		super.info();
	}
	
	
	
	
}
