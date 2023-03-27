package kr.ac.kopo.day15.inter;

public class UserMain {
	
	public static void main(String[] args) {
		
		//TV tv = new LGTV();		//객체 형변환
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeDown();
		tv.mute();
		tv.channelUp();
		tv.mute();
		tv.powerOff();
		SamsungTV sam = (SamsungTV)tv;
		
		System.out.println(sam);			//toString은 오브젝트를 상속받은 것이지 인터페이스를 이용한 것이 아니기 때문에 
											//인터페이스 tv로는 사용 불가. but 추상클래스로는 사용가능!!
		System.out.println(sam.toString());	//모든 클래스는 다 오브젝트 클래스를 상속받는다
	}

}
