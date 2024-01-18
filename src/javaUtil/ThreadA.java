package javaUtil;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start(); //ThreadB의 run thread 가동 -> notify() 
		//run method 안에서 자신의 모니터링 락을 획득함.
		
		synchronized (b) { 
			try { //ThreadA의 main thread 가동 -> wait() 
				System.out.println("b가 완료될 때까지 기다립니다.");
				b.wait(); //wait()은 synchronized 블럭 안에 있음.
				//b.wait()하면 main thread는 정지함. 
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + b.total); 
			//ThreadB의 반복문이 다 실행되고 나면 나머지 main thread의 이 부분이 실행됌. 
		}
	}

}
