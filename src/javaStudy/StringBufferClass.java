package javaStudy;
//String은 자기자신이 변하지않는 클래스. StringBuffer는 자기 자신이 변하는 클래스.
public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");

		String str = sb.toString(); //toString 리턴타입은 스트링.
		System.out.println(str);

		StringBuffer sb2 = new StringBuffer(); //StringBuffer는 메소드 체이닝 쓸 수 있게 하는 클래스 
		StringBuffer sb3 = sb2.append("hello");
		
		System.out.println(sb2); //hello
		System.out.println(sb3); //hello

		//append 메소드는 자기 자신 this가 반환됌.
		//sb2이 반환됀 것을 sb3로 받아냄.
		//sb2, sb3 둘다 자기자신 반환. 
		//자기 자신을 계속 리턴하면서 값을 바꿔나가는 것.(메소드 체이닝)
		
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
										//StringBuffer 리턴 //SB리턴 //SB리턴 (자기자신이 계속 변하면서)
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString(); 
		//위의 4줄 코드를 1줄로 축약시킴^
		System.out.println(str2);
	}

}
