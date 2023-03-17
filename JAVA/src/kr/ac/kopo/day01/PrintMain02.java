package kr.ac.kopo.day01;

/*
 	printf : 변환문자를 이용하여 상수 출력
    %c     : 문자
    %d	   : 10진수 정수
    %f     : 실수
    %s     : 문자열
    %b     : 논리값
 */

public class PrintMain02 {
	
	public static void main(String[] args) {
		System.out.println(5>3);
		System.out.println(5<3);
		System.out.println(true);// 연산불가 논리값만 표현 가능
		System.out.println(false);
		
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		
		System.out.printf("[%5d] %f %s\n", 12345678, 12.34, "홍길동");
		//5d의 5는 무시됨
		
		//System.out.printf("[%-05d] %f %s\n", 10, 12.34, "홍길동"); 의미없음, 출력시 값이 달라짐, 출력불가
		
		System.out.printf("[%05d] %f %s\n", 10, 12.34, "홍길동");
		//빈칸에 0붙여서 출력
		
		System.out.printf("%d %f [%-10s]\n", 10, 12.34, "홍길동");
		//문자열 왼쪽 정렬
		
		System.out.printf("[%5d] %f %s\n", 10, 12.34, "홍길동");
		// ex)%5d 자릿수 확보
		
		System.out.printf("[%-5d] %f %s\n", 1000, 12.34, "홍길동");
		//(-)붙임, 왼쪽 정렬
		
		System.out.printf("[%5d] %f %s\n", 1000, 12.34, "홍길동");
		//무조건 5자리, 오른쪽 정렬
		
		System.out.printf("%d %.3f %s\n", 10, 12.34, "홍길동");
		//소수점3번째 자리까지 나타냄 반올림
		
		System.out.printf("%d %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.36, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.33+0.05, "홍길동");
		//올림
		
		System.out.printf("%d %.1f %s\n", 10, 12.36-0.05, "홍길동");
		//절사?
		
		System.out.printf("4>2 : %b\n",4>2);
		//논리값 출력 예제
		
	}
	

}
