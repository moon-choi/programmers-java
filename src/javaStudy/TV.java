package javaStudy;

//인터페이스 선언은 추상 메소드처럼 abstract 안 써줘도 됌.
public interface TV {
	
	//인터페이스 내 상수 선언은 final 안 써줘도 됌.
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
