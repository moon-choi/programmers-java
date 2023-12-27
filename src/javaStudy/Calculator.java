package javaStudy;

public interface Calculator { //인터페이스 
	public int plus(int i, int j); //메소드 구현 안하고 틀만 잡아 놓음. MyCal에서 구현함. 
	
	public int multiply(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	} //인터페이스 안에서도 디폴트 키워드 붙이면 메소드 구현 가능 

	public static int exec2(int i, int j) {
		return i * j;
	//인터페이스 안에서도 스태틱 키워드 붙이면 내용 구현 가능
	//대신 스태틱이므로 Calculator.exec2로 써야함
	}
}
