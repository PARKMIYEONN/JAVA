package kr.ac.kopo.day17.lotto01;

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
		loop:for(int i = 0; i < lottoNums.length; ) {	//여기 반복문부터 컨티뉴가 돌리고 싶음
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');		//중복체크를 위한 느낌표
					continue loop;				//컨티뉴가 어떤 반복문에 영향을 끼치고 싶은지 지정할 수 있음
				}
			}
			i++;
		}
		
		/*
		for(int i = 0; i < lottoNums.length; ) {
			lottoNums[i] = r.nextInt(45) + 1;
			boolean bool = true;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					bool = false;
					break;
				}
			}
			if(bool) {
				i++;
			}
		}
		*/
		return lottoNums;
	}
}












