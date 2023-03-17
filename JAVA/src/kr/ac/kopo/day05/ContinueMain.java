package kr.ac.kopo.day05;

public class ContinueMain {

public static void main(String[] args) {
		
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				continue; // 반복할 문장을 수행하지 않아도 사이클을 돌았다 생각하고 cnt++로 간다.
			}			  //if else로 똑같이 수행 가능.
			
			System.out.println("HI");
		}
		System.out.println("cnt : " + cnt); //cnt 값은 11인 채로 빠져나옴
	}
}
