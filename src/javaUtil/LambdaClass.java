package javaUtil;

public class LambdaClass {

	public static void main(String[] args) {
	
		new Thread(new Runnable() {
					@Override
					public void run() {
						for(int i = 0; i < 5; i++) {
								System.out.println("hello");
							}
						}
					}
				).start(); //Thread가 생성됐으므로 바로 start 메소드 사용 가능. 
		
	}

}

/*
	자바는 메소드만 매개변수로 전달할 방법이 없고 인스턴스만 전달 가능.
	그래서 run이라는 메소드를 갖고있는 Runnable을 매번 객체로 만들어서 전달. 
	만약 메소드만 전달할 수 있으면 더 편리함. -> 람다표현식으로 해결.
*/