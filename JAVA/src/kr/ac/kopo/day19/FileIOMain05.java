package kr.ac.kopo.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// iotest/FileIOMain02.java.txt ==> iotest/FileIOMain02-1.java.txt 복사
public class FileIOMain05 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain02.java.txt");
			fw = new FileWriter("iotest/FileIOMain02-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();	//한줄씩 저장해서 보냄
				if(data == null)
					break;
				bw.write(data);			
				bw.newLine();			//스트링엔 엔터는 저장 안됨. 한줄씩 읽었을 때 엔터를 쳐주기 위해 뉴라인 사용
			}
			bw.flush();
			System.out.println("파일 저장 완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
