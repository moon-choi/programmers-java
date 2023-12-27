package javaStudy;

public class MethodOverloadRunner {

	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		
		System.out.println(mo.plus("a", "b", "c"));
		System.out.println(mo.plus(1, 2, 3));
		System.out.println(mo.plus(1, 2));
		System.out.println(mo.plus("e", "f", "g"));		//참조 변수의 타입으로 인터페이스를 쓸 수 있음. 인터페이스가 가진 기능만 사용 가능.
	}

}
