package javaUtil;

public class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("My Thread 5: " + (i + 1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//JoinClass.java
}
