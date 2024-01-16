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
		InnerClass ic = new InnerClass(); //1. 바깥클래스 인스턴스화 
		InnerClass.Cal icCal = ic.new Cal(); //2. 내부클래스 인스턴스화 
		icCal.plus();
		System.out.println(icCal.value);

	}

}
