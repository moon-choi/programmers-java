package javaStudy;

public class CarBMaker { //붕어빵 틀만 있다고 붕어빵이 생기는 것이 아님. 

	public static void main(String[] args) {
		CarB c3 = new CarB("police car");
		CarB c4 = new CarB("sports car");
		CarB c5 = new CarB();
		System.out.println(c3.name);
		System.out.println(c5.name);
		System.out.println(c5.number);
	}

}
