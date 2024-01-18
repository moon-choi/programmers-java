package javaUtil;

public class JoinClass {

	public static void main(String[] args) { //메인 thread
		MyThread5 thread = new MyThread5();
		thread.start(); //Thread 상속했으므로 바로 .start() 사용 가능.
		//수행흐름이 2개가 만들어짐. 
		
		System.out.println("main thread starts");
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //main thread는 MyThread5가 끝날때까지 기다렸다가 종료.
		
		System.out.println("main thread ends");
	}

}
