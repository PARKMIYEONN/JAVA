package kr.ac.kopo.day17.lotto05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			nums.add(i);
		}
		Collections.shuffle(nums);		//순서를 섞는다...............
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = nums.get(i);
		}
		
		return lottoNums;
	}
}












