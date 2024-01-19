package javaUtil;

//람다식 = 익명 메서드.
public class LambdaClass2 {

	public static void main(String[] args) {
		new Thread( //인스턴스 생성없이 바로 메소드 전달. 
				() -> {
						for(int i = 0; i < 5; i++) {
							System.out.println("hello");
						}
					}
				).start();

	}

}