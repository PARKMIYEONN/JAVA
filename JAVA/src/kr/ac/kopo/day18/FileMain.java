package kr.ac.kopo.day18;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		System.out.println("---------------------");
		System.out.println(dirObj.getPath() + "폴더");	//iotest폴더 경로니까 걔만보임
		System.out.println("---------------------");
		String[] dataArr = dirObj.list();			//list는 스트링배열 타입이다
		for(String data : dataArr) {				//스트링배열값 순서대로 출력
			System.out.println(data);
		}
		System.out.println("---------------------");
		
		/*
		
		File dirObj = new File("iotest/새폴더/강아지");
		
		System.out.println(dirObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다"); //폴더인지 아닌지
		//dirObj.mkdir();	폴더 하나만 생성
		dirObj.mkdirs();	//연결된 폴더 다같이 생성
		System.out.println(dirObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다"); //폴더인지 아닌지
		
		
		/*
		File fileObj = new File("iotest/a.txt");
	
		System.out.println(fileObj.exists() ? "존재합니다" : "잘못된 이름입니다");
		
		System.out.println(fileObj.isFile() ? "파일입니다" : "파일이 아닙니다");	//isFile 파일인지 아닌지 알려줌
		
		System.out.println(fileObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다"); //폴더인지 아닌지
		
		System.out.println("실제 주소 : " + fileObj.getAbsolutePath());
		
		System.out.println("path : " + fileObj.getPath());
		
		System.out.println("폴더명 : " + fileObj.getParent());
		
		System.out.println("NAME : " + fileObj.getName());
		
		System.out.println("파일 크기 : " + fileObj.length() + "bytes");	//바이트 단위	
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기붉가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기 불가능");
		long lastTime = fileObj.lastModified();
		String pattern = "yyyy년 MM월 dd일  hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.format(new Date(lastTime));
		System.out.println("마지막 수정날짜 : " + sdf.format(new Date(lastTime)));
		*/
	}

}
