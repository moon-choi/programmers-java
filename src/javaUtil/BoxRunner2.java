package javaUtil;

public class BoxRunner2 {

	public static void main(String[] args) {
		Box2<Object> box = new Box2<>(); //<> 안은 Box2<E>에서 가상으로 지정한 변수의 타입.
		
		box.setObj(new Object()); //빈 객체 생성. 
		Object obj = box.getObj(); //여기까지 같음.
		
		Box2<String> box2 = new Box2<>(); //변수 문자열만 받음.
//		box2.setObj(3); //스트링만 받을 수 있다고 위에서 정해서 컴파일 에러.
		box2.setObj("hello");
		String str = box2.getObj(); //이제는 리턴이 알아서 String으로 추천해줌. 형변환 불필요.
		System.out.println(str); //hello
		
		Box2<Integer> box3 = new Box2<>(); //변수 숫자만 받음.
		box3.setObj(4);
		int value = box3.getObj(); //형변환 불필요. 
		System.out.println(value); //4
	}

}

