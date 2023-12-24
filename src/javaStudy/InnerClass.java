package javaStudy;

public class InnerClass {

	class Cal{ //1. 인스턴스 클래스 (중첩 클래스)
				//필드를 선언하는 위치에 있는 내부 클래스. 
		int value = 0; //변수 
		public void plus() { //메소드 
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		InnerClass.Cal cal = ic.new Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
