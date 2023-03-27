package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {
	
	public static void a() {
		
		System.out.println("a() 시작");
		try {
		//컴파일 시점 예외처리, Checked Exception
		FileReader fr = new FileReader("a.txt");	//하드디스크에 있는 특정한 파일을 읽기 위한 메소드
		} catch(FileNotFoundException fnfe) {		//컴파일 시점의 예외처리는 간접 예외처리와 연결된다
			fnfe.printStackTrace();					//어느 시점에서 예외가 발생하든 한군데로 모으기 위해 throws를 사용
		}
		System.out.println("a() 종료");
	}
	
	public static void b() throws Exception {
		
		System.out.println("b() 시작....");
		String str = null;
		System.out.println("length : " + str.length());
		System.out.println("b() 종료....");
		
	}
	
	
	public static void main(String[] args) throws Exception { 	//main도 메소드이기때문에 예외를 떠넘길 수도 있다
																//but 소프트웨어가 강제종료되기 때문에 직접 쓰진 않음
//		try {
			b();			
//		} catch(Exception e) {
//			System.out.println("main 예외처리....");
//			e.printStackTrace();
//		}
		a();
	}

}
