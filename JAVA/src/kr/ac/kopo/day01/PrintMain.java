package kr.ac.kopo.day01;

/*
 	출력메소드    System.out.출력메소드()
 	print()   : 개행문자X
 	println() : 개행문자O(엔터버튼 포함)
 	printf()  : 1.5버전이후생김 f:포맷팅 개행문자X
 	
 */
public class PrintMain {
	
	public static void main(String[] args) {
		
			
		System.out.println(10 + " " + 12.34 + " " + "홍길동");//" "문자열
		//방법3
		System.out.print(10);
		System.out.print(' ');//문자
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		System.out.print('홍');
		System.out.print('\n');
		System.out.print("A\n");
		//방법3
		System.out.print('A');
		System.out.print('\n');
		//방법2
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		//방법1
	}
	

}
