package kr.ac.kopo.day15.inter;

public interface TV {	//TV라면 이정도 기능은 다 같은 이름으로 구현하여 같이 사용할 수 있게 하자
						//TV에 대한 나만의 표준화 작업
	
	/*public static final*/ int MAX_VOLUME_SIZE = 50; //객체 없이도 사용할 수 있어야 됨 static, 상수변수 final, 어디서든 public
	int MIN_VOLUME_SIZE = 0;		
	
	/* public abstract (귀찮아서 생략. 써도 에러는 안 남) */void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();

}
