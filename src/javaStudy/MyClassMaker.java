package javaStudy;

public class MyClassMaker {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.method1();
		mc.method2(10);
		int mc3 = mc.method3();
		System.out.println(mc3);
		mc.method4(5, 10);
		mc.method5(5);
		int mc5 = mc.method5(55);
		System.out.println(mc5);
	}

}
