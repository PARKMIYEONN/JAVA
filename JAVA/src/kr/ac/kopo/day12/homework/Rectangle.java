package kr.ac.kopo.day12.homework;

public class Rectangle extends Figure{
	
	int height;
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void input() {
		int line = scan.nextInt("가로의 길이 : ");
		int height = scan.nextInt("세로의 길이 :");
		setLine(line);
		setHeight(height);
	}

	
	public int getHeight() {
		return height;
	}
	

}

