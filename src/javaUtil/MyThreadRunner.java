package javaUtil;

public class MyThreadRunner {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("*");
		MyThread mt2 = new MyThread("-");
		
		//Thread가 가진 .start()메소드 사용.
		mt1.start(); //총 2가지의 흐름인 상태 (main & mt1) 
		mt2.start(); //총 3가지의 흐름 (main & mt1 & mt2)
		
		System.out.println("My Thread 1's main ended"); //메인 종료됐지만 다른 Thread는 계속 진행됌. (콘솔에 찍히는 * 와 -)
	}

}
