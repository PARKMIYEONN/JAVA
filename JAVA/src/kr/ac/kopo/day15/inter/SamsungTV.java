package kr.ac.kopo.day15.inter;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료");
	}

	@Override
	public void powerOn() {
		
		System.out.println("전원을 켭니다");

	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다");

	}

	@Override
	public void channelUp() {
		System.out.println("CHANNEL UP...");

	}

	@Override
	public void channelDown() {
		System.out.println("CHANNEL DOWN...");
		

	}

	@Override
	public void volumeUp() {
		
		System.out.println("Volume up...");

	}

	@Override
	public void volumeDown() {
		
		System.out.println("Volume down...");

	}

	@Override
	public void mute() {
		System.out.println("MUTE....");

	}

}
