package javaUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map: 키 중복 불가능, 키 순서 없음. 구현클래스로는 HashMap이 있음.
//HashMap: 키 중복 불가능, 순서 없음. 
public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //map은 key, value가 쌍으로 저장돼어야 함.
		//인터페이스므로 인스턴스가 됄수 없기에 Map을 구현한 자료구조인 HashMap 활용.
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		map.put("001", "kang");
		
		System.out.println(map.size()); //key값은 중복 불가이므로 3.
		System.out.println(map.get("001")); //같은키로 값이 들어오면 나중에 들어온 값으로 바꿈.
		//.get(키 값)으로  꺼내기.
		
		Set<String> keys = map.keySet(); //모든 키값 꺼내는 메소드. key만 꺼내서 Set자료구조에 넣어줌. 
		Iterator<String> iter = keys.iterator(); //키를 이터레이터 형식으로 꺼냄.
		while(iter.hasNext()) { //데이터 있으면 true, 없으면 false. 
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}

/*
 Iterator: 반복자'로, 객체 지향 프로그래밍에서 배열과 같은 여러 개의 데이터의 집합으로 이루어진 자료구조를 순회하는 객체
 
 Iterator의 메소드 
 
	1. Iterator.hasNext()
	- Iterator 안에 다음 값이 들어있는지 확인
	- 들었으면 true, 안들었음 false

	2. Iterator.next()
	- Iterator의 다음 값 가져오기

	3. Iterator.remove()
	- iterator에서 next() 시에 가져왔던 값을 컬렉션(List, Set, Map) 등에서 삭제
	- 반드시 next() 후에 사용해야 함
	
	Iterator는 Collection 인터페이스를 구현한 객체에서 미리 정의돼있는 iterator()메소드를 호출해서 참조함.  
	
	Iterator<데이터타입> iterator명 = 컬렉션.iterator(); 로 정의하고 

	while(iterator명.hasNext()) {

		iterator.next();

	} 로 사용.
*/