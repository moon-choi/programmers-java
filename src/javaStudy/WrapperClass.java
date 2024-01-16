package javaStudy;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 5; //기본형 타입. 객체 아님.
		Integer i2 = new Integer(5); //[구] Wrapper class. 객체형 (참조)
		Integer i3 = 5; //[신] 위와 똑같음. 
		//숫자 5는 원래 기본형이지만 자동으로 Integer로 형변환 됌 (오토박싱)
		
		int i4 = i2.intValue(); //[구] 객체타입 -> 기본형타입으로 바꿔줌.
		int i5 = i3; //[신] 위와 똑같음. 
		//i3.intValue() 안 사용해도 자동으로 컴파일러가 객체 한겹 벗겨줌. (오토 언박싱)
	}

}
