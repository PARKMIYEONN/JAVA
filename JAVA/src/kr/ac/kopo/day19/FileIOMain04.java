package kr.ac.kopo.day19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {
	
	public static void write() {
		
		//dataIO.txt에 데이터 저장
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/dataIO.txt");
			dos = new DataOutputStream(fos);
			
			int a = 59;
			char b = 'M';	
			int c = 109;
			double d = 12.34;
			
			dos.writeInt(a);
			dos.writeChar(b);
			dos.writeInt(c);
			dos.writeDouble(d);
			dos.flush();
			
			
			/*
			fos.write(59);				//이렇게 저장해봤자 모두 바이트로 저장한다
			fos.write(95);
			fos.write(109);
			fos.flush();
			*/
			
			
			System.out.println("저장완료.....");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iotest/dataIO.txt");
			dis = new DataInputStream(fis);
			
			int a = dis.readInt();
			char b = dis.readChar();				//저장한 순서대로 출력해야 한다
			int c = dis.readInt();					//저장한 순서를 기억해야 한다!!!!!!!!!!!!!!!!!
			double d = dis.readDouble();
			
			System.out.println("< 읽어온 결과 >");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(dis, fis);
		}
	}
	public static void main(String[] args) {
		
		read();
		//write();
	}

}
