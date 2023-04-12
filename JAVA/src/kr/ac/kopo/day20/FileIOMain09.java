package kr.ac.kopo.day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain09 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 20, "010-1111-2222");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/userInfo.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.flush();
			
			System.out.println("userInfo.dat 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
		
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/userInfo.dat");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			
			System.out.println(user);
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois,fis);
		}
	}
	
	public static void main(String[] args) {
		
		read();
		//write();
		
	}
}
