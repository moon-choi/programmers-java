package javaUtil;

public class Box2<E> { //generic으로 바꿈.
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj; //Setter: 값을 넣어주므로 리턴 불필요, 매개변수 필요  
	}

	public E getObj() {
		return obj; //Getter: 값을 꺼내와야 하므로 리턴 필요 
	}
}


//가상 클래스 E (Object를 받아들이는 부분을 모두 E라는 가상클래스로 변경함.)