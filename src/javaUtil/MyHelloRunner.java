package javaUtil;

import java.lang.reflect.Method;

public class MyHelloRunner {

	public static void main(String[] args) {
		MyHello mh = new MyHello();
		try {				//선언한 객체명.getClass.getDeclaredMethod("사용할함수명")
			Method myMethod = mh.getClass().getDeclaredMethod("helloMethod"); 
							//클래스에 대한 정보를 얻고 helloMethod라는 메서드의 정보를 구하라.
			
			if(myMethod.isAnnotationPresent(Count10.class)) { //특정 어노테이션이 메소드에 적용돼있는가  
				for(int i = 0; i < 10; i++) {
					mh.helloMethod(); //@Count10 어노테이션이 MyHello에 적용됐을 경우 열 번 호출 
				}
			} else {
				mh.helloMethod(); //@Count10 어노테이션이 MyHello에 적용 안됐을 경우 한 번 호출 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}

/*
Class 생성 방법 
1. 클래스 타입.class
2. 인스턴스.getClass()
3. Class.forName('풀 패키지 경로')
https://www.youtube.com/watch?v=RZB7_6sAtC4
*/
