package kr.ac.kopo.day07;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
//		int[] arr = {10, 20, 30, 40, 50};  선언과 동시에 초기화 하면 new int[]가 생략 가능.
		int[] arr = new int[] {10, 20, 30, 40, 50}; //24,25번째 줄 설명 참조
		/*
		int[] arr = new int [5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 3;
		}
		*/
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		//1 2 3 4 5 6 7 8 9 10 10개의 정수를 가지는 배열 arr 선언
		
//		arr = new int[10]; // 새롭게 배열이 생겨서 앞에 5짜리 배열은 주소를 기억하는 변수를 잃음. 공간은 남음.
//		arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; {}만 사용하는 초기화 방식은 꼭 변수 선언이 함께 일어나야 함.
		arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //이렇게 초기화 하는 거야.
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
