package kr.ac.kopo.day06;

public class ArrayMain01 {
	
	public static void main(String[] args) {
		
		int[] ar;
		ar = new int[7];
		
		System.out.println("ar : " +ar); //자바는 램에 직접 접근하지 못함. 이 주소는 가상 주소임.
		System.out.println("ar배열의 크기 : " + ar.length);
		
		System.out.println("첫번째 정수 : " + ar[0]);
		System.out.println("두번째 정수 : " + ar[1]); //heap영역에 new로 공간을 할당(동적할당)하면 
		System.out.println("세번째 정수 : " + ar[2]); //디폴드 값(비트를 모두 0으로 만듦)을 갖는다.
		System.out.println("네번째 정수 : " + ar[3]);
		System.out.println("다섯번째 정수 : " + ar[4]);
		//	System.out.println("여섯번째 정수 : " + ar[5]); 범위를 넘어섬. 오류가 남.
		
		for(int i = 0; i < ar.length; i++) {	//i의 초기값은 0으로 잡음, i<=ar.length-1보다 저걸 더 자주 씀
			System.out.println("ar[" + i + "] : " + ar[i]);
		}
	}

}
