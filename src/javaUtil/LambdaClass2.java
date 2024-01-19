package javaUtil;

//람다식 = 익명메서드.
public class LambdaClass2 {

	public static void main(String[] args) {
		new Thread(() -> {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
		}).start(); //자바는 메서드만 매개변수로 전달할 방법이 없기 때문에 run이라는 메서드를 갖고있는 Runnable을 객체로 만들어서 전달. 

	}

}