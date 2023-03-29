package kr.ac.kopo.day17.lotto03;

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
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			
		}
		
		for(int i = 0; i < 6; i++) {
			int randIdx = r.nextInt(45-i);	//랜덤인덱스의 범위가 매번 하나씩 줄어들어야 됨
			
			int temp = nums[randIdx];
			nums[randIdx] = nums[45-1-i];
			nums[45-1-i] = temp;
		}
		
		System.arraycopy(nums, nums.length - lottoNums.length, lottoNums, 0, lottoNums.length);
		return lottoNums;
	}
}












