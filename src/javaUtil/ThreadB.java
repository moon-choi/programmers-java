package javaUtil;

public class ThreadB extends Thread {
	int total;
	
	public void run() { //this는 자신.
		synchronized (this) { //모니터링 락을 걸음. 일단 실행되면 우선권을 얻게.
					//this는 run이 호출됀 객체를 의미함.
			for(int i = 0; i < 5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;
				
				try {
					Thread.sleep(500); //0.5초마다 반복 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify(); //notify()는 synchronized 블럭 안에 있음.
			//반복문 끝나면 wait하고 있는 ThreadA의 main thread를 깨움. 
		}
	}

}

/*
	void wait() : 현재 스레드를 다른 스레드가 이 객체에 대한 notify() 또는 notifyAll() 메소드를 호출할때까지 대기합니다. 
	void wait(long timeout) : 현재 스레드를 다른 스레드가 이 객체에 대한 notify() 또는 notifyAll() 메소드를 호출하거나 timeout 시간동안 대기합니다. 
	void notify() : 이 객체에 대해 대기중인 스레드 하나를 깨웁니다. 
	void notifyAll() : 이 객체에 대해 대기중인 모든 스레드를 깨웁니다.
	
	-
	
	메서드	  | 기능										| 비고
	wait	  | 갖고 있던 고유 락을 해제하고, 스레드를 잠들게 한다.	| 호출하는 스레드가 반드시 고유 락을 갖고 있어야 한다. 다시 말해, synchronized 블록 내에서 호출되어야 한다.
	notify	  | 잠들어 있던 스레드 중 임의로 하나를 골라 깨운다.	| 상동
	notifyAll |	호출로 잠들어 있던 스레드 모두 깨운다.	상동		| 상
	
	- 
	
	세 메서드가 공통으로 갖는 전제 조건이 보인다. 
	그것은 호출 스레드가 반드시 대상 객체의 고유 락을 갖고 있어야 한다는 것이다. 
	다시 말해, 이 메서드들은 synchronized 블록 내에서 실행되어야 한다.***
	모니터 락이 걸리면(notify) 스레드 실행. 락이 해제돼면(wait) 스레드는 잠듦.
	락은 Do not disturb! Work in progress로 이해하기.
	-
	 
	wait() 메서드를 호출하면 락을 해제하고, 스레드는 잠이 든다. 
	누군가 깨워줄 때 까지 wait()은 리턴되지 않는다.
	notify(), notifyAll() 메서드는 둘 다 wait()으로 잠든 메서드를 깨운다. 
	둘의 차이는 잠든 스레드 하나만 깨우냐, 모두 깨우냐의 차이이다. 
	notify() 메서드는 어느 스레드를 깨울지 선택할 수 없기 때문에 제어가 어렵다. 
	그래서 보통은 notifyAll()을 사용한다. 
	notifyAll()이 모든 스레드를 깨우긴 하지만 이 메서드를 호출한다고 해서 잠들어 있던 모든 스레드가 동시에 동작하는 것은 아니다. 
	wait()으로 잠든 코드가 synchronized 블록 안에 있다는 것을 떠올려보자! 
	notifyAll()로 깨어난 스레드들은 다시 락을 획득하기 위해 경쟁해야 한다. 
	락을 획득한 스레드만이 wait() 함수를 리턴시키고, 그 다음 로직을 수행할 수 있다.
*/