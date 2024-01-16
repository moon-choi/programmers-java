package javaUtil;

public class MyThread extends Thread {
	String str;
	public MyThread(String str) {
		this.str = str;
	}
	
	//run은 다른 흐름의 main 메소드 
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
