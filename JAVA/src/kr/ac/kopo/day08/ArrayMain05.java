package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain05 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		int[] dest = new int[arr.length];
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("dest : " + Arrays.toString(dest));
		
		/*
		for(int i = 0; i < arr.length; i++) {
			dest[i] = arr[i];
		}
		*/
		
		//System.arraycopy(arr, 0, dest, 0, arr.length);
		
		for(int i = 3,j = 1; i < 6; i++, j++) {
			dest[j] = arr[i];
		}									//i는 몇 개를 복사할 것인지
		for(int arrIdx = 3, destIdx = 1, i = 0; i < 3; i++) {
			dest[destIdx++] = arr[arrIdx++];
		}
		
		System.arraycopy(arr, 2, dest, 1, 4);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("dest : " + Arrays.toString(dest));
	}

}
