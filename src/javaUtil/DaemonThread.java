package javaUtil;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) { //무한 루프.
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
		thread.setDaemon(true); // true로 설정시 데몬스레드로 동작함
		thread.start();
		
		//Daemon thread의 특징: 모든 thread들이 종료돼면 같이 종료됌.
		try {
			Thread.sleep(2000); //main thread는 쉬었다가 잠들 수 있도록. 만약 없으면 daemon 은 메인과 함게 바로 종료돼림.
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} 
		
		System.out.println("main thread is finished"); //sleep 끝난 후 마지막 main 메소드 부분 실행.
	}

}

/*
1. 데몬스레드 vs 사용자스레드
 
사용자스레드(user thread)는 foreground에서 실행되는 높은 우선순위를 가진 스레드입니다. 
자바 프로그램을 실행시키면 JVM은 main()메서드가 실행되는 main스레드를 생성하는데 이 main스레드가 사용자스레드입니다. 
그리고 main스레드에서 새로운 스레드를 생성하게 되면 부모 스레드의 속성을 상속받아 기본적으로 사용자스레드가 되며, 
이렇게 생성된 사용자스레드들이 모두 종료하게 되면 그 프로그램은 종료하게 됩니다. 
 
데몬스레드(daemon thread)는 background에서 실행되는 낮은 우선순위를 가진 스레드입니다. 
주로 보조적인 역할을 담당하는데 사용되며, 자바에서 메모리 정리를 해주는 가비지 컬렉터(garbage collector)가 대표적인 데몬스레드입니다. 
데몬스레드와 사용자스레드의 가장 큰 차이점은 JVM이 데몬스레드가 작업이 끝날때까지 기다리지 않는다는 점입니다.*** 
사용자스레드가 모두 종료되면 데몬스레드는 자동으로 종료됩니다.***
 
 
 
2. 데몬스레드 생성방법
 
데몬스레드를 만드는 방법은 먼저 스레드 객체를 만든 후 스레드 실행 요청 전에 setDaemon() 메소드를 이용해서 데몬스레드로 동작하도록 설정하시면 됩니다. 

MyThread mt1 = new MyThread();
mt1.setDaemon(true);     // true로 설정시 데몬스레드로 동작함
mt1.start();
*/
