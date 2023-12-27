package javaStudy;

public class LedTV implements TV { //implements: 인터페이스를 구현하겠다. 
									//-> 인터페이스가 가진 기능들을 클래스가 모두 갖게 하겠다.
	@Override
	public void turnOn() {
		System.out.println("tv on");
	}

	@Override
	public void turnOff() {
		System.out.println("tv off");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("volume change");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("channel change");
	}

}
