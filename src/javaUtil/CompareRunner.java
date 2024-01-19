package javaUtil;

public class CompareRunner {
	//Compare 인터페이스를 받아들여서 실행하는 메소드.
	public static void exec(Compare comp) {
		int a = 10;
		int b = 20;
		int value = comp.compareTwo(a, b);
		System.out.println(value);
	}
	
	//람다식으로 compareTwo 메소드의 구현부 작성.
	public static void main(String[] args) {
		exec((i, j) -> {
			return i - j;
		});
	}
/* 
	1. JVM은 exec 메소드를 찾아본다. (매개변수 두 개를 받아들이는 메소드를 찾아본다).
	2. Compare 인터페이스를 받아들이는 exec 메소드가 알맞는 메소드인 것을 찾게 됌.
	3. JVM은 람다식을 Compare를 구현하는 익명 객체로 만들어서 exec에 전달함.
	
	메소드만 인자로 전달하려면 반드시 객체를 만든 다음에 전달해야했으나, 
	자바 8에서 람다식이 생기면서 함수만 전달할 수 있게 됌. 
 */
}
