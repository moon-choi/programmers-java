package javaUtil;

public class MyThreadRunner2 {

	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("+");
		MyThread2 mt2 = new MyThread2("=");
		
		Thread thread1 = new Thread(mt1);
		Thread thread2 = new Thread(mt2);
		
		//Thread를 상속받은 것이 아니므로 .start() 메소드를 쓸 수 없음. 
		//그래서 Thread 객체를 만들어야함.
		thread1.start();
		thread2.start();
		
		System.out.println("My Thread 2's main ended");
	}

}
