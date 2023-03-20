package kr.ac.kopo.day10;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'r';
		
		System.out.println("str : [" + str + "]");
		
		int idx = str.indexOf(ch);
		System.out.println(ch + "위치 : " + idx);
		
		ch = 'p';
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		
		String searchStr = "lo";
		System.out.println(searchStr + "위치 : " + str.indexOf(searchStr));
		
		ch = 'l';
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		System.out.println(ch + "위치 : " + str.indexOf(ch,3));	//3번지부터 검색 시작
		System.out.println(ch + "위치 : " + str.lastIndexOf(ch));	//모든 l의 위치를 나타내려면 코드를 어떻게 만들어야 할까?
		
	}

}
