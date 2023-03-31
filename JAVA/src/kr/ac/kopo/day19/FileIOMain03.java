package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {

	// Koala.jpg -> Koala3.jpg 복사
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("iotest/koala.jpg"); // 파일이름 대소문자 구분 없음!
			bis = new BufferedInputStream(fis); // 버퍼를 사용해서 빠르게! 읽는건 얘가!

			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos); // 버퍼를 사용해서 빠르게!

			long start = System.currentTimeMillis();
			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("Koala3.jpg에 복사 완료...");

			System.out.println("소요시간  : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
//			FileClose.close(bis);
//			FileClose.close(fis);
//			FileClose.close(bos);
//			FileClose.close(fos);
			
			/*
			if (bis != null) { // 버퍼를 먼저 클로즈를 해야 아웃풋 인풋을 클로즐 할 수 있다.
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/
		}
	

	}
	

}
