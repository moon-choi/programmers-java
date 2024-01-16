package javaUtil;

import java.lang.reflect.Method;

public class MyHello2 {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		try {
			Method method = hello.getClass().getDeclaredMethod("hello"); //클래스에 대한 정보를 얻고 hello라는 메서드의 정보를 구하라.
			if(method.isAnnotationPresent(Count100.class)) { //특정 어노테이션이 메소드에 적용돼있는가  
				for(int i = 0; i < 3; i++) {
					hello.hello(); //어노테이션이 적용됐을 경우 세번 호출 
				}
			} else {
				hello.hello(); //어노테이션 적용 안됐을 경우 한번 호출 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
