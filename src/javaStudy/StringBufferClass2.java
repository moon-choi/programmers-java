package javaStudy;

public class StringBufferClass2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1); //hello world
		System.out.println(str2); // world
		
		String str3 = str1 + str2;
		System.out.println(str3); //hello world world
		
		//str1 + str2할 때 사실 내부적으로 일어나는 일:
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4); //str3과 결과 같음. //hello world world
		
		//한번 반복문 돌 때마다 new StringBuffer 불러냄.
		String str5 = "";
		for(int i = 0; i < 5; i++) {
			str5 = str5 + "*"; //직접 스트링을 연산함. 
			//String str5 = new StringBuffer().append("*")을 5번 반복.
		}
		System.out.println(str5);

		//위보다 더 경제적인 방법 
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 5; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}

}
