package javaStudy;

public class StringClass {

	public static void main(String[] args) {
		String str1 = "hello"; //스트링은 클래스임에도 불구하고 new 키워드없이도 인스턴스 생성 가능. 
								//다른 클래스들은 항상 new 필요함.
								//상수 저장 영역의 메모리에 저장됌. (int num = 3 처럼).
		
		String str2 = "hello"; //str1과 같은 인스턴스를 가리키고 (참조하고) 있음.
		
		//new가 나오는 순간 상수영역에 만들지 않음.
		String str3 = new String("with new"); //heap 영역에 인스턴스를 만듦.
		String str4 = new String("with new"); //str3과 아예 다름.
		
 		if(str1 == str2) System.out.println("same reference");
		if(str1 != str3) System.out.println("different references");
		if(str3 != str4) System.out.println("different references");
		
		System.out.println(str1); //hello
		System.out.println(str1.substring(3)); //lo. 스트링의 메소드는 새로운 스트링을 만들어서 반환함.***
		System.out.println(str1); //hello (바뀌지 않음). 스트링 특징: 한번 생성됀 클래스의 내부값은 변하지않음.*** 
		
		str1 = str1.substring(3); 
		System.out.println(str1); //lo (바뀜)
		
	}

}
