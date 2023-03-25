package kr.ac.kopo.day14.baseballgame;

public class BGyo {

	public int[] compare(int seJari, int[] a) {

		int frst = seJari / 100;
		int scnd = seJari % 100 / 10;
		int thrd = seJari % 100 % 10;
		int[] b = { frst, scnd, thrd };
		int strike = 0, ball = 0, out = 0;

		
		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {
				strike++;
				if(strike == 3) {
					break;
				}
			}
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[i] && a[i] == b[j]) {
					ball++;
				}
			}
			if(strike == 0 && ball == 0) {
				out++;
				if(out == 3) {
					break;
				}
			}
		}

		System.out.printf("%d STRIKE %d BALL\n", strike, ball);

		if (strike == 3) {
			System.out.println("HomeRun!!!!!");
		} else if (strike == 0 && ball == 0) {
			System.out.println("OUT");
		}

		return b;

	}

}
