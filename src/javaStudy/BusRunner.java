package javaStudy;

public class BusRunner {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive(); //메소드 overriding.
//		bus.beep();
		
		Car car = new Car();
//		car.drive(); //부모 자신의 메소드.
		
//		car.beep(); //부모클래스는 자식의 메소드 사용 불가.
		
		Car c = new Bus(); //부모타입으로 자식을 가리킬수는 있지만  
		c.drive(); 
//		c.beep(); //메소드는 자식 것 사용 불가. 이럴 때 형변환 씀.
		
//		Bus b = c; //에러
		Bus b = (Bus) c; //형변환 
		b.beep(); //형변환 뒤 자식의 메소드 사용 가능해짐. 
		
	}

}
