package javaStudy;

public class MathClass {

	public static void main(String[] args) {
		int value1 = Math.max(5, 30); //static 하므로 클래스이름.메소드 바로 
		System.out.println(value1);
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		Math.abs(-10); //절대값 
		System.out.println(Math.random()); //random이 리턴은 double. 
 	
		System.out.println(Math.sqrt(25)); //제곱
	}

}
