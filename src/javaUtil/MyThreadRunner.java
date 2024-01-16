package javaUtil;

public class MyThreadRunner {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("*");
		MyThread mt2 = new MyThread("-");
		
		mt1.start(); //총 2가지의 흐름 
		mt2.start(); //총 3가지의 흐름 
		
		System.out.println("main ended");
	}

}
