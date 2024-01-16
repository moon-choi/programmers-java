package javaUtil;

public class MyThreadRunner2 {

	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("+");
		MyThread2 mt2 = new MyThread2("=");
		
		Thread thread1 = new Thread(mt1);
		Thread thread2 = new Thread(mt2);
		
		thread1.start();
		thread2.start();
	}

}
