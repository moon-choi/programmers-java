package javaUtil;

public class JoinClass {

	public static void main(String[] args) { //메인 thread
		MyThread5 thread5 = new MyThread5();
		thread5.start(); //Thread 상속했으므로 바로 .start() 사용 가능.
		//수행흐름이 2개가 만들어짐. 
		
		System.out.println("main thread starts");
		
		try {
			thread5.join(); 
			//해석: thread5가 종료될 때까지 main은 더 이상 진행하지 않음.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //main thread는 MyThread5가 끝날때까지 기다렸다가 종료.
		
		System.out.println("main thread ends");
	}

}

/*
 Thread.join()
 
 Thread.join()이 호출'된' 스레드가 실행 완료될 때까지,
 더 이상 Thread.join()을 호출'한' 스레드가 진행되지 않는다.

*/