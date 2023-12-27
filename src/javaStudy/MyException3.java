package javaStudy;

public class MyException3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try { //try-catch로 오류처리.
			int k = divide(i, j);
			System.out.println(k);
		} catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
											//메소드 호출한 쪽에서 오류 처리하게 떠넘기기(try, catch)
	public static int divide(int i, int j) throws IllegalArgumentException { //메소드 
		if (j == 0) {						
			throw new IllegalArgumentException("0으로 나눌 수 없음."); //throw: 강제로 에러 발생시키기. 
		}			//IllegalArgumentExcepttion은 객체.
		int k = i / j;
		return k;
	}

}
