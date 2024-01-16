package javaUtil;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) { 
		//Set은 인터페이스라 인스턴스 됄 수 없으므로 구현클래스인 HashSet 활용.
		//String값으로 넣겠다.
		Set<String> set1 = new HashSet<>(); 
		//타입 		//변수 		//인스턴스 
		
		boolean flag1 = set1.add("kang"); //.add 리턴타입은 boolean.
		boolean flag2 = set1.add("kim"); //중복안돼면 true.
		boolean flag3 = set1.add("kang"); //중복돼면 false.
		
		System.out.println(set1.size()); //Set은 중복이 안돼므로 2개임.
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		//Iterator는 하나씩 꺼내보기 위한 인터페이스. String값이 있는 것을 꺼내겠다.
		Iterator<String> iter = set1.iterator(); //iterator 은 메소드. 객체 반환.
		
		//인덱스 없으므로 while문 
		while(iter.hasNext()) { //hasNext는 메소드. 있으면 true, 없으면 false. 
								//데이터가 있는 동안만 true를 리턴.
			String str = iter.next(); //next 메소드는 다음 값을 꺼내줌. 하나를 꺼내면 자동으로 다음 값을 참조. 
			System.out.println(str);
		}
		
	}

}

//set은 순서 없음. 데이터 중복 불허.
//https://joy-baek.tistory.com/20 
//Iterator를 쓰게 되면 어떤 컬렉션이라도 동일한 방식으로 접근이 가능하여 
//그 안에 있는 항목들에 접근할 수 있는 방법을 제공한다.(다형성) 