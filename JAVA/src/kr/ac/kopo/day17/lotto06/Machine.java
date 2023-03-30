package kr.ac.kopo.day17.lotto06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
	
	private List<Ball> balls;
	
	public Machine() {			//기계에 45까지 수가 적힌 공을 넣는다
		balls = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			Ball ball = new Ball(i);
			balls.add(ball);	//???
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {			//내가 정의한 참조자료형을 갖고잇는 리스트이기 때문에 balls를 리턴타입이 Ball이 된다.
		return balls.remove(0);		//0번지를 삭제하면 1번지가 0번지로 당겨지기 때문에 0번지의 값을 받으면 된다  
				//왜 이게 Ball 타입이 되는지 모르겠어요ㅣ.....
	}

}
