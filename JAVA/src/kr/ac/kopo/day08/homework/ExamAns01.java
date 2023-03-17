package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class ExamAns01 {
	
	public static void main(String[] args) {

		int[][] numArr = new int[10][20];
		int loc = 0; // 정수를 총 몇개 입력받을지 알려줘
		

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. 최대 10개 입력, 0입력시 종료합니다");
//		int no = sc.nextInt();
		
		/*
		while (true) {
			numArr[loc++][0] = no;
			if (numArr[loc][0] == 0) {
				break;
			}
			if (++loc == numArr.length) {
				break;
			}
		}
		*/
		
		do {
			numArr[loc][0] = sc.nextInt();
			
			int j = 1;
			for(int i = 1; i <= numArr[loc][0]; i++) {
				if(numArr[loc][0] % i == 0) {
					numArr[loc][j++] = i;
				}
			}
			
			numArr[loc][0] = j-1; // (loc,0) 자리에 (loc,j)에 들어있는 수를 넣어준다.
			
		}while(numArr[loc][0] != 0 && ++loc < 10);
		
		for(int i = 0; i < loc ; i++) {
			int idx = numArr[i][0];
			System.out.print(numArr[i][idx] + "의 약수 : "); //numArr[i][numArr[i][0] : (i, numArr[i][0])의 값
			for(int j = 1; j <= idx; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
