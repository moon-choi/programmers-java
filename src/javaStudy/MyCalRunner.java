package javaStudy;

public class MyCalRunner {

	public static void main(String[] args) {
		
//		MyCal myCal = new MyCal();
//		System.out.println(myCal.plus(3, 3);
		
		Calculator cal = new MyCal();
		//타입: 인터페이스** //인스턴스: 클래스**  
		cal.plus(1, 2);
		cal.multiply(2, 4);
		
		cal.exec(5, 6); //가능
		
//		cal.exec2(3, 4); //에러 
		Calculator.exec2(3, 4); //가능 
		//스태틱 메소드는 cal.exec2 아니고 바로 인터페이스 이름 Calculator.exec2 ***
		//참조변수인 cal 사용해서 cal.exec2 로는 쓸 수 없음.
	}

}
