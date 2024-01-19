package javaUtil;
			//객체를 생성할 때 <> 안에 타입 파라미터(Type parameter)를 지정.
public class Box2<E> { //generic으로 바꿈. //타입 미정 필드 1개, 메소드 2개 가진 클래스.
	private E el;
	
	public void setObj(E el) {
		this.el = el; //Setter: 값을 넣어주므로 리턴 불필요, 매개변수 필요  
	}

	public E getObj() {
		return el; //Getter: 값을 꺼내와야 하므로 리턴 필요 
	}
}

//가상 클래스 E (Object를 받아들이는 부분을 모두 E라는 가상클래스로 변경함.)

/* 제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다. 
한마디로 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것이다.
*/