package javaStudy;

public abstract class Bird { //추상 클래스 
	public abstract void sing(); //추상 메소드 (구현 내용 미정)
	
	//메소드가 하나라도 추상 메소드일 경우 클래스도 추상 클래스가 됌.
	
	//추상클래스 내부에 일반 메소드 구현 가능.
	public void fly() {
		System.out.println("bird can fly");
	}
}
