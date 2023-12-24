package javaStudy;

public class MyException2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j); //실제로 오류 처리하는 부분 
			System.out.println(k);
		} catch(ArithmeticException e) {
//			System.out.println(e.toString());
		}

	}

	//메소드 내에서 오류 처리하지 않고, 호출한 쪽에서 처리하게끔 오류를 떠넘김.
	//메소드 선언부 뒤쪽에 throws 를 표기.
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i / j;
		return k;
	}
}
