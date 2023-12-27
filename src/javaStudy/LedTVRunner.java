package javaStudy;

public class LedTVRunner {

	public static void main(String[] args) {
	//참조 변수의 타입으로 인터페이스를 쓸 수 있음. 인터페이스가 가진 기능만 사용 가능.
		TV tv = new LedTV(); 
	//타입: 인터페이스	//클래스 
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(30);
		tv.turnOff();
	}

}
