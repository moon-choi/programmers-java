package javaUtil;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //Retention은 JVM이 실행시에 감지할 수 있는 Annotation
public @interface Count10 { //Annotation은 interface앞에 @ 붙이고 선언.

}

//Annotation을 실제로 사용하는 클래스: Myhello.java

/*
Annotaion: 
클래스는 모두 구조가 같다. 모두 필드와 메소드로 구성되어 있다. 
외관으로는 구분이 안되나 클래스의 목적은 제각기 다르다. 
그래서 개발자는 처리를 달리하고 싶은 대상에 어노테이션을 표시해 JVM에게 알려준다. 
 
https://lordofkangs.tistory.com/353
*/ 