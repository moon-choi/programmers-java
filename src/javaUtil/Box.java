package javaUtil;

public class Box { // 객체 필드, 메소드 2 개 가진 클래스. 
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj; //Setter: 값을 넣어주므로 리턴 불필요, 매개변수 필요  
	}

	public Object getObj() { //리턴타입 Object
		return obj; //Getter: 값을 꺼내와야 하므로 리턴 필요 
	}
}
