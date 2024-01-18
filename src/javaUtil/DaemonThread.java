package javaUtil;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Deamon thread is running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //exception 발생시 while문 빠져나가게.
			}
		}

	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		//Daemon thread의 특징: 모든 thread들이 종료돼면 같이 종료됌.
		try {
			Thread.sleep(1000); //main thread는 쉬었다가 잠들 수 있도록.
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} 
		
		System.out.println("main thread is finished");
	}

}
