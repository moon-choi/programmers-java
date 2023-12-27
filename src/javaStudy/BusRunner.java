package javaStudy;

public class BusRunner {

	public static void main(String[] args) {
		Bus bus = new Bus();
//		bus.drive(); //메소드 overriding.
//		bus.beep();
		
		Car car = new Car();
//		car.drive(); //부모 자신의 메소드.
		
//		car.beep(); //부모클래스는 자식의 메소드 사용 불가.
		
		Car c = new Bus(); //부모타입으로 자식을 가리킬수 (참조할수)는 있지만 
							//-> 부모타입으로 자식타입의 객체를 참조할 때: 묵시적 형변환 일어남.  
		c.drive();
//		c.beep(); //메소드는 자식 것 사용 불가. 이럴 때 형변환 씀.
		
//		Bus b = c; //에러 -> 부모타입 객체를 자식타입으로 참조하려면: 명시적 형변환 해줘야함.
		Bus b = (Bus) c; //형변환 
		b.beep(); //형변환 뒤 자식의 메소드 사용 가능해짐. 
		
	}

}
