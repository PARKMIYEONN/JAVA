package kr.ac.kopo.day14.baseballgame;

public class BallCount {

	public int checkBall(int[] a, int b) {
		
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				c = c + 1;
			}
		}
		return c;
	}

}
