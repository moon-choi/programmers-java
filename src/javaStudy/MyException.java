package javaStudy;

public class MyException {

	public static void main(String[] args) {
		int i = 10;
		int j = 2; //int j = 0;
		
		try { //수행할 코드, 예외 발생 가능성이 있는 블럭.
			
			int k = i / j;
			System.out.println(k); //예외 발생 지점에서 바로 종료됌.
			System.out.println("main ended");
			
		} catch(ArithmeticException e) { //예외 처리 블럭. 
			System.out.println("0으로 나눌 수 없음." + e);
			
		} finally { //생략 가능. 오류가 있든 없든 무조건 실행돼는 블럭.
			System.out.println("오류 상관없이 무조건 실행 ");
		}
		
	}

}
