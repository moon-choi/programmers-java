package javaUtil;

import java.util.ArrayList;
import java.util.List;

//리스트: 데이터 중복 가능, 순서 있음.
//저장공간이 필요에 따라 자유로움 (배열은 한번 생성하면 크기 변경 불가)
public class ListInterface {

	public static void main(String[] args) {
		
		//1. List로 객체생성 
		List<String> list = new ArrayList<>(); 
		//인터페이스므로 인스턴스가 됄수 없기에 List를 구현한 자료구조인 ArrayList 활용.
		
		//2. List에 값 저장 
		list.add("kim");
		list.add("kang");
		list.add("kim");

		System.out.println(list.size()); //.size는 부모 인터페이스 Collection 인 가진 메소드.
		//list는 값이 중복됄 수 있어서 3임.
				
		//인덱스 활용 가능하므로 for
		for(int i = 0; i < list.size(); i++) {
			//3. 저장된 값 꺼내오기 
			String str = list.get(i);
			System.out.println(str);
		}
	}

}

//list는 순서 있음. 데이터 중복 허용.