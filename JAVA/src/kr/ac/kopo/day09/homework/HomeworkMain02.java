package kr.ac.kopo.day09.homework;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		Student[] stuArr = new Student[5];	//반복문을 넣어주면 됨.
		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
		}
	}

}
