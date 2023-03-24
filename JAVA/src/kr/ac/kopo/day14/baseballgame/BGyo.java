package kr.ac.kopo.day14.baseballgame;

public class BGyo {

	public void compare(int seJari, int[] a) {

		int frst = seJari / 100;
		int scnd = seJari % 100 / 10;
		int thrd = seJari % 100 % 10;
		int strike = 0;
		int ball = 0;
		int c = 0;
		int[] b = { frst, scnd, thrd };

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {
				strike = strike + 1;
			}
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[i] && a[i] == b[j]) {
					ball = ball + 1;
				}
			}
		}

		System.out.printf("%d STRIKE %d ball\n", strike, ball);
		if (b[0] == a[0] && b[1] == a[1] && b[2] == a[2]) {
			System.out.print("HomeRun!!!!!");
		}

	}

}
