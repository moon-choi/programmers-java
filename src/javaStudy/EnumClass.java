package javaStudy;

public class EnumClass {

	//상수선언 
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumClass.MALE; //static한 필드는 바로 클래스.메소드 
		gender1 = EnumClass.FEMALE;
		
		gender1 = "boy"; //오류가 안뜸. String은 아무값이나 할당 가능하기 때문에.
						//만약 gender1에 하나의 값만 들어가게 하고 싶다면? 열거형을 사용
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
//		gender2 = "boy"; //오류 뜸.
	}
}

enum Gender{
	MALE, FEMALE; //열거형은 특정값만 사용할 수 있음.
}
