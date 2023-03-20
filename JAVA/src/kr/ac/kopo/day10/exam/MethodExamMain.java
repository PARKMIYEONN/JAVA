package kr.ac.kopo.day10.exam;

public class MethodExamMain {
	
	public static void main(String[] args) {	//만들어둔 클래스를 활용하기 위해 인스턴스 객체를 만들어준다.
		
		MethodExam exam = new MethodExam();
		
		int total = exam.getTotal(10,100);
		System.out.println("10 ~ 100사이의 총합 : " + total);
		
		exam.printGugudan(5); // MethodExam 클래스에 생성해야 하는 메소드
		exam.printGugudan();
		
		System.out.print("시작단 : ");
		int starDan = exam.getDan(); //얘는 그저 단 하나를 입력받아 건네주는 역할. 파라미터가 필요 없다.
		System.out.print("종료단 : ");
		int endDan = exam.getDan();	
		exam.printGugudan(starDan, endDan);
		
	}

}
