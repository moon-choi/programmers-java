package javaUtil;

//2. Thread 상속 안받고 Runnable 인터페이스 사용하는 법.
//자바는 단일상속만 지원하므로 이미 다른 클래스를 상속받을 때는 Thread를 상속할 수 없음.
//만약 다른 클래스를 상속받고 있다면 Runnable interface 사용해서 구현하면 됌.
public class MyThread2 implements Runnable {
	String str;
	
	public MyThread2(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
