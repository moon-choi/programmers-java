package javaUtil;

public class BoxRunner {

	public static void main(String[] args) {
		Box box = new Box();
		//타입 //변수 //인스턴스 
		
		box.setObj(new Object()); //빈 객체 생성
		Object obj = box.getObj();
		//타입 //변수  //인스턴스 //메소드
		
		box.setObj("hello"); //Object를 상속받은 모든 객체들 들어올 수 있음. Object는 모든 클래스의 부모클래스. 
		//(Box.java ->	public void setObj(Object obj) {...}로 정의함)
		String str = (String) box.getObj(); //방금 넣은 스트링을 꺼내려고 해도 getObj의 리턴이 객체타입이므로 자식의 메소드를 쓰려면 String으로 형변환해야함.
		System.out.println(str); //hello
		
		box.setObj(1);
		int num = (int)box.getObj();
		System.out.println(num); //1
		
		box.setObj(false);
		boolean bool = (boolean)box.getObj();
		System.out.println(bool); //false
	}

}
