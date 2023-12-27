package javaStudy;

public class MethodOverload {

	//Method overloading: 과적. 같은 클래스 내 매개변수 갯수, 타입 다른 경우 같은 이름으로 메소드 정의 가능.
	//Method override와 헷갈리지 말 것 (부모-자식 클래스간 같은 메소드 이름에 올라타는 것).
	
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y, String z) {
		return x + y + z;
	}
}
