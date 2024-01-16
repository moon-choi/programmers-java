package javaUtil;

public class BoxRunner2 {

	public static void main(String[] args) {
		Box2<Object> box = new Box2<>();
		
		box.setObj(new Object());
		Object obj = box.getObj(); //여기까지 같음.
		
		Box2<String> box2 = new Box2<>();
//		box2.setObj(3); //스트링만 받을 수 있다고 위에서 정해서 컴파일 에러.
		box2.setObj("hello");
		String str = box2.getObj(); //이제는 리턴이 알아서 String으로 추천해줌. //형변환 불필요.
		System.out.println(str);
		
		Box2<Integer> box3 = new Box2<>();
		box3.setObj(4);
		int value = box3.getObj(); //형변환 불필요. 
		System.out.println(value);
	}

}
