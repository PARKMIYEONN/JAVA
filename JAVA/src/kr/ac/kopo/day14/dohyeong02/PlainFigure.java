package kr.ac.kopo.day14.dohyeong02;

public abstract class PlainFigure extends Figure {	//얘로는 만들 객체가 없기 때문에 오버라이드로 추상메소드를 채워줄 필요 없음
													//그냥 나도 (상속된)추상 메소드를 가진 추상 클래스가 되면 됨
	
	private int width;
	protected int height;
	
	public PlainFigure() {
		
	}
	
	
	public PlainFigure(int width, int height) {		//source Generate Constructor 블라블라 쓰면 자동으로 만들 수 있음.
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public void setArea(double area) {	//부모와 같은 추상 메소드이기 때문에 오버라이드 하지 않아도 상관 없음.
		super.setArea(area);
	}

}
