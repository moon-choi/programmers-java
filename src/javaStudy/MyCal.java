package javaStudy;

public class MyCal implements Calculator {

	@Override
	public int plus(int i, int j) {
		return i + j; //인터페이스에 받아온 틀 안에 메소드 내용 구현 
	}

	@Override
	public int multiply(int i, int j) {
		return i * j; //인터페이스에 받아온 틀 안에 메소드 내용 구현
	}


}
