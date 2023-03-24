package kr.ac.kopo.day14.dohyeong;

public abstract class Figure {
	
	private double area;
	
	public double getArea() {	//private인 area의 값을 외부에서 알기 위한 메소드 : get
		return this.area;
	}
	
	public void setArea(double area) {		//private인 area의 값을 외부에서 수정하기 위한 메소드 : set
		this.area = area;
		
	}										//geter seter 메소드 : 값을 보고 수정할 수 있는 메소드만 알고 직접적인 변수 이름은 알 수 없음
											//다른클래스에서 값을 보고 수정을 하기 위해 내 클래스를 이용할 수 밖에 없게 됨	
	
	public abstract void printArea();

}
