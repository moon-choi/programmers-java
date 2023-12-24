package javaStudy;

public class ActionRunner {

	public static void main(String[] args) {
//		Action a = new MyAction(); //Action은 추상 클래스여서 객체가 생성 안됌. 
//									//그래서 자식 클래스 생성 
//		a.exec(); //자식이 가진 메소드 실행 
		
		//익명 클래스: 
		//굳이 상속받는 클래스가 없고 다른 데서 사용 안됄 때.
		//한번만 쓰고 말것이라서 굳이 MyAction 만들 필요가 없음.
		Action b = new Action() { 
			//생성자 다음에 오는 {중괄호}는 이름 없는 객체를 만든다는 것.
			//생성자 이름에 해당하는 클래스를 상속받은 이름없는 객체를 만듦. ***

			@Override
			public void exec() {
				System.out.println("exec 익명 클래스 ");
			}	
		};
		b.exec();
	}

}
