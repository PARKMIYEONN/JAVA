package kr.ac.kopo.day12.homework;

public class Triangle extends Figure  {

	int width;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void input() {
		int line = scan.nextInt("밑변의 길이 : ");
		int width = scan.nextInt("높이 : ");
		setLine(line);
		setWidth(width);
	}

	
	public int getWidth() {
		return width;
	}
	

}
