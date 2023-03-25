package kr.ac.kopo.baseballgame;

public class PlayTheGame {
	
	public void play() {
		
		//랜덤 수
		RandomNum num = new RandomNum();
		int[] ran = num.nextInt();
		
		/*	랜덤 수 확인용
		 
		for (int i = 0; i < ran.length; i++) { 
			System.out.println(ran[i]);
		}
		*/
		
		//사람에게 입력받고 비교하기
		Compares cprs = new Compares();
		cprs.comparenum(ran);
	
	}

}
