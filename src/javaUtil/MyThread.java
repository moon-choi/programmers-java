package javaUtil;

//Thread 상속 받음.
public class MyThread extends Thread {
	String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	//run은 다른 흐름의 main 메소드 (MyThreadRunner에서)
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {		//.sleep 메소드는 매개변수로 long 타입의 millis를 받음.
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
