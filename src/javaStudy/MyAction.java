package javaStudy;
 
public class MyAction extends Action { //자식 클래스

	@Override
	public void exec() {
		System.out.println("exec 자식 메소드 "); //추상 메소드를 자식 클래스 메소드에서 구현 

	}

}
