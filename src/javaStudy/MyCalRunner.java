package javaStudy;

public class MyCalRunner {

	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		//인터페이스			//클래스 
		cal.plus(1, 2);
		cal.multiply(2, 4);
		
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		Calculator.exec2(3, 4); 
		//스태틱 메소드는 cal.exec2 아니고 바로 인터페이스 이름.exec2 ***
		//참조변수(cal).exec2 로는 쓸 수 없음. 
	}

}
