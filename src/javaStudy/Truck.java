package javaStudy;

public class Truck extends Car {
	public Truck() {
		super(); //안써도 됌. 컴파일러는 자동으로 super();를 호출해서 부모의 기본 생성자를 호출했음.[A]
//		super(name); //그렇다면 왜 굳이 super()쓰나? [B]
//		만약 부모가 기본 생성자 super() 없고 변수 쓰는 생성자만 있을 때에는 super(변수)해줘야 함.
		
		System.out.println("Truck의 기본 생성자 ");
	}

}
