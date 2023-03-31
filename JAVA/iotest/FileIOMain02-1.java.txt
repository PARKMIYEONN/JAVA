package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {
	
	// iotest/Koala.jpg 파일을 iotest/Koala1.jpg에 복사
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try { // 하드디스크에 이 파일이 없을 수 있기 때문에 그때를 대비한 예외처리를 해줘야 함
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala1.jpg");
			long start = System.currentTimeMillis();

			while (true) {
				int c = fis.read(); // fis가 Koala.jpg의 주소값을 알고 있지! 걔를 읽을거얌
				if (c == -1)
					break;
				fos.write(c); // fos가 Koala1.jpg의 주소값을 알고 있지 걔를 복사받을거얌
			}
			fos.flush(); // 못 나가는 애들이 생기지 않게 아웃풋 스트림에 남아있는 애들을 끝까지 쭉 밀어줘(출력용)

			long end = System.currentTimeMillis();
			System.out.println("Koala1.jpg로 복사 완료....");
			System.out.println("소요시간  : " + (end - start) / 1000. + "초");
			while (true);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException io) { // 외부 장치의 입출력을 실행하는 중에 예기치 못한 상황이 발생할 수 있어
			io.printStackTrace();  // catch 이렇게 여러번 쓰기 싫으면 묵시적 형변환 Exception으로 받으면 됨
		} finally {
			if(fis != null) {
				try {
					
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					
					fos.close();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		}

	}

}
