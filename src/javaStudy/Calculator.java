package javaStudy;

public interface Calculator {
	public int plus(int i, int j);
	
	public int multiply(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	} //디폴트 키워드 붙이면 메소드 구현 가능 

	public static int exec2(int i, int j) {
		return i * j;
	// 스태틱 메소드면 내용 구현 가능 
	}
}
