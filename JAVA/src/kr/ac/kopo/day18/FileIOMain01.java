package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("문자를 입력하세요. ctrl+z 입력시 종료합니다");
		InputStream is = System.in;		
		InputStreamReader isr = new InputStreamReader(is);	//읽어오는 건 바이트형인 is가 아니라 문자형인 isr이다.
		while(true) {						
													
			try {
				int c = isr.read();		//읽어오는 대상이 인풋스트림형에서 인풋스트림리더형으로 바뀌면 바이트가 아닌 문자를 받는다.
				if(c == -1) {
					break;
				}
				System.out.print((char)c);	//int형인 c를 문자형으로 읽어내기 위해 명시적 형변환 필요
			} catch (IOException e) {
				e.printStackTrace();
			}						//read는 한 바이트씩 받아온다 //컴파일 시점의 예외처리
									//반드시 예외처리를 만들어줘야함
			
		}
		
		/*
		System.out.println("문자를 입력하세요. ctrl+z 입력시 종료합니다");
		InputStream is = System.in;			//1바이트단위라서 2바이트로 이뤄진 한글은 읽어낼 수 없음.
		while(true) {						//바이트로 들어온 데이터를 2바이트인 문자 형태로 바꿔주는 필터 클래스 : 
			//										InputStreamReader			
			try {
				int c = is.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}						//read는 한 바이트씩 받아온다 //컴파일 시점의 예외처리
			//반드시 예외처리를 만들어줘야함
			
		}
		*/
		
	}

}
