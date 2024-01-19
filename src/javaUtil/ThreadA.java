package javaUtil;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start(); //ThreadB의 run thread 가동. b는 모니터링 락 획득. 
		//run method 안에서 자신의 모니터링 락을 획득함.
		//모니터링 락은 일단 한번 시작하면 방해 안받는 우선권.
		
		synchronized (b) { 
			try { //ThreadA의 main thread 가동 -> wait() 
				System.out.println("b가 완료될 때까지 기다립니다.");
				b.wait(); //wait()은 synchronized 블럭 안에 있음.
				//b.wait()하면 ThreadA의 main thread는 정지함. 
				//wait은 다른 thread가 반드시 notify 해줘만 깨어남.
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + b.total); 
			//ThreadB의 반복문이 다 실행되고 나면 나머지 main thread의 이 부분이 실행됌. 
		}
	}

}

/*
진행순서: Thread A main() 
-> System.out.println 
-> Thread A wait() 
-> Thread B run ()
-> notify
-> Thread A resume
-> System.out.println



1) main메서드에서 start()호출
start
----------
main 

2) start()는 새로운 쓰레드를 생성하고, 쓰레드가 작업하는데 사용될 호출스택 생성
start       |
----------  |
main        |

3) 새로 생성된 호출스택에 run()이 호출되어, 쓰레드가 독립된 공간에서 작업 수행
start       |
----------  |----------
main        | run

4)이제는 호출스택이 2개이므로 스케줄러가 정한 순서에 의해서 번갈아 가면서 수행
            |
----------  |----------
main        | run

*/