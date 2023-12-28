package javaStudy;

public class Car {
	//생성자는 리턴 없음. (메소드는 있음)
	public Car() {
		System.out.println("Car의 기본 생성자"); //[A]
	}

//	public Car(String name) {
//		System.out.println("Car의 name 생성자"); //[B]
//	}
	
	public void drive() {
		System.out.println("1. let's drive a car");
	}
	
}
