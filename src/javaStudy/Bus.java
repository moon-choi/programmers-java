package javaStudy;

public class Bus extends Car {

	public Bus() {
		super(); //생략할 경우 보이지는 않지만 부모클래스의 기본 생성자 호출. 
	}
	
	//drive 메소드는 없지만 부모인 Car클래스로부터 drive() 메소드 상속받음.
	public void beep() {
		System.out.println("let's beep");
	}
	
	public void drive() {
//		super.drive(); //자식 클래스 내부에서 명시적으로 super 키워드 붙여서 부모의 메소드 호출 
		System.out.println("2. let's drive a bus"); //자식의 메소드 호출 
	}
}
