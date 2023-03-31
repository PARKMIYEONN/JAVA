package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;

public class FileClose {
														
	public static void close(InputStream is) {			//멤버변수 없이 메소드만 갖고 있는 놈이기 때문에
		if(is != null) {								//객체를 만들 필요가 없음. 메소드만 static으로 만들어줌!
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream bis, InputStream is) {		
		close(bis);
		close(is);
	}
	
	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void close(OutputStream bos, OutputStream os) {
		close(bos);
		close(os);
	}

}
