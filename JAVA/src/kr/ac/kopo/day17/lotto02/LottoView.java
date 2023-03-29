package kr.ac.kopo.day17.lotto02;

import java.util.Arrays;
import java.util.Random;

public class LottoView {
	private Random r = new Random();

	public void start() {
		
//		System.out.print("게임수를 입력 : );
		int gameCnt = 3;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}
		
	}
	
	private int[] getLotto() {
	
		int[] lottoNums = new int[6];
		boolean[] flags = new boolean[45];	// 0 ~ 44	boolean배열 만들기
		
		for(int i = 0; i < lottoNums.length;) {
			int random = r.nextInt(45);	//불린배열에 맞추기 위해 +1 지금 안함
			if(!flags[random]) {
				lottoNums[i++] = random+1;	//여기서 +1 해줌, i도 여기서 증가
				flags[random] = true;
			} else 
				System.out.print('!');
		}
		
		return lottoNums;
	}
}












