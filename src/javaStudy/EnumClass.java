package javaStudy;

public class EnumClass {

	//상수선언 (열거형 클래스 등장 전의 방법)
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumClass.MALE; //static한 필드는 객체 생성없이 바로 클래스.메소드 
		gender1 = EnumClass.FEMALE;
		
		gender1 = "boy"; //컴파일 시 오류가 안뜸. String은 아무값이나 할당 가능하기 때문에.
						//MALE, FEMALE 아닌 다른 값이 들어와도 받아들임.
						//만약 gender1에 하나의 값만 들어가게 하고 싶다면? 열거형을 사용
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy"; //열거형에서 언급되지 않은 값은 오류 뜸.
	}
}

//젠더 자체가 타입이 됌.
enum Gender{ //열거형 클래스 안에 쉼표로 구분해서 값 쭉 배치. 
	MALE, FEMALE; //열거형은 특정값만 가져다 사용할 수 있게끔 함.
}
