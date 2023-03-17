package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 	1 - 3사이의 정수 입력 : 
 	
 	1입력 => ONE
 	2입력 => TWO
 	3입력 => TREE
 	나머지 => ERROR
 */
public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		System.out.print("1 - 3사이의 정수 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		switch(no) { //switch가 끝날때까지 다 읽어야됨. 중간에 책 덮겠다는 키워드가 필요(break)
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 : //문자, 정수, 문자열만 가능
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;	 //분기문
		default : 	 //if문에서의 else와 같다. but 얘는 중간에 와도 상관없음!
			System.out.println("ERROR");
		}
		
		/*
		if(no == 1 ) {
			System.out.println("ONE");
		} else if(no == 2) {
			System.out.println("TWE");
		} else if(no == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}

}

